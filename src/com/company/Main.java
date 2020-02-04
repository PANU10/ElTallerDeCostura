package com.company;

public class Main {
	// write your code her
        public static void main(String[] args) {
            Cesta cestaMagas = new Cesta(8);
            Cesta cestaCossos = new Cesta(5);
            Cosidor cosidorMangas = new Cosidor(cestaMagas, "Manga");
            Cosidor cosidorCuerpo = new Cosidor(cestaCossos, "Cuerpo");
            Ensamblador ensamblador = new Ensamblador(cestaMagas, cestaCossos, "Pieza");

            cosidorMangas.start();
            cosidorCuerpo.start();
            ensamblador.start();
        }

}
