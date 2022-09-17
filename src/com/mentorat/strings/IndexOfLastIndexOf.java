package com.mentorat.strings;

public class IndexOfLastIndexOf {
    public static void main(String[] args) {
        String text = "i love programming";

        System.out.println(text.charAt(2));

        // nu vreau char de pe 2
        // vreau UNDE ESTE 'l' -> sa imi dea 2
        System.out.println(text.indexOf("l"));
        System.out.println(text.indexOf("prog"));
        System.out.println(text.indexOf("love program"));

        System.out.println("-----");
        String t = "abracadabra";
        int a = t.indexOf("a");
        System.out.println(a); // prima pozitie
        int lastA = t.lastIndexOf("a");
        System.out.println(lastA);

        System.out.println(t.indexOf("x"));

        // doresc sa stiu daca un string contine litera 'g' de cel putin 2 ori
        // sigur, niciodata

    }
}
