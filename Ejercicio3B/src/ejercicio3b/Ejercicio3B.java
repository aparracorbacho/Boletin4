/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3b;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Ejercicio3B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes, dias=0;
        System.out.println("Introduce el numero del mes ");
        Scanner mesTeclado = new Scanner(System.in);
        mes = mesTeclado.nextInt();
        switch(mes){
            
            case 1: dias=31; break;
            case 2: dias=28; break;
            case 3: dias=31; break;
            case 4: dias=30; break;     
            case 5: dias=31; break;
            case 6: dias=30; break;
            case 7: dias=31; break;
            case 8: dias=31; break;
            case 9: dias=30; break;
            case 10: dias=31; break;
            case 11: dias=30; break;
            case 12: dias=31; break; 
            default: System.out.println("No es un mes valido"); break;
            
        }
        System.out.println("El mes tiene "+dias +" dias");
    }
    
}
