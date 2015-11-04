/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author aparracorbacho
 */
public class Cantidad {
    float num1, numOP;
    public void calcular(float num1I){
        num1 = num1I;
        numOP = num1I;
        if (numOP < 500) {
            numOP = numOP + (float)(numOP*0.5);
            System.out.println("La cantidad es: "+this.num1 +" El incremento es del 50% y la cantidad final es: "+numOP);
            
        }   else if (numOP>=500 && numOP<1000) {
            numOP = numOP + (float)(numOP*0.07);
            System.out.println("La cantidad es: "+this.num1 +" El incremento es del 7% y la cantidad final es: "+numOP);
        } else if (numOP>=1000 && numOP<5000) {
            numOP = numOP + (float)(numOP*0.15);
            System.out.println("La cantidad es: "+this.num1 +" El incremento es del 15% y la cantidad final es: "+numOP);
        }   else if (numOP>=5000){
            numOP = numOP - (float)(numOP*0.03);
            System.out.println("La cantidad es: "+this.num1 +" El decremento es del 3% y la cantidad final es: "+numOP);
        }     
    }
    
    
}
