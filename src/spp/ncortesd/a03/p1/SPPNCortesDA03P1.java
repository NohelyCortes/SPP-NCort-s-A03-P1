/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ncortesd.a03.p1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SPPNCortesDA03P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora de Hipotenusa a partir de los catetos");
        // Declaración de Variables
        double CO, CA, HYP;
        
        Scanner kb = new Scanner (System.in);
        
        System.out.println("Introduce el Cateto Opuesto");
        CO= kb.nextDouble();
        System.out.println("Introduce el Cateto Adyacente");
        CA= kb.nextDouble();
        
        //Calculo de hipotenusa
        HYP = Math.sqrt (Math.pow(CO, 2)+ Math.pow (CA, 2));
        
        //Mostrar resultado
        
        System.out.println("Hipotenusa =" + HYP);
        
    }
    
}
