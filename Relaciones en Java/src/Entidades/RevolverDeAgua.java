/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Random;

/**
 *
 * @author never
 */
public class RevolverDeAgua {
    private int posicionActual;
    private int posicionAgua;

    public void llenarRevolver() {
        Random rand = new Random();
        posicionActual = rand.nextInt(6); // 6 posiciones en el tambor
        posicionAgua = rand.nextInt(6); // El agua se coloca en una posición aleatoria
    }

    public boolean mojar() {
        return posicionActual == posicionAgua;
    }

    public void siguienteChorro() {
        posicionActual = (posicionActual + 1) % 6; // Pasar a la siguiente posición del tambor
    }

    @Override
    public String toString() {
        return "Revolver de agua -> Posición actual: " + posicionActual + ", Posición del agua: " + posicionAgua;
    }
}
