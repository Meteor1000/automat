package com.Selenium;

public class FabrykaCwiczenie {


    public static void main(String[] args) {
        Samochod samochod = FabrykaSamochodow.getSamochod(300);
        System.out.println(samochod.getClass() +", jego predkosc to: "+samochod.maxPredkosc());
    }
}

interface Samochod {
    int maxPredkosc();
}

class ParametrySamochodu {
    int cena = 0;
    String kolor = "czarny";
}

class Mercedes extends ParametrySamochodu implements Samochod {
    int maxPredkosc =100;
    @Override
    public int maxPredkosc() { return this.maxPredkosc; }
}

class BMW extends ParametrySamochodu implements Samochod {

    int maxPredkosc =200;
    @Override
    public int maxPredkosc() {  return this.maxPredkosc; }
}

class Audi extends ParametrySamochodu implements Samochod {
    int maxPredkosc =300;
    @Override
    public int maxPredkosc() { return this.maxPredkosc;}
}

class FabrykaSamochodow {

    public static Samochod getSamochod(int maxPredkosc) {
        Samochod auto = null;

        switch (maxPredkosc) {
            case 100:
                auto = new Mercedes();
                break;

            case 200:
                auto = new BMW();
                break;

            case 300:
                auto = new Audi();
                break;
        }

        return auto;
    }


}
