/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6araquel;

import java.time.LocalDate;
import java.time.Month;
import java.util.Objects;

/**
 *
 * @author raquel
 */
public class MedicoDeFamilia extends Doctor {

    private boolean realizaLlamadasACasa;
    private LocalDate fechaObtencionLicencia;

    //---------CONSTRUCTOR--------------
    public MedicoDeFamilia(boolean realizaLlamadasACasa, LocalDate fechaObtencionLicencia, String numLicencia, double horasSemanales, String dni, String nombre, String apellidos, Genero genero) {
        super(numLicencia, horasSemanales, dni, nombre, apellidos, genero);
        this.realizaLlamadasACasa = realizaLlamadasACasa;
        this.fechaObtencionLicencia = fechaObtencionLicencia;
    }

    public MedicoDeFamilia() {
        this.realizaLlamadasACasa = false;
        this.fechaObtencionLicencia = LocalDate.of(1990, Month.MARCH, 3);
    }

    //----------GETTERS Y SETTERS--------------
    public boolean isRealizaLlamadasACasa() {
        return realizaLlamadasACasa;
    }

    public void setRealizaLlamadasACasa(boolean realizaLlamadasACasa) {
        this.realizaLlamadasACasa = realizaLlamadasACasa;
    }

    public LocalDate getFechaObtencionLicencia() {
        return fechaObtencionLicencia;
    }

    public void setFechaObtencionLicencia(LocalDate fechaObtencionLicencia) {
        this.fechaObtencionLicencia = fechaObtencionLicencia;
    }

    //--------HASH CODE & EQUALS----------------
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.realizaLlamadasACasa ? 1 : 0);
        hash = 47 * hash + Objects.hashCode(this.fechaObtencionLicencia);
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
        final MedicoDeFamilia other = (MedicoDeFamilia) obj;
        if (this.realizaLlamadasACasa != other.realizaLlamadasACasa) {
            return false;
        }
        if (!Objects.equals(this.fechaObtencionLicencia, other.fechaObtencionLicencia)) {
            return false;
        }
        return true;
    }

    //----------TO STRING--------------
    @Override
    public String toString() {
        return "MedicoDeFamilia{" + "realizaLlamadasACasa=" + realizaLlamadasACasa + ", fechaObtencionLicencia=" + fechaObtencionLicencia + '}';
    }

}
