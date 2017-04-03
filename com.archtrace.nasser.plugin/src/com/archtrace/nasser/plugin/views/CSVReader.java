package com.archtrace.nasser.plugin.views;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {

    public static void main(String[] args) {
    	int rowCount= 0;
    	
    	

        String csvFile = "D:/csv/country.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] requirement = line.split(cvsSplitBy);
                rowCount++;

                System.out.println( requirement[0] + "   " + requirement[1] + "   " + requirement[2] +" "+ rowCount);
              

            }
            
            
           
            
            
            
            

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        
        String[][] RequirMatrix = new String[rowCount][3];
        
        int i=0;
        while ((line = br.readLine()) != null) {

            // use comma as separator
            String[] requirement = line.split(cvsSplitBy);
            
            System.out.println("                               "+ requirement.length);
            
            
            	for(int j=0;j<3; j++){
            		RequirMatrix[i][j]=requirement[j];

            	}
            	
            	i++;
            	

         
        }
        
        for(int i2 =0; i2<i;i2++){
        	for(int j=0; j<3;j++){
        		System.out.print(RequirMatrix[i2][j] + "   ");
        		
        	}
        	System.out.println();
        	
        }
        
        br.close();
        
        String Line1 =" 09.098, Fast Download, Download 100 Mbps Per second\n";
        
        FileWriter pw= new FileWriter(csvFile, true);
        
        pw.append(Line1);
        
        pw.flush();
        pw.close();
        
        
        
        
        
        
        		
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        

    }

}