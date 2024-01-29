package com.cc.java;

public class App {

    public static void main(String[] args) {
        Mitarbeiter mit1 = new Mitarbeiter("Mueller", "Frank", "CEO", 2021);
        Mitarbeiter mit2 = new Mitarbeiter("Schmidt", "Tim", "Buchhalter", 2020);
        Mitarbeiter mit3 = new Mitarbeiter("Mayer", "Peter", "Abteilungsleiter", 2019);

        output_mitarbeiter(mit1);
        output_mitarbeiter(mit2);
        output_mitarbeiter(mit3);


    }


    private static void output(String outStr) {
        System.out.println(outStr);
    }

    private static void output_mitarbeiter(Mitarbeiter mit) {
        output("Der Mitarbeiter " +
                mit.getInfo("#firstName") +
                " " +
                mit.getInfo("#familyName") +
                " arbeitet seit " +
                mit.getInfo("#yearOfEntry") +
                " als " +
                mit.getInfo("#role") +
                "!");
    }

};
