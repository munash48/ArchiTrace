package com.archtrace.nasser.plugin.views;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JFileChooser;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view
 * shows data obtained from the model. The sample creates a dummy model on the
 * fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the
 * model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class ArchTrace extends ViewPart {

	@Override
	public void createPartControl(Composite parent) {
		parent.setSize(700, 400);

		GridLayout grid2layout = new GridLayout();
		grid2layout.numColumns = 6;
		grid2layout.makeColumnsEqualWidth = true;
		grid2layout.verticalSpacing = 10;
		GridData grid2layoutdata = new GridData();
		grid2layoutdata.verticalSpan = 2;
		final TabFolder tabFolder = new TabFolder(parent, SWT.BORDER_DOT
				| SWT.V_SCROLL | SWT.H_SCROLL);
		Group group2 = new Group(tabFolder, SWT.NONE);
		TabItem item2 = new TabItem(tabFolder, SWT.NONE);

		item2.setText("Set Working DIR | Files | Mode");
		group2.setLayout(grid2layout);

		grid2layoutdata.horizontalAlignment = GridData.FILL;
		Label space0tab2 = new Label(group2, SWT.NONE);
		space0tab2.setText("                                              ");
		space0tab2.setLayoutData(grid2layoutdata);

		Label space1tab2 = new Label(group2, SWT.NONE);
		space1tab2.setText(" Browes for Requirements File ");
		space1tab2.setLayoutData(grid2layoutdata);

		Label space2tab2 = new Label(group2, SWT.NONE);
		space2tab2.setText("                                              ");
		space2tab2.setLayoutData(grid2layoutdata);

		Label space3tab2 = new Label(group2, SWT.NONE);
		space3tab2.setText("                                              ");
		space3tab2.setLayoutData(grid2layoutdata);

		Label space7tab2 = new Label(group2, SWT.NONE);
		space7tab2.setText(" Browes for Components File ");
		space7tab2.setLayoutData(grid2layoutdata);

		Label space112tab2 = new Label(group2, SWT.NONE);
		space112tab2.setText(" Choose the Mode ");
		space112tab2.setLayoutData(grid2layoutdata);

		Label space01tab2 = new Label(group2, SWT.NONE);
		space01tab2.setText("                                              ");
		space0tab2.setLayoutData(grid2layoutdata);

		Label space4tab2 = new Label(group2, SWT.NONE);
		space4tab2.setText("                                 ");
		space4tab2.setLayoutData(grid2layoutdata);

		Label space5tab2 = new Label(group2, SWT.NONE);
		space5tab2.setText("                                              ");
		space5tab2.setLayoutData(grid2layoutdata);

		Label space6tab2 = new Label(group2, SWT.NONE);
		space6tab2.setText("                                              ");
		space6tab2.setLayoutData(grid2layoutdata);

		Label space8tab2 = new Label(group2, SWT.NONE);
		space8tab2.setText("                                              ");
		space8tab2.setLayoutData(grid2layoutdata);

		Button check1tab2 = new Button(group2, SWT.RADIO);
		check1tab2.setText("Full Manual");
		check1tab2.setLayoutData(grid2layoutdata);

		Label space9tab2 = new Label(group2, SWT.NONE);
		space9tab2.setText("Working Requirements File ");
		space9tab2.setLayoutData(grid2layoutdata);

		Text Text1Tab2 = new Text(group2, SWT.NONE | SWT.BORDER);
		Text1Tab2.setSize(400, 64);
		Text1Tab2.setLayoutData(grid2layoutdata);

		Label space10tab2 = new Label(group2, SWT.NONE);
		space10tab2.setText("                                   ");
		space10tab2.setLayoutData(grid2layoutdata);

		Label space03tab2 = new Label(group2, SWT.NONE);
		space03tab2.setText(" Working Componet Files");
		space03tab2.setLayoutData(grid2layoutdata);

		Text Text2Tab2 = new Text(group2, SWT.NONE | SWT.BORDER);
		Text2Tab2.setSize(400, 64);
		Text2Tab2.setLayoutData(grid2layoutdata);
		Button check2tab2 = new Button(group2, SWT.RADIO);
		check2tab2.setText("Semi Auto");
		check2tab2.setLayoutData(grid2layoutdata);

		Label space02tab2 = new Label(group2, SWT.NONE);
		space02tab2.setText("                                              ");
		space02tab2.setLayoutData(grid2layoutdata);

		Button button1tab2 = new Button(group2, SWT.PUSH);

		button1tab2.setText("                  Browse......              ");
		button1tab2.setLayoutData(grid2layoutdata);

		button1tab2.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser chooser = new JFileChooser();
				int answer = chooser.showOpenDialog(chooser);
				if (answer == JFileChooser.APPROVE_OPTION) {
					File file = chooser.getSelectedFile();
					Text1Tab2.setText(file.getAbsolutePath());
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}

		});

		Label space11tab2 = new Label(group2, SWT.NONE);
		space11tab2.setText("                                              ");
		space11tab2.setLayoutData(grid2layoutdata);

		Label space12tab2 = new Label(group2, SWT.NONE);
		space12tab2.setText("                                              ");
		space12tab2.setLayoutData(grid2layoutdata);

		Button button2tab2 = new Button(group2, SWT.PUSH);
		button2tab2.setText("                  Browse......              ");
		button2tab2.setLayoutData(grid2layoutdata);
		button2tab2.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser chooser = new JFileChooser();
				int answer = chooser.showOpenDialog(chooser);
				if (answer == JFileChooser.APPROVE_OPTION) {
					File file = chooser.getSelectedFile();
					Text2Tab2.setText(file.getAbsolutePath());
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}

		});
		Button check3tab2 = new Button(group2, SWT.RADIO);
		check3tab2.setText("Full Auto");

		item2.setControl(group2);

		/*
		 * Start of the tab
		 */

		GridLayout gridlayout = new GridLayout();
		gridlayout.numColumns = 6;
		gridlayout.makeColumnsEqualWidth = true;
		gridlayout.verticalSpacing = 10;

		Rectangle clientArea = parent.getClientArea();

		tabFolder.setLocation(clientArea.x, clientArea.y);

		TabItem item = new TabItem(tabFolder, SWT.NONE | SWT.V_SCROLL
				| SWT.H_SCROLL);
		item.setText("Add Requirements");

		Group group1 = new Group(tabFolder, SWT.NONE | SWT.SCROLL_PAGE
				| SWT.V_SCROLL | SWT.H_SCROLL);

		group1.setLayout(gridlayout);
		GridData gridlayoutdata = new GridData();

		Label label1tab1 = new Label(group1, SWT.NONE);
		label1tab1.setText("User Requirements ID            ");

		gridlayoutdata.horizontalAlignment = GridData.FILL;
		Text text1tab1 = new Text(group1, SWT.NONE | SWT.BORDER);
		text1tab1.setSize(200, 64);
		text1tab1.setLayoutData(gridlayoutdata);

		Label spacetab1 = new Label(group1, SWT.NONE);
		spacetab1.setText("                             ");

		Label space6tab1 = new Label(group1, SWT.NONE);
		space6tab1.setText(" Add Batch Requirements ");

		Label space5tab1 = new Label(group1, SWT.NONE);
		space5tab1.setText("                        ");
		Label space11tab1 = new Label(group1, SWT.NONE);
		space11tab1.setText(" Choose the Mode ");

		Label label2tab1 = new Label(group1, SWT.NONE);
		label2tab1.setText("UR Feature");

		Text text2tab1 = new Text(group1, SWT.NONE | SWT.BORDER);
		text2tab1.setSize(200, 32);
		text2tab1.setLayoutData(gridlayoutdata);

		Label space2tab1 = new Label(group1, SWT.NONE);
		space2tab1.setText("                        ");

		Text text4tab1 = new Text(group1, SWT.NONE | SWT.BORDER);
		text4tab1.setSize(200, 64);
		text4tab1.setLayoutData(gridlayoutdata);

		Label space4tab1 = new Label(group1, SWT.NONE);
		space4tab1.setText("                        ");
		Button check1 = new Button(group1, SWT.RADIO);
		check1.setText("Full Manual");

		Label label3tab1 = new Label(group1, SWT.NONE);
		label3tab1.setText("UR Description");

		gridlayoutdata.verticalSpan = 2;
		Text text3tab1 = new Text(group1, SWT.MULTI | SWT.BORDER);
		text3tab1.setSize(200, 64);
		text3tab1.setLayoutData(gridlayoutdata);

		Label space3tab1 = new Label(group1, SWT.NONE);
		space3tab1.setText("                        ");

		Button button4tab1 = new Button(group1, SWT.PUSH);

		button4tab1.setText(" Browse CSV ");
		button4tab1.setLayoutData(gridlayoutdata);

		button4tab1.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser chooser = new JFileChooser();
				int answer = chooser.showOpenDialog(chooser);
				if (answer == JFileChooser.APPROVE_OPTION) {
					File file = chooser.getSelectedFile();
					text4tab1.setText(file.getAbsolutePath());
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}

		});

		Label space13tab1 = new Label(group1, SWT.NONE);
		space13tab1.setText("                        ");
		Button check2 = new Button(group1, SWT.RADIO);
		check2.setText("Semi Auto");

		gridlayoutdata.verticalSpan = 0;
		gridlayoutdata.horizontalIndent = 50;
		Button button1tab1 = new Button(group1, SWT.PUSH);
		button1tab1.setText("Reset");
		button1tab1.setLayoutData(gridlayoutdata);
		button1tab1.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {

				text1tab1.setText("");
				text2tab1.setText("");
				text3tab1.setText("");
				text4tab1.setText("");
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e2) {
				// TODO Auto-generated method stub

			}

		});

		gridlayoutdata.horizontalIndent = 0;
		Button button2tab1 = new Button(group1, SWT.PUSH);

		button2tab1.setText("Save");
		button2tab1.setLayoutData(gridlayoutdata);

		button2tab1.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

				String csvFile1 = Text1Tab2.getText();
				System.out.println(csvFile1);

				String Line1 = text1tab1.getText() + "," + text2tab1.getText()
						+ "," + text3tab1.getText();

				FileWriter pw;
				try {
					pw = new FileWriter(csvFile1, true);

					pw.append(Line1);

					pw.flush();
					pw.close();

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}

		});

		Label space8tab1 = new Label(group1, SWT.NONE);
		space8tab1.setText("                        ");

		Button button3tab1 = new Button(group1, SWT.PUSH);

		button3tab1.setText("Add Batch");
		button3tab1.setLayoutData(gridlayoutdata);
		button3tab1.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

				int rowCount = 0;
				int rowCount2 = 0;
				int i = 0;
				String csvFile1 = Text1Tab2.getText();
				String csvFile2 = text4tab1.getText();
				String line = "";
				String cvsSplitBy = ",";

				try (BufferedReader br1 = new BufferedReader(new FileReader(
						csvFile2))) {

					while ((line = br1.readLine()) != null) {

						// use comma as separator
						String[] requirement = line.split(cvsSplitBy);
						rowCount++;

						System.out.println(requirement[0] + "   "
								+ requirement[1] + "   " + requirement[2] + " "
								+ rowCount);

					}

					try (BufferedReader br = new BufferedReader(new FileReader(
							csvFile2))) {

						String[][] RequirMatrix = new String[rowCount][3];

						while ((line = br.readLine()) != null) {

							// use comma as separator
							String[] requirement = line.split(cvsSplitBy);

							System.out
									.println("                               "
											+ requirement.length);

							for (int j = 0; j < 3; j++) {
								RequirMatrix[i][j] = requirement[j];

							}

							i++;

						}

						for (int i2 = 0; i2 < i; i2++) {
							for (int j = 0; j < 3; j++) {
								System.out.print(RequirMatrix[i2][j] + "   ");

							}
							System.out.println();

						}

						br.close();

					} catch (IOException e2) {
						e2.printStackTrace();
					}

					try (BufferedReader br = new BufferedReader(new FileReader(
							csvFile2))) {

						while ((line = br.readLine()) != null) {

							// use comma as separator

							if (rowCount2 != 0 & rowCount2 <= rowCount) {
								String ReqLine = line + "\n";

								FileWriter pw2 = new FileWriter(csvFile1, true);

								pw2.append(ReqLine);

								pw2.flush();
								pw2.close();

							}
							rowCount2++;

							String[] requirement = line.split(cvsSplitBy);

							System.out.println(requirement[0] + "   "
									+ requirement[1] + "   " + requirement[2]
									+ " " + rowCount2);

						}

					} catch (IOException e3) {
						e3.printStackTrace();
					}

				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}

		});

		Label space12tab1 = new Label(group1, SWT.NONE);
		space12tab1.setText("                        ");
		Button check3 = new Button(group1, SWT.RADIO);
		check3.setText("Full Auto");

		item.setControl(group1);
		/*
		 * End of tab one
		 */

		/*
		 * 
		 * 
		 * End of tab two
		 */
		GridLayout gridlayout1 = new GridLayout();
		gridlayout1.numColumns = 2;
		Group group3 = new Group(tabFolder, SWT.NONE);
		TabItem item3 = new TabItem(tabFolder, SWT.NONE);
		item3.setText("Quality Requirements View ");

		group3.setLayout(gridlayout1);

		Button button1tab3 = new Button(group3, SWT.PUSH);

		button1tab3.setBounds(clientArea.x + 10, clientArea.y + 10, 100, 32);
		button1tab3.setText("View Requirements");
		button1tab3.setAlignment(PROP_TITLE);

		button1tab3.addSelectionListener(new SelectionListener() {
			String[][] RequirMatrix;

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				String csvFile1 = Text1Tab2.getText();
				String line = "";
				String cvsSplitBy = ",";
				int rowCount3 = 0;
				int i = 0;

				try (BufferedReader br = new BufferedReader(new FileReader(
						csvFile1))) {

					while ((line = br.readLine()) != null) {

						// use comma as separator
						String[] requirement = line.split(cvsSplitBy);
						rowCount3++;

						System.out.println(requirement[0] + "   "
								+ requirement[1] + "   " + requirement[2] + " "
								+ rowCount3);

					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				RequirMatrix = new String[rowCount3][3];
				try (BufferedReader br = new BufferedReader(new FileReader(
						csvFile1))) {

					while ((line = br.readLine()) != null) {

						// use comma as separator
						String[] requirement = line.split(cvsSplitBy);

						for (int j = 0; j < 3; j++) {
							RequirMatrix[i][j] = requirement[j];

						}

						i++;

					}

					Table table = new Table(group3, SWT.MULTI | SWT.BORDER
							| SWT.FULL_SELECTION);
					table.setLinesVisible(true);
					table.setHeaderVisible(true);

					String[] titles = { "   UR_ID   ", "  Feature  ",
							"    Description   " };
					for (int i1 = 0; i1 < titles.length; i1++) {
						TableColumn column = new TableColumn(table, SWT.NONE);
						column.setText(titles[i1]);
					}

					for (int i2 = 0; i2 < i; i2++) {
						for (int j = 0; j < 3; j++) {
							System.out.print(RequirMatrix[i2][j] + "   ");

						}
						System.out.println();

					}

					for (int i2 = 0; i2 < i; i2++) {
						TableItem item1 = new TableItem(table, SWT.NONE);
						for (int j = 0; j < 3; j++) {

							item1.setText(j, RequirMatrix[i2][j] + " ");
						}
					}
					for (int i1 = 0; i1 < titles.length; i1++) {
						table.getColumn(i1).pack();
					}
					table.setSize(table.computeSize(SWT.DEFAULT, 200));

					br.close();

				} catch (IOException e2) {
					e2.printStackTrace();
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}

		});

		item3.setControl(group3);

		/*
		 * 
		 * 
		 * End of Tab3 start of tab4
		 */

		Group group4 = new Group(tabFolder, SWT.NONE);
		TabItem item4 = new TabItem(tabFolder, SWT.NONE);
		item4.setText("Componets View");
		group4.setLayout(gridlayout1);

		Button button1tab4 = new Button(group4, SWT.PUSH);

		button1tab4.setBounds(clientArea.x + 10, clientArea.y + 10, 100, 32);
		button1tab4.setText("View Component List");
		button1tab4.addSelectionListener(new SelectionListener() {

			String[][] ComponentMatrix;

			@Override
			public void widgetSelected(SelectionEvent e) {
				int rowCount3 = 0;
				String componetf = Text2Tab2.getText();
				String line = "";
				String cvsSplitBy = ",";
				System.out.println(componetf);
				// TODO Auto-generated method stub
				try (BufferedReader br = new BufferedReader(new FileReader(
						componetf))) {

					while ((line = br.readLine()) != null) {

						// use comma as separator

						rowCount3++;

						System.out.println(line.trim());

					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String[] selection1 = new String[rowCount3];
				int i = 0;
				try (BufferedReader br = new BufferedReader(new FileReader(
						componetf))) {

					while ((line = br.readLine()) != null) {

						// use comma as separator
						String tline = line.trim();

						if (tline.charAt(0) == 's' & tline.charAt(14) == 'n') {
							for (int j = 0; j < tline.length(); j++)
								if (tline.charAt(j) == ',') {
									selection1[i] = tline;
									i++;
								}
							System.out.println(tline);

						}

					}
					System.out
							.println(" \n\nSELECTED LINES ARE\n .................................... ");

					String[] csvline = new String[i];
					ComponentMatrix = new String[i][2];

					for (int j = 0; j < i; j++) {
						System.out.println(selection1[j]);

						int x1 = selection1[j].indexOf('"');
						int x2 = selection1[j].lastIndexOf('"');
						System.out.println(x1 + "  " + x2);
						csvline[j] = selection1[j].substring(x1 + 1, x2);
						System.out.println(csvline[j]);

					}

					for (int j = 0; j < i; j++) {
						String[] Component = csvline[j].split(cvsSplitBy);

						for (int k = 0; k < 2; k++) {

							ComponentMatrix[j][k] = Component[k];

						}
					}
					System.out
							.println(" \n\nmatrix formart\n.................................... ");
					for (int i2 = 0; i2 < i; i2++) {
						for (int j = 0; j < 2; j++) {
							System.out.print(ComponentMatrix[i2][j] + "   ");

						}
						System.out.println();

					}

					Table table = new Table(group4, SWT.MULTI | SWT.BORDER
							| SWT.FULL_SELECTION);
					table.setLinesVisible(true);
					table.setHeaderVisible(true);

					String[] titles = { "   UR_ID   ", "  Componet name ", };
					for (int i1 = 0; i1 < titles.length; i1++) {
						TableColumn column = new TableColumn(table, SWT.NONE);
						column.setText(titles[i1]);
					}

					for (int i2 = 0; i2 < i; i2++) {
						TableItem item1 = new TableItem(table, SWT.NONE);
						for (int j = 0; j < 2; j++) {

							item1.setText(j, ComponentMatrix[i2][j] + " ");
						}
					}
					for (int i1 = 0; i1 < titles.length; i1++) {
						table.getColumn(i1).pack();
					}
					table.setSize(table.computeSize(SWT.DEFAULT, 400));

				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}

		});

		item4.setControl(group4);

		/*
		 * 
		 * 
		 * End of Tab3 start of tab4
		 */

		Group group5 = new Group(tabFolder, SWT.NONE);
		TabItem item5 = new TabItem(tabFolder, SWT.NONE);
		item5.setText("Matrix Preview | Manual Mode");
		group5.setLayout(gridlayout1);

		Button button1tab5 = new Button(group5, SWT.PUSH);

		button1tab5.setBounds(clientArea.x + 10, clientArea.y + 10, 100, 32);
		button1tab5.setText("Genrate RTM");
		button1tab5.addSelectionListener(new SelectionListener() {
			String[][] ComponentMatrix;
			String[][] RequirMatrix;

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				int rowCount3 = 0;
				int rowCount4 = 0;
				String componetf = Text2Tab2.getText();
				String line = "";
				String cvsSplitBy = ",";
				System.out.println(componetf);
				// TODO Auto-generated method stub
				try (BufferedReader br = new BufferedReader(new FileReader(
						componetf))) {

					while ((line = br.readLine()) != null) {

						// use comma as separator

						rowCount3++;

						System.out.println(line.trim());

					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String[] selection1 = new String[rowCount3];
				int i = 0;
				rowCount3 = 0;
				try (BufferedReader br = new BufferedReader(new FileReader(
						componetf))) {

					while ((line = br.readLine()) != null) {

						// use comma as separator
						String tline = line.trim();

						if (tline.charAt(0) == 's' & tline.charAt(14) == 'n') {
							for (int j = 0; j < tline.length(); j++)
								if (tline.charAt(j) == ',') {
									selection1[i] = tline;
									i++;
									rowCount3++;
								}

						}

					}
					System.out
							.println(" \n\nSELECTED LINES ARE\n .................................... ");

					String[] csvline = new String[i];
					ComponentMatrix = new String[i][2];

					for (int j = 0; j < i; j++) {
						System.out.println(selection1[j]);

						int x1 = selection1[j].indexOf('"');
						int x2 = selection1[j].lastIndexOf('"');
						System.out.println(x1 + "  " + x2);
						csvline[j] = selection1[j].substring(x1 + 1, x2);
						System.out.println(csvline[j]);

					}

					for (int j = 0; j < i; j++) {
						String[] Component = csvline[j].split(cvsSplitBy);

						for (int k = 0; k < 2; k++) {

							ComponentMatrix[j][k] = Component[k];

						}
					}
					System.out
							.println(" \n\nmatrix formart\n.................................... ");
					for (int i2 = 0; i2 < i; i2++) {
						for (int j = 0; j < 2; j++) {
							System.out.print(ComponentMatrix[i2][j] + "   ");

						}
						System.out.println();

					}

				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				String csvFile1 = Text1Tab2.getText();

				try (BufferedReader br = new BufferedReader(new FileReader(
						csvFile1))) {

					while ((line = br.readLine()) != null) {

						// use comma as separator
						String[] requirement = line.split(cvsSplitBy);
						rowCount4++;

						System.out.println(requirement[0] + "   "
								+ requirement[1] + "   " + requirement[2] + " "
								+ rowCount4 + " hehe");

					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				RequirMatrix = new String[rowCount4][3];
				try (BufferedReader br = new BufferedReader(new FileReader(
						csvFile1))) {

					i = 0;

					while ((line = br.readLine()) != null) {

						// use comma as separator
						String[] requirement = line.split(cvsSplitBy);

						for (int j = 0; j < 3; j++) {
							RequirMatrix[i][j] = requirement[j];

						}

						i++;

					}

					Label title1 = new Label(group5, SWT.NONE);
					title1.setText("        COMPONENTS      ");
					Label title2 = new Label(group5, SWT.NONE);
					title2.setText("REUIREMENTS");

					Table table = new Table(group5, SWT.MULTI | SWT.BORDER
							| SWT.FULL_SELECTION);
					table.setLinesVisible(true);
					table.setHeaderVisible(true);

					String[] titles = new String[rowCount3 + 1];
					System.out.println(rowCount3);
					System.out.println(rowCount4);
					titles[0] = "   ";
					for (int i3 = 1; i3 < rowCount3 + 1; i3++)
						titles[i3] = ComponentMatrix[i3 - 1][1];

					for (int i1 = 0; i1 < titles.length; i1++) {
						TableColumn column = new TableColumn(table, SWT.NONE);
						column.setText(titles[i1]);
					}

					String marcher = "||||||||||||||";
					String holder = null;

					for (int i2 = 0; i2 < i; i2++) {
						TableItem item1 = new TableItem(table, SWT.NONE);
						int k=0;
						for (int j = 0; j < rowCount4; j++) {
							
							if (j == 0) {
								holder = RequirMatrix[i2][j];
								item1.setText(k, holder + " ");
								System.out.println(item1+ " inside if(j=0) of i2 & j " + i2 +" & "+ j);
								k++;
								continue;
							
							}
							
								for (int y = 0; y < rowCount3; y++) {
									if ((ComponentMatrix[y][0]).equalsIgnoreCase(RequirMatrix[i2][0])){
										
										holder = marcher;
										item1.setText(k, holder + " ");
										System.out.println(item1 +" inside if 2 of y & j "+ y +" & "+ j);
										k++;
										continue;
									}
										
									else {
										
										holder = "  ";
										item1.setText(k, holder + " ");
										System.out.println(item1+ " inside elseof y & j "+ y +" & "+ j);
										k++;
									}

								}

							
						}
					}
					for (int i1 = 0; i1 < titles.length; i1++) {
						table.getColumn(i1).pack();
					}
					table.setSize(table.computeSize(SWT.DEFAULT, 200));

					br.close();

				} catch (IOException e2) {
					e2.printStackTrace();
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}

		});

		item5.setControl(group5);

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
