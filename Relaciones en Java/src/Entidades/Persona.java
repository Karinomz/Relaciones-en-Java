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
public class Persona {
    String nombre;
    String apellido;
    int edad;
    String documento;
    Perro perro;

    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public void adoptarPerro(Perro perro) {
        this.perro = perro;
    }

    public String getInfoPersona() {
        String infoPerro = (perro != null) ? "\nPerro adoptado: " + perro.getInfoPerro() : "\nNo tiene perro adoptado.";
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", Documento: " + documento + infoPerro;
    }
}
