/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones.en.java;

import Entidades.Perro;
import Entidades.Persona;

/**
 *
 * @author never
 */
public class JavaRelaciones1 {
    public static void main(String[] args) {
        // Crear dos perros
        Perro perro1 = new Perro("Max", "Labrador", 3, "Grande");
        Perro perro2 = new Perro("Luna", "Chihuahua", 2, "Pequeño");

        // Crear dos personas
        Persona persona1 = new Persona("Juan", "Perez", 30, "12345678");
        Persona persona2 = new Persona("Maria", "Gomez", 25, "98765432");

        // Asignar perros a las personas
        persona1.adoptarPerro(perro1);
        persona2.adoptarPerro(perro2);

        // Mostrar información de las personas y sus perros
        System.out.println("Información de la Persona 1:");
        System.out.println(persona1.getInfoPersona());

        System.out.println("\nInformación de la Persona 2:");
        System.out.println(persona2.getInfoPersona());
    }
}
