/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author aparracorbacho
 */
public class Ventas {
    float unidades, precio;
    public void calcular (float unidadesI, float precioI){
        unidades = unidadesI;
        precio = precioI;
        if (unidades<100){
            System.out.println("El numero de unidades es: "+unidades +" No hay descuento y el precio por unidades es: "+precio + " El precio a pagar es: "+(unidades*precio));
        } else if (unidades>=100 && unidades<200 && precio>=4000){
            System.out.println("El numero de unidades es: "+unidades +" El descuento es del 5% y el precio por unidades es :"+precio*0.95 +" El precio a pagar es: "+(unidades*precio*0.95));
        } else if (unidades>=100 && unidades<200 && precio<4000) {
            System.out.println("El numero de unidades es: "+unidades +" El descuento es del 2% y el precio por unidades es :"+precio*0.98 +" El precio a pagar es: "+(unidades*precio*0.98));
        } else if (unidades>=200 && precio>=4000){
            System.out.println("El numero de unidades es: "+unidades +" El descuento es del 10% y el precio por unidades es :"+precio*0.90 +" El precio a pagar es: "+(unidades*precio*0.90));
        } else {
            System.out.println("El numero de unidades es: "+unidades +" El descuento es del 8% y el precio por unidades es :"+precio*0.92 +" El precio a pagar es: "+(unidades*precio*0.92));
        }
        
    }
}
