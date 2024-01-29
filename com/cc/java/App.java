package com.cc.java;

public class App {

	public static void main(String[] args) {
	Mitarbeiter mit1 = new Mitarbeiter("Mueller","Frank","CEO",2020);
	Mitarbeiter mit2 = new Mitarbeiter("Schmidt","Tim","CEO",2020);
	Mitarbeiter mit3 = new Mitarbeiter("Mayer","Peter","CEO",2020);

	output_mitarbeiter(mit1);
	output_mitarbeiter(mit2);
	output_mitarbeiter(mit3);


	}


	private static void output(String outStr) {
		System.out.println(outStr);
	}
	private static void output_mitarbeiter(Mitarbeiter mit){
		output("Der Mitarbeiter "+
		mit1.getInfo("#firstName")+
		" "+
		mit.getInfo("#familyName")+
		" arbeitet seit "+
		mit.getInfo("#yearofentry")+
		"als "+
		mit.getInfo("#role"));
	}

};
