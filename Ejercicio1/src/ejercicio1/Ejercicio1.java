/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float num1;
        System.out.println("Introduce una cantidad");
        Scanner num1Teclado = new Scanner(System.in);
        num1 = num1Teclado.nextFloat();
        Cantidad calcular = new Cantidad();
        calcular.calcular(num1);
        
    }
    
}
