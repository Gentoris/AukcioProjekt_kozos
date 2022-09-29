package hu.petrik.aukcioprojekt;

public class Main {

    public static void main(String[] args) {
        Festmeny festmeny = new Festmeny("Új festmény", "Gipsz Jakab", "futurizmus");
        // TODO: konzolalkalmazás elkészítése
        for (int i = 0; i < 100; i++) {
            festmeny.licit();
            System.out.println(festmeny.getLegmagasabbLicit());
        }
    }
}
