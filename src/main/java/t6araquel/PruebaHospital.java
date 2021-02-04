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
public class PruebaHospital {

    public static void main(String[] args) {
        //creacion del personal sanitario
        PersonalSanitario personal1 = new PersonalSanitario("16772815L", "Sandra", "López", PersonalSanitario.Genero.MUJER);

        //orden a realizar
        personal1.ordenARealizar();

        //creacion de doctor
        Doctor doctor1 = new Doctor("895643211", 30, "02404135Z", "Raul", "Sánchez", PersonalSanitario.Genero.HOMBRE);
        Doctor doctor2 = new Doctor("895643236", 42, "14486940E", "Elena", "Vega", PersonalSanitario.Genero.MUJER);

        //impimir doctores
        System.out.println("Doctores:");
        System.out.println(doctor1 + "\n" + doctor2);
        //cambio de las horas segun el numero de licencia
        doctor1.cambiarHorasSegunLicencia();
        doctor2.cambiarHorasSegunLicencia();

        //imprimir por pantalla para comprobar
        System.out.println("Tras cambio de horas semanales");
        System.out.println(doctor1 + "\n" + doctor2);

        //creacion de un cirujano
        Cirujano cirujano1 = new Cirujano(19, true, "256987451", 38, "95029684D", "Alba", "Fernandez", PersonalSanitario.Genero.MUJER);

        //imprimir cirujano
        System.out.println(cirujano1);

        //año de obtencion de licencia
        System.out.println("El cirujano 1 obtuvo su licencia en el año " + cirujano1.anyoObtencionLicencia());

        
    }

}
