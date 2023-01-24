package com.LockedMe;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SpecifiedFiles {

	String fileName;
	String dirName;
	private int id;
	Calendar calendar;

	public SpecifiedFiles() {
	}

	public SpecifiedFiles(String fileName, String dirName, int id) {
		this.fileName = fileName;
		this.dirName = dirName;
		this.id = id;

	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getDirName() {
		return dirName;
	}

	public void setDirName(String dirName) {
		this.dirName = dirName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurruntDate() {
		calendar = Calendar.getInstance();
		SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyy hh:mm:ss");

		return date.format(calendar.getTime());
	}

	@Override
	public String toString() {
		return "SpecifiedFiles [" + " fileName : " + fileName + ", dirName : " + dirName + ", id : " + id
				+ ", Created Date : " + getCurruntDate() + "]";
	}

}
