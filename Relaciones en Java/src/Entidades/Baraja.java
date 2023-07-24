/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author never
 */
public class Baraja {
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> maso;

    public Baraja() {
        cartas = new ArrayList<>();
        maso = new ArrayList<>();
        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};

        for (int numero = 1; numero <= 12; numero++) {
            for (String palo : palos) {
                cartas.add(new Carta(numero, palo));
            }
        }
    }
    
    public void barajar() {
        Collections.shuffle(cartas, new Random()); //cambia aleatoriamente el orden de los elementos de una lista
    }

    public Carta siguienteCarta() {
        if (!cartas.isEmpty()) {
            Carta carta = cartas.remove(0);
            maso.add(carta);
            return carta;
        } else {
            System.out.println("No quedan más cartas en la baraja.");
            return null;
        }
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public ArrayList<Carta> darCartas(int cantidad) {
        ArrayList<Carta> cartasADar = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Carta carta = siguienteCarta();
            if (carta != null) {
                cartasADar.add(carta);
            } else {
                System.out.println("No hay suficientes cartas disponibles para dar.");
                break;
            }
        }
        return cartasADar;
    }

    public void mostrarMaso() {
        if (maso.isEmpty()) {
            System.out.println("No ha salido ninguna carta hasta ahora.");
        } else {
            System.out.println("Cartas que han salido:");
            for (Carta carta : maso) {
                System.out.println(carta);
            }
        }
    }

    public void mostrarBaraja() {
        if (cartas.isEmpty()) {
            System.out.println("No quedan cartas en la baraja.");
        } else {
            System.out.println("Cartas en la baraja:");
            for (Carta carta : cartas) {
                System.out.println(carta);
            }
        }
    }
    
    
}
