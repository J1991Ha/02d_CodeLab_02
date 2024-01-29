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
        return switch (flag) {
            case "#familyName" -> this.familyName;
            case "#firstName" -> this.firstName;
            case "#role" -> this.role;
            case "#yearOfEntry" -> Integer.toString(this.yearOfEntry);
            default -> "unknown case";
        };
	}

}
