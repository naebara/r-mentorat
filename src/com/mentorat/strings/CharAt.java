package com.mentorat.strings;

public class CharAt {
    public static void main(String[] args) {
        String x = "pere";

        // doresc sa aflu primul caracter.
        // o functie care iti da un caracter de
        // pe o anumita pozitie
        System.out.println(x.charAt(0));
        char prima = x.charAt(0);
        System.out.println(prima);

        System.out.println(x.charAt(20)); // error

        // index == pozitie, locatie

        System.out.println("finish");

        // length -> lungimea
        // charAt -> caractereul de pe o pozitie anume

        // Ai 2 stringuri -> afis lungimea totala ( a + b )
        // Ai un string -> afis ultimul caracter
    }
}
