/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float unidades, precio;
        System.out.println("Introduce la candidad de unidades");
        Scanner unidadesTeclado = new Scanner(System.in);
        unidades = unidadesTeclado.nextFloat();
        
        System.out.println("Introduce el precio de cada unidad");
        Scanner precioTeclado = new Scanner(System.in);
        precio = precioTeclado.nextFloat();
        
        Ventas vender = new Ventas();
        vender.calcular(unidades, precio);
    }
    
}
