/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6araquel;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author raquel
 */
public class PruebaHospital {

    public static void main(String[] args) {

        //creacion del personal sanitario
        PersonalSanitario personal1 = new PersonalSanitario("16772815L", "Sandra", "López Martín", PersonalSanitario.Genero.MUJER);
        PersonalSanitario personal2 = new PersonalSanitario("27872028M", "José", "Fernandez Rodríguez", PersonalSanitario.Genero.HOMBRE);

        //creacion de doctores
        Doctor doctor1 = new Doctor("895643211", 30, "02404135Z", "Raul", "Sánchez", PersonalSanitario.Genero.HOMBRE);
        Doctor doctor2 = new Doctor("545214236", 42, "14486940E", "Elena", "Vega", PersonalSanitario.Genero.MUJER);

        //creacion de cirujanos
        Cirujano cirujano1 = new Cirujano(19, true, "256987451", 38, "95029684D", "Alba", "Fernandez", PersonalSanitario.Genero.MUJER);
        Cirujano cirujano2 = new Cirujano(8, true, "914980627", 40, "02820042X", "Marta", "Gutierrez", PersonalSanitario.Genero.MUJER);

        //creacion de medicos de familia
        MedicoDeFamilia medico1 = new MedicoDeFamilia(true, LocalDate.of(1998, Month.MARCH, 20), "579820136", 30, "64288082T", "Paco", "Molina", PersonalSanitario.Genero.HOMBRE);
        MedicoDeFamilia medico2 = new MedicoDeFamilia(false, LocalDate.of(2005, Month.APRIL, 2), "589663014", 37, "44712666E", "Carlos", "Guerrero", PersonalSanitario.Genero.HOMBRE);

        //lista de objetos de la superclase
        ArrayList<PersonalSanitario> personalHospital = new ArrayList<>();

        //añadir el personal sanitario a la lista
        personalHospital.add(personal1);
        personalHospital.add(personal2);

        //al añadir doctores, medicos y cirujanos se estan haciendo
        //conversiones implicitas
        personalHospital.add(doctor1);
        personalHospital.add(doctor2);

        personalHospital.add(cirujano1);
        personalHospital.add(cirujano2);

        personalHospital.add(medico1);
        personalHospital.add(medico2);

        //recorrer la lista
        for (PersonalSanitario personal : personalHospital) {

            //llamada de los metodos propios de cada clase
            //metodo B
            //conversion explicita
            if (personal instanceof Doctor) {
                ((Doctor) personal).cambiarHorasSegunLicencia();
            }

            //metodo C
            //conversion explicita
            if (personal instanceof Cirujano) {
                ((Cirujano) personal).anyoObtencionLicencia();
            }

            //metodo d
            //conversion explicita
            if (personal instanceof MedicoDeFamilia) {
                ((MedicoDeFamilia) personal).realizaLlamadas();
            }

            //metodo a de todos los objetos
            personal.ordenARealizar();

        }

        System.out.println("------------LISTA PERSONAL HOSPITAL-----------");
        for (PersonalSanitario p : personalHospital) {
            System.out.println(p);
        }

//        //uso de indexof, contains y remove
//        if (personalHospital.contains(medico2)) {
//            personalHospital.remove(personalHospital.indexOf(medico2));
//        }
//        //PRUEBAS-------------
//        //impimir doctores
//        System.out.println("Doctores:");
//        System.out.println(doctor1 + "\n" + doctor2);
//        //cambio de las horas segun el numero de licencia
//        doctor1.cambiarHorasSegunLicencia();
//        doctor2.cambiarHorasSegunLicencia();
//
//        //imprimir por pantalla para comprobar
//        System.out.println("Tras cambio de horas semanales");
//        System.out.println(doctor1 + "\n" + doctor2);
//
//        //imprimir cirujano
//        System.out.println(cirujano1);

        //año de obtencion de licencia
        System.out.println("El cirujano 1 obtuvo su licencia en el año " + cirujano1.anyoObtencionLicencia());

    }

}
