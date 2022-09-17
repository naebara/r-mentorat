package com.mentorat.operatori;

public class Comparare {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        // > < >= <=
        // egalitate, inegalitate


        System.out.println(a > b);
        System.out.println(b > a);
        System.out.println(a >= b);
        System.out.println(b >= a);

        // produc tipuil de date : boolean

        // orice expresie poate fi salavata intr-o variabila

        boolean aIsGreaterThanB = a > b;
        System.out.println(aIsGreaterThanB);


        // egalitatea

        int c = 6;
        int f = 6;

        // daca sunt egale
        System.out.println(c  ==  f);
        boolean egale = c == f;

        // inegalitatea:
        System.out.println(c !=  f);


        // > >= < <= == !=


        // verifica daca ultima cifra a 2 numere sunt egale
        // a = 532
        // b = 122
        // true, false
    }
}
