package com.archtrace.nasser.plugin.views;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DBHelper Helper1 = new DBHelper();
		Helper1.doSomeThingAndLog();
		
		Requirement r1 = new Requirement();
		
		r1.URID = "U03R09x";
		r1.Feature="Security process";
		r1.Description="Use 2 step Athentication";
		
		Helper1.Save(r1);

	}

}
