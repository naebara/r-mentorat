package com.mentorat.strings;

public class StartsEndsWith {
    public static void main(String[] args) {
        String x = "minge";

        // daca string se termina cu 'ge'
        System.out.println( x.charAt(x.length() - 1 )  == 'e' && x.charAt(x.length() - 2) == 'g' ? "da" : "nu" );


        // cu cat eu zic ca vreau mai multe in spate cu atat scrii mai mult
        // hai sa facem chestia asta mai usoara, daca se termina cu "ceva"

        System.out.println(x.endsWith("nfge") == true ? "da" : "nu");
        System.out.println(x.startsWith("n") == true ? "da" : "nu");
    }
}
