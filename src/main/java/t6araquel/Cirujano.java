/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6araquel;

/**
 *
 * @author raquel
 */
public class Cirujano extends Doctor {

    private int anyosExperiencia;
    private boolean trabajaEnPrivado;

    //-----------CONSTRUCTORES--------------
    public Cirujano(int anyosExperiencia, boolean trabajaEnPrivado, String numLicencia, double horasSemanales, String dni, String nombre, String apellidos, Genero genero) {
        super(numLicencia, horasSemanales, dni, nombre, apellidos, genero);
        this.anyosExperiencia = anyosExperiencia;
        this.trabajaEnPrivado = trabajaEnPrivado;
    }

    public Cirujano() {
        this.anyosExperiencia = PersonalSanitario.generaAleatorio(0, 20);
        this.trabajaEnPrivado = false;
    }

    //--------GETTERS Y SETTERS-----------------
    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }

    public boolean isTrabajaEnPrivado() {
        return trabajaEnPrivado;
    }

    public void setTrabajaEnPrivado(boolean trabajaEnPrivado) {
        this.trabajaEnPrivado = trabajaEnPrivado;
    }

    //---------HASH CODE & EQUALS----------------
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.anyosExperiencia;
        hash = 79 * hash + (this.trabajaEnPrivado ? 1 : 0);
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
        final Cirujano other = (Cirujano) obj;
        if (this.anyosExperiencia != other.anyosExperiencia) {
            return false;
        }
        if (this.trabajaEnPrivado != other.trabajaEnPrivado) {
            return false;
        }
        return true;
    }

    //-----------TO STRING------------
    @Override
    public String toString() {
        return "Cirujano{" + "anyosExperiencia=" + anyosExperiencia + ", trabajaEnPrivado=" + trabajaEnPrivado + '}';
    }

    //sobreescritura del metodo A
    @Override
    public void ordenARealizar() {
        System.out.println(this.getNombre() + " " + this.getApellidos() + ", acuda a la sala de operaciones");
    }

}
