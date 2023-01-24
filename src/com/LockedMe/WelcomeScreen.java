package com.LockedMe;

import java.awt.Color;
import java.util.Calendar;
import java.util.Scanner;

public class WelcomeScreen {

	public static void displayMenu() {

		System.out.println();
		System.err.println("  Please Select your choice");
		System.out.println(" 1- Display All the Files");
		System.out.println(" 2- Sup Menu options  { 1.Add - 2.Search - 3.Delete - Navigate }");
		/*
		 * System.out.println("   2.1- Add New File ");
		 * System.out.println("   2.2- Search for a file");
		 * System.out.println("   2.3- Delete a specific File");
		 * System.out.println("   2.4- Navigate to the Main Screen");
		 */
		System.out.println(" 3- Close The Application");
	}

	public static void supMenuOptions() {
		System.out.println("   2.1- Add New File ");
		System.out.println("   2.2- Search for a file");
		System.out.println("   2.3- Delete a specific File");
		System.out.println("   2.4- Navigate to the Main Screen");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" WELCOME TO LOCKEDME APPLICATION  ");
		System.out.println();
		System.out.println("DEVELOPER : Mohamed Ishak , Test Engineer at VOIS");

		// The options that will display to the user

		Scanner input = new Scanner(System.in);
		SpecifiedFilesDatabaseList database = new SpecifiedFilesDatabaseList();
		SpecifiedFiles sp = new SpecifiedFiles();
		int supOption = 0;

		while (true) {
			displayMenu();
			int choice = input.nextInt();

			switch (choice) {
			case 1:
				// Option 1
				// Display all the files names in ascending order
				// database.updateFiles(sp);
				if (database.displayAllFiles().size() == 0)
					System.out.println("No Files Are Added Yet");

				for (SpecifiedFiles f : database.displayAllFiles()) {
					System.out.println(f);
				}
				System.out.println();
				break;

			case 2:
				// Option 2
				// Nested switch Statement : enter the the matched character to select the
				// option
				// Add , Delete and Search => a user specified file or Navigate to the main

				if (choice == 2) {
					System.out.println(" Select from the Sub menu ");
					supMenuOptions();

				}

				while (true) {

					supOption = input.nextInt();

					switch (supOption) {
					case 1:
						// 1. Add New file to the list

						System.out.println("Enter file name");
						String fname = input.next();
						System.out.println("Enter file Directory");
						String fDirectory = input.next();
						System.out.println("Enter File id");
						int fId = input.nextInt();
						sp = new SpecifiedFiles(fname, fDirectory, fId);
						database.addFile(sp);
						System.out.println("File is added successfully");
						break;
					case 2:
						// 2. Search for a file in the list

						break;
					case 3:
						// 3. Delete a file in the list
						break;
					case 4:
						// 4. Navigate back to the main context
						displayMenu();
						break;

					}
					break;
				}

			case 3:
				// Option 3
				// Close the application
				System.out.println("Application is closed");
				System.exit(choice);

				input.close();
				break;

			default:
				break;
			}

		}
	}

}
