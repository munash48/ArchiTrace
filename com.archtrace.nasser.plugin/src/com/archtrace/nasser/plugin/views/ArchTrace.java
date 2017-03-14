package com.archtrace.nasser.plugin.views;

import java.util.ArrayList;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.core.runtime.IAdaptable;

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

	public void createPartControl(Composite parent) {
		parent.setSize(700, 400);

		GridLayout gridlayout = new GridLayout();
		gridlayout.numColumns = 6;
		gridlayout.makeColumnsEqualWidth = true;
		gridlayout.verticalSpacing = 10;
		final TabFolder tabFolder = new TabFolder(parent, SWT.BORDER_DOT| SWT.V_SCROLL| SWT.H_SCROLL);

		Rectangle clientArea = parent.getClientArea();

		tabFolder.setLocation(clientArea.x, clientArea.y);

		TabItem item = new TabItem(tabFolder, SWT.NONE| SWT.V_SCROLL| SWT.H_SCROLL);
		item.setText("Add | Delete Requirements");

		Group group1 = new Group(tabFolder, SWT.NONE | SWT.SCROLL_PAGE| SWT.V_SCROLL| SWT.H_SCROLL);

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

		Text deltexttab1 = new Text(group1, SWT.NONE | SWT.BORDER);
		deltexttab1.setSize(200, 64);
		deltexttab1.setLayoutData(gridlayoutdata);
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
		Label space6tab1 = new Label(group1, SWT.NONE);
		space6tab1.setText("       URID to Delete! ");
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
		Label space7tab1 = new Label(group1, SWT.NONE);
		space7tab1.setText("                        ");
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

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}

		});

		gridlayoutdata.horizontalIndent = 0;
		Button button2tab1 = new Button(group1, SWT.PUSH);

		button2tab1.setText("Save");
		button2tab1.setLayoutData(gridlayoutdata);

		Label space8tab1 = new Label(group1, SWT.NONE);
		space8tab1.setText("                        ");

		Button button3tab1 = new Button(group1, SWT.PUSH);

		button3tab1.setText("Delete!");
		button3tab1.setLayoutData(gridlayoutdata);
		
		Label space12tab1 = new Label(group1, SWT.NONE);
		space12tab1.setText("                        ");
		Button check3 = new Button(group1, SWT.RADIO);
		check3.setText("Full Auto");

		item.setControl(group1);
		/*
		 * End of tab one
		 * 
		 * 
		 * 
		 */
		
		
		GridLayout grid2layout = new GridLayout();
		grid2layout.numColumns = 5;
		grid2layout.makeColumnsEqualWidth = true;
		grid2layout.verticalSpacing =10;
		GridData grid2layoutdata = new GridData();
		grid2layoutdata.verticalSpan = 2;

		Group group2 = new Group(tabFolder, SWT.NONE);
		TabItem item2 = new TabItem(tabFolder, SWT.NONE);
		
		item2.setText("Add Batch Requirements | Componets");
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
		space7tab2.setText(" Browes for Componets XML  File ");
		space7tab2.setLayoutData(grid2layoutdata);
		
		Label space01tab2 = new Label(group2, SWT.NONE);
		space01tab2.setText("                                              ");
		space0tab2.setLayoutData(grid2layoutdata);
		
		
		Label space4tab2 = new Label(group2, SWT.NONE);
		space4tab2.setText("                                              ");
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
		Label space9tab2 = new Label(group2, SWT.NONE);
		space9tab2.setText("                                              ");
		space9tab2.setLayoutData(grid2layoutdata);
		
		Text Text1Tab1 = new Text(group2, SWT.NONE | SWT.BORDER);
		Text1Tab1.setSize(400, 64); 
		Text1Tab1.setLayoutData(grid2layoutdata);
		
		
		Label space10tab2 = new Label(group2, SWT.NONE);
		space10tab2.setText("                                              ");
		space10tab2.setLayoutData(grid2layoutdata);
		
		Label space03tab2 = new Label(group2, SWT.NONE);
		space03tab2.setText("                                              ");
		space03tab2.setLayoutData(grid2layoutdata);
		
		Text Text2Tab1 = new Text(group2, SWT.NONE | SWT.BORDER);
		Text2Tab1.setSize(400, 64); 
		Text2Tab1.setLayoutData(grid2layoutdata);
		
		Label space02tab2 = new Label(group2, SWT.NONE);
		space02tab2.setText("                                              ");
		space02tab2.setLayoutData(grid2layoutdata);
		
		
		Button button1tab2 = new Button(group2, SWT.PUSH);
	
		button1tab2.setText("                  Browse......              ");
		button1tab2.setLayoutData(grid2layoutdata);
		
		
		
		Label space11tab2 = new Label(group2, SWT.NONE);
		space11tab2.setText("                                              ");
		space11tab2.setLayoutData(grid2layoutdata);
		
		Label space12tab2 = new Label(group2, SWT.NONE);
		space12tab2.setText("                                              ");
		space12tab2.setLayoutData(grid2layoutdata);
		
		Button button2tab2 = new Button(group2, SWT.PUSH);
		button2tab2.setText("                  Browse......              ");
		button2tab2.setLayoutData(grid2layoutdata);
		
		
		
		
		
		
		item2.setControl(group2);
		
		/*
		 * 
		 * 
		 * End of tab two
		 * 
		 */

		

		Group group3 = new Group(tabFolder, SWT.NONE);
		TabItem item3 = new TabItem(tabFolder, SWT.NONE);
		item3.setText("Quick Fix RTMartrix ");
		group3.setLayout(gridlayout);

		Button bt3 = new Button(group3, SWT.PUSH);

		bt3.setBounds(clientArea.x + 10, clientArea.y + 10, 100, 32);
		bt3.setText("Button on tab 2");
		Text tt3 = new Text(group3, SWT.NONE | SWT.BORDER);
		tt3.setBounds(10, 85, 100, 32);

		Text rt3 = new Text(group3, SWT.NONE | SWT.BORDER);
		rt3.setBounds(10, 120, 100, 32);
		item3.setControl(group3);

		Group group4 = new Group(tabFolder, SWT.NONE);
		TabItem item4 = new TabItem(tabFolder, SWT.NONE);
		item4.setText("Preview RTMartrix ");
		group4.setLayout(gridlayout);

		Button bt4 = new Button(group4, SWT.PUSH);

		bt4.setBounds(clientArea.x + 10, clientArea.y + 10, 100, 32);
		bt4.setText("Button on tab 2");
		Text tt4 = new Text(group4, SWT.NONE | SWT.BORDER);
		tt4.setBounds(10, 85, 100, 32);

		Text rt4 = new Text(group4, SWT.NONE | SWT.BORDER);
		rt4.setBounds(10, 120, 100, 32);
		item4.setControl(group4);

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
