package com.example.mislugares;

/**
 * Created by Raul on 09/04/2015.
 */
public class Principal {

    public static void main(String[] main) {
        Lugar lugar = new Lugar("Escuela Polit�cnica Superior de Gand�a",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)", -0.166093, 38.995656,
                962849300, "http://www.epsg.upv.es",
                "Uno de los mejores lugares para formarse.", 3);
        System.out.println("Lugar " + lugar.toString());
    }

}
