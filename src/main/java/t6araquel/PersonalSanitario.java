/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6araquel;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author raquel
 */
public class PersonalSanitario {

    private String dni;
    private String nombre;
    private String apellidos;

    public enum Genero {
        MUJER, HOMBRE
    };
    private Genero genero;

    //----CONSTRUCTORES--------
    public PersonalSanitario(String dni, String nombre, String apellidos, Genero genero) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
    }

    public PersonalSanitario() {
    }

    //-----GETTERS Y SETTERS--------
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    //-------HASH CODE & EQUALS---------
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.dni);
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + Objects.hashCode(this.apellidos);
        hash = 47 * hash + Objects.hashCode(this.genero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PersonalSanitario other = (PersonalSanitario) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (this.genero != other.genero) {
            return false;
        }
        return true;
    }

    //-------TO STRING-----------
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", genero=" + genero + '}';
    }

    //Metodo para generar un num aleatorio entre un min y un max
    public static int generaAleatorio(int min, int max) {
        Random random = new Random();
        int enteroAleatorio = random.nextInt(max - min + 1) + min;

        return enteroAleatorio;
    }
    
    //Metodo clase A que va a sobreescribirse en B,C y D
    public void ordenARealizar() {
        System.out.println(nombre + " " + apellidos + ", acuda al Centro de Salud");
    }

}
