package com.mentorat.strings;

public class EqualsToUpperToLower {
    public static void main(String[] args) {


        String codReducere = "MARE15";

        String userCode = "mic15";
        // noi sa transformaim in litere mari , mare15 -> MARE15



        // se aplica reducerea ?
        //1. trebuire sa vedem daca sunt la fel
        // tipuri de date primitive ==

        System.out.println(userCode.toUpperCase().equals(codReducere));
        System.out.println(userCode.toLowerCase());
        System.out.println(codReducere.equals(userCode));



        String text = "dArNic"; // String e immutable

        System.out.println(text.toUpperCase());
        System.out.println(text);
        System.out.println(text.toLowerCase());
        System.out.println(text);

        text = text.toUpperCase();
        System.out.println(text);


        // Ana ARE mERE -> x.toLowerCase()


    }
}
