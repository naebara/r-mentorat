package com.mentorat.strings;

public class Substring {
    public static void main(String[] args) {


        String text = "Ana are 40 de mere de la Mega Image";

        // string
        // o parte din el, substring
        // substring(x,y) - ia tot intre valori
        // substring(z) - ia tot pana la sfarsit

        int x = 5;
        System.out.println(text.substring(0, x));
        System.out.println(text.substring(7));

        // 1. Introducere
        // 2. Actiune
        // 2.1 Accidentul
        // 2.2 Spitalul


        // Ai un string, afiseaza ultimul cuvant
        // Stringul poate sa aiba n cuvinte


        int ultimulSpatiu = text.lastIndexOf(" ");
        System.out.println(text.substring( ultimulSpatiu + 1));


    }
}
