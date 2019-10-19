package com.Selenium;

public class Fabryka {

    public static void main(String[] args) {
        Zwierze zwierze = FabrykaZwierzat.getZwierze("miau");
        System.out.println(zwierze.getClass().toString());






    }
}

 class FabrykaZwierzat {


    public static Zwierze getZwierze(String glos) {
        Zwierze zwierze = null;

        switch (glos) {
            case "miau":
                zwierze = new Kot();
                break;

            case "hau":
                zwierze = new Pies();
                break;

            case "ihaha":
                zwierze = new Kon();
                break;
        }
        return zwierze;
    }
}

interface Zwierze {
    String dajGlos();
}

class Kot implements Zwierze {

    @Override
    public String dajGlos() {
        return "miau";
    }
}

class Pies implements Zwierze {

    @Override
    public String dajGlos() {
        return "hau";
    }
}

class Kon implements Zwierze {

    @Override
    public String dajGlos() {
        return "ihaha";
    }
}