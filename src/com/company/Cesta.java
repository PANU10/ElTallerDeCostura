package com.company;

public class Cesta {

    private int numPieza;
    private final int maxCapa;
    private boolean pieza;
    private boolean ocupado;

    public Cesta(int maxCapa) {
        this.maxCapa = maxCapa;
    }

    public synchronized void aniyadirPieza(){
        try {
            while(ocupado) wait();
            ocupado = true;
            if (numPieza < maxCapa) {
                this.numPieza +=1;
                pieza = true;
            }
            ocupado = false;
            notifyAll();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public synchronized void cogerPieza(){
        try {
            while(ocupado || !pieza) wait();
            ocupado = true;
            if (numPieza > 0) {
                numPieza--;
            }
            if(numPieza <= 0) pieza = false;

            ocupado = false;
            notifyAll();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public synchronized int getNumPieza() {
        return numPieza;
    }
}
