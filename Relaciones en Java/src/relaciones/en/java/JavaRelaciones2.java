/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones.en.java;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author never
 */
public class JavaRelaciones2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de jugadores (entre 1 y 6): ");
        int numJugadores = scanner.nextInt();
        scanner.close();

        if (numJugadores < 1 || numJugadores > 6) {
            numJugadores = 6; // Valor por defecto si el usuario ingresa un número inválido.
        }

        Juego juego = new Juego();
        ArrayList<Jugador> jugadores = new ArrayList<>();

        for (int i = 0; i < numJugadores; i++) {
            Jugador jugador = new Jugador();
            jugadores.add(jugador);
        }

        juego.llenarJuego(jugadores, new RevolverDeAgua());
        juego.revolver.llenarRevolver();
        System.out.println(juego.revolver);

        juego.ronda();
    }
}
