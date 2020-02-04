package com.company;

public class Cosidor extends Thread{

    public Cesta cesta;
    public String pieza;

    public Cosidor(Cesta cestaManigues, String pieza) {
        this.cesta = cestaManigues;
        this.pieza = pieza;
    }

    @Override
    public synchronized void run() {
        while (true){

            System.out.println ( "Costurero de " + pieza + ": añadiendo una pieza  *-*-*-*-*-*-*-*-*-");
            cesta.aniyadirPieza();
            System.out.println ( "Costurero de " + pieza + ": He añadido una pieza.");
        }
    }
}
