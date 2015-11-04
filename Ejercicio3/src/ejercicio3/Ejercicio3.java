/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes;
        System.out.println("Introduce el numero del mes ");
        Scanner mesTeclado = new Scanner(System.in);
        mes = mesTeclado.nextInt();
        if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
            System.out.println("El mes tiene 31 dias");
        } else if (mes==4 || mes==6 || mes==9 || mes==11) {
            System.out.println("El mes tiene 30 dias");
        } else {
            System.out.println("El mes tiene 28 dias");
        }
    }
    
}
