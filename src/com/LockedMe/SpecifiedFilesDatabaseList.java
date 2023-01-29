package com.LockedMe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SpecifiedFilesDatabaseList implements Comparator<SpecifiedFiles>{
	

	private List<SpecifiedFiles> files ;
	SpecifiedFiles FOF ;
	
	
	
	//Constructor to initialize the arrayList of files 
	public SpecifiedFilesDatabaseList() {
		   
		files = new ArrayList<>();	
	}
	
	// Adding New File in the list	 		
     public  void addNewFile(SpecifiedFiles sp) {
    	 files.add(sp);
     }
	
     // to display all the added files in the list
	public List<SpecifiedFiles> displayAllFiles() {
		
		return files ;
		}

	// to delete a a specific file using the file id 
	
	public boolean deleteFile(int id) {
		
		for (int i = 0; i < files.size(); i++) {
			
			if(files.get(i).getId() == id) {
				files.remove(files.get(i));
			    return true;
			}
		}
		
		return false ;
	}
	
	
	// to search for a file in the list with the file id
	public SpecifiedFiles getFileDetails(int id) {
		
		for (int i = 0; i < files.size(); i++) {
			if(files.get(i).getId() == id) {
				return files.get(i);
			}
		}

		return new SpecifiedFiles("File is not Found");
	       
			
	}
	
	public boolean addSpecifiedFile(SpecifiedFiles file) {
		
		
		return false;
	}


	@Override
	public int compare(SpecifiedFiles o1, SpecifiedFiles o2) {
		
		return o1.getFileName().compareTo(o2.getFileName());
	}





}
