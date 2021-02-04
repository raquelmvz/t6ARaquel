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
        
        
    }

}
