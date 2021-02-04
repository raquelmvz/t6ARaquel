/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6araquel;

import java.util.Objects;

/**
 *
 * @author raquel
 */
public class Doctor extends PersonalSanitario {

    private String numLicencia;
    private double horasSemanales;

    //------CONSTRUCTORES------
    public Doctor(String numLicencia, double horasSemanales, String dni, String nombre, String apellidos, Genero genero) {
        super(dni, nombre, apellidos, genero);
        this.numLicencia = numLicencia;
        this.horasSemanales = horasSemanales;
    }

    public Doctor() {
        this.numLicencia = "000000000";
        this.horasSemanales = 40;
    }

    //------GETTERS Y SETTERS------
    public String getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }

    public double getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(double horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    //------HASHCODE & EQUALS-------------
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.numLicencia);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.horasSemanales) ^ (Double.doubleToLongBits(this.horasSemanales) >>> 32));
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
        final Doctor other = (Doctor) obj;
        if (Double.doubleToLongBits(this.horasSemanales) != Double.doubleToLongBits(other.horasSemanales)) {
            return false;
        }
        if (!Objects.equals(this.numLicencia, other.numLicencia)) {
            return false;
        }
        return true;
    }

    //------TOSTRING----------------
    @Override
    public String toString() {
        return "Doctor{" + "numLicencia=" + numLicencia + ", horasSemanales=" + horasSemanales + '}';
    }

}
