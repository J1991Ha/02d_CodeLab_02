package com.cc.java;

public class Mitarbeiter {
	
	private String familyName ;
	private String firstName;
	private String role ;
	private int yearOfEntry ;
	
	public Mitarbeiter(String familyName, String firstName, String role, int yearOfEntry) {
		this.familyName = familyName;
		this.firstName = firstName;
		this.role = role;
		this.yearOfEntry = yearOfEntry;
	}


	public String getInfo(String flag) {
     switch (flag) {
    case "#familyName" : return this.familyName;
    case "#firstName" : return this.firstName;
    case "#role"    : return this.role;
    case "#yearOfEntry" : return  Integer.toString(this.yearOfEntry);
	default : return "unknown case";
}
	}

}
