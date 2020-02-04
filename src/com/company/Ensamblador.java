package com.company;

public class Ensamblador extends Thread {

    private Cesta cestaMangas;
    private Cesta cestaCuerpo;
    private String pieza;

    public Ensamblador(Cesta cestaMangas, Cesta cestaCuerpo, String pieza) {
        this.cestaMangas = cestaMangas;
        this.cestaCuerpo = cestaCuerpo;
        this.pieza = pieza;
    }

    @Override
    public synchronized void run() {
        for(;;){
            cestaMangas.cogerPieza();
            cestaCuerpo.cogerPieza();
            System.out.println("Costurero de " + pieza + " => he hecho un jersey");
        }
    }
}
