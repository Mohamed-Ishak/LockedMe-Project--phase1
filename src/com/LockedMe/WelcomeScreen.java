package com.LockedMe;

import java.util.Calendar;
import java.util.Scanner;

public class WelcomeScreen {

	
	
	public static void displayMenu() {

		System.out.println();
		System.err.println("  Please Select your choice");
		System.out.println("1- Display All the Files");
		System.out.println("2- Add New File ");
		System.out.println("3- Search for a file");
		System.out.println("4- Delete a specific File");
		System.out.println("5- Navigate to the Main Screen");
		System.out.println("6- Close The Application");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" WELCOME TO LOCKEDME APPLICATION  ");
		System.out.println();
		System.out.println("DEVELOPER : Mohamed Ishak , Test Engineer at VOIS");
		

		
		//The options that will display to the user
	    	
		Scanner input = new Scanner(System.in);
		SpecifiedFilesDatabaseList database = new SpecifiedFilesDatabaseList();
		SpecifiedFiles sp = new SpecifiedFiles() ;
		
	
		while(true) {
			displayMenu();
			int choice = input.nextInt();
		switch (choice) {
		case 1:
			//Option 1
			//Display all the files names in ascending order
			//database.updateFiles(sp);
			if(database.displayAllFiles().size() == 0)
				System.out.println("No Files Are Added Yet");
			
				
			for (SpecifiedFiles f : database.displayAllFiles()) {
				System.out.println(f);
			}
			System.out.println();
			break;
			
		case 2:
			//Option 2
			//Add , Delete and Search => a user specified file or Navigate to the main Context 
		
					System.out.println("Adding New file is selected");
				//Adding files logic
		
			     System.out.println("Enter file name");
                  String fname = input.next();
                  System.out.println("Enter file Directory");
                  String fDirectory= input.next() ;
                  System.out.println("Enter File id");
                  int fId = input.nextInt();
                  Calendar cl ;
                  
                   
                  sp = new SpecifiedFiles(fname,fDirectory,fId);
                  database.addFile(sp);
                  System.out.println("File is added successfully");
                  
                  
				
				
	
				
			//1. Add New file to the list
			//2. Delete a file in the list
			//3. Search*/
			break;
			
		case 3:
			//Option 3
			//Close the application
			break;

		default:
			break;
		}

	}
  }

}
