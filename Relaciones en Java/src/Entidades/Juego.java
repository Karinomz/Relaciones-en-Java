/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author never
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    public RevolverDeAgua revolver;

    public Juego() {
        jugadores = new ArrayList<>();
        revolver = new RevolverDeAgua();
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {
        this.jugadores = jugadores;
        revolver = r;
    }

    public void ronda() {
        int numJugadores = jugadores.size();
        int indiceJugadorActual = 0;

        while (true) {
            Jugador jugadorActual = jugadores.get(indiceJugadorActual);
            boolean finDelJuego = jugadorActual.disparo(revolver);

            if (finDelJuego || jugadorActual.estaMojado()) {
                break;
            }

            indiceJugadorActual = (indiceJugadorActual + 1) % numJugadores;
        }

        for (Jugador jugador : jugadores) {
            if (jugador.estaMojado()) {
                System.out.println("\n¡¡¡Fin del juego!!! " + jugador + " se ha mojado.");
                break;
            }
        }
    }
}
