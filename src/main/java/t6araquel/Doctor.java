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

    //sobreescritura del metodo A
    @Override
    public void ordenARealizar() {
        System.out.println(this.getNombre() + " " + this.getApellidos() + ", pase consulta en la planta 3");
    }

    //metodo B que sólo exista en la clase B -- no va a estar sobreescrito
    //si los dos ultimos digitos de la licencia son 11 se asignan 35 horas semanales
    //en otro caso se mantiene le valor original
    public void cambiarHorasSegunLicencia() {
        //para obtener los dos ultimos digitos
        String dosDigitos = numLicencia.substring(numLicencia.length() - 2);

        if (dosDigitos.equals("11")) {
            this.horasSemanales = 35;
        }

    }

}
