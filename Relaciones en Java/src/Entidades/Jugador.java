/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author never
 */
public class Jugador {
   private static int contador = 1;
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
        id = contador++;
        nombre = "Jugador " + id;
    }

    public boolean disparo(RevolverDeAgua r) {
        System.out.println(nombre + " se apunta con el revolver de agua.");
        if (r.mojar()) {
            mojado = true;
            System.out.println("¡¡¡AGUA!!! "+"[" + nombre + "]"+" se ha mojado.");
            return true;
        } else {
            System.out.println("¡Click! A "+"[" + nombre + "]"+" le ha tocado un tambor vacío.");
            System.out.println("");
            r.siguienteChorro();
            return false;
        }
    }

    public boolean estaMojado() {
        return mojado;
    }

    @Override
    public String toString() {
        return nombre;
    } 
}
