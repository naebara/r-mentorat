package com.mentorat.strings;

public class Concat {
    public static void main(String[] args) {
        String nume = "Gal";
        String prenume = "Marian";

        // nume.prenume@gmail.com

        System.out.println(nume.toLowerCase() + "." + prenume.toLowerCase() + "@gmail.com");
        System.out.println(nume.concat(".").concat(prenume).concat("@gmail.com"));

        String c = nume.concat(".").concat(prenume).concat("@gmail.com");

        System.out.println(c);
    }
}
