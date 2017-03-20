package com.archtrace.nasser.plugin.views;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBHelper {
	// use the classname for the logger, this way you can refactor
	private final static Logger LOGGER = Logger
			.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public DBHelper() throws SQLException{
		
		try {
			MyLogger.setup();

		} catch (IOException e) {
			LOGGER.severe(e.toString());
			e.printStackTrace();
			throw new RuntimeException("Problems with creating the log files");
		}
		
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection connection = null;
		try {
			// create a database connection
			connection = DriverManager
					.getConnection("jdbc:sqlite:target/Archtrace.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30); // set timeout to 30 sec.

			try {
				ResultSet x = statement
						.executeQuery("SELECT * FROM requirements");
			} catch (SQLException es) {
				LOGGER.severe(es.toString());
				System.out.println(es);
				statement
						.executeUpdate("create table requirements (URID integer, Feature string, Description string)");

			}
		} finally {
			connection.close();

		}

		
	}
	

	public void doSomeThingAndLog() {
		// ... more code

		// now we demo the logging

		// set the LogLevel to Severe, only severe Messages will be written
		LOGGER.setLevel(Level.SEVERE);

		// set the LogLevel to Info, severe, warning and info will be written
		// finest is still not written
		LOGGER.setLevel(Level.INFO);

	}



	static void Save(Requirement r) throws SQLException {
		try (Connection connection1 = DriverManager
				.getConnection("jdbc:sqlite:target/Archtrace.db");) {
			if (connection1 != null) {

				String sql1 = "SELECT * FROM requirements where URID=?";

				PreparedStatement pstm1 = connection1.prepareStatement(sql1);
				pstm1.setString(1, r.URID);
				ResultSet rs1 = pstm1.executeQuery();

				if (rs1.next() & r.URID != null) {

					final String sql = "UPDATE requirements SET Feature =?, Description =? WHERE URID = ?";
					try {

						PreparedStatement pstm = connection1
								.prepareStatement(sql);

						pstm.setString(1, r.Feature);
						pstm.setString(2, r.Description);
						pstm.setString(3, r.URID);
						pstm.executeUpdate();
						
						LOGGER.severe(" Update was successfully  done " + r.toString());


						try (ResultSet rs = pstm.getGeneratedKeys()) {
							rs.next();
							r.URID = rs.getString(1);
						}

					} catch (Exception e) {
						LOGGER.severe("failed 2 to update : " + e.toString());
					}

				}

				else {

					final String sql = "INSERT INTO requirements (URID,Feature,Description) VALUES (?,?,?)";
					try {

						PreparedStatement pstm = connection1.prepareStatement(
								sql, Statement.RETURN_GENERATED_KEYS);

						pstm.setString(1, r.URID);
						pstm.setString(2, r.Feature);
						pstm.setString(3, r.Description);
						pstm.executeUpdate();

						LOGGER.severe(" Saving  was successfully  done "+ r.toString());

						try (ResultSet rs = pstm.getGeneratedKeys()) {
							rs.next();
							r.URID = rs.getString(1);
						}

					} catch (Exception e) {
						LOGGER.severe("failed to Save: " + e.toString());
					}

				}

			}
			connection1.close();

		} catch (SQLException ex) {
			LOGGER.severe("connection not made " + ex.toString());
		} finally {

		}

	}

	public static void Delete(Requirement r) throws SQLException {
		if (r.URID != null) {
			final String sql = "DELETE FROM requirements WHERE URID =?";
			try (Connection connection2 = DriverManager
					.getConnection("jdbc:sqlite:target/Archtrace.db");) {

				PreparedStatement pstm = connection2.prepareStatement(sql);
				if (connection2 != null) {

					pstm.setString(1, r.URID);
					pstm.execute();
					LOGGER.severe(" Delete was successfully  done " + r.toString());

				}
				connection2.close();
			}

		}
	}

}