/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones.en.java;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;

/**
 *
 * @author never
 */
public class JavaRelaciones3 {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();

        baraja.barajar();
        System.out.println("Se ha barajado la baraja.");

        System.out.println("Cartas disponibles en la baraja: " + baraja.cartasDisponibles());

        ArrayList<Carta> cartasRepartidas = baraja.darCartas(10);
        System.out.println("Se han repartido " + cartasRepartidas.size() + " cartas.");

        baraja.mostrarMaso();

        System.out.println("Mostrando la baraja:");
        baraja.mostrarBaraja();

        Carta siguienteCarta = baraja.siguienteCarta();
        if (siguienteCarta != null) {
            System.out.println("Siguiente carta: " + siguienteCarta);
        }

        System.out.println("Cartas disponibles en la baraja: " + baraja.cartasDisponibles());
    }
}
