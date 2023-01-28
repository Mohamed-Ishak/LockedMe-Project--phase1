package com.LockedMe;

import java.util.ArrayList;
import java.util.List;

public class SpecifiedFilesDatabaseList {
	

	private  List<SpecifiedFiles> files ;

	
	public SpecifiedFilesDatabaseList() {
		   
		files = new ArrayList<>();
		
	}
	
		 		
     public  void addFile(SpecifiedFiles sp) {
    	 files.add(sp);
     }
	
	public List<SpecifiedFiles> displayAllFiles() {
		
		return files ;
		}
	
	
	public boolean updateFiles(SpecifiedFiles sp) {
		
		for (int i = 1; i < files.size(); i++) {
			
			if(files.get(i).getId() == sp.getId()) {
			files.set(i, sp);
			return true ;
			}
				
		}
		return false;
	}
	
	public boolean deleteFile(int id) {
		
		for (int i = 0; i < files.size(); i++) {
			
			if(files.get(i).getId() == id) {
				files.remove(files.get(i));
			    return true;
			}
		}
		
		return false ;
	}
	
	public SpecifiedFiles getFileDetails(int id) {
		
		for (int i = 0; i < files.size(); i++) {
			if(files.get(i).getId() == id) {
				return files.get(i);
			}
		}
		return null;
	}
	
	public boolean addSpecifiedFile(SpecifiedFiles file) {
		
		
		return false;
	}

}
