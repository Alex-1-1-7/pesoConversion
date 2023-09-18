
/*
Ejercicio 14: Hacer un programa
que pase de Kg a otra unidad de
medida de masa, mostrar en
pantalla un menú con las
opciones posibles.
*/
package pesoconversion;

import java.util.Scanner;


public class PesoConversion {

    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in); 
       final double libras = 2.20462f, gramos = 1000, miligramo = 1000000;
       // 1 kg equivale a 2.20462 libas y un kg equivale a 1000 gramos
       double kg, resul=0;
       int opc;
        System.out.println("Ingrese la cantidad de kg que queiere convertir: ");
        kg = teclado.nextDouble();
        System.out.println("Ingrese a que unidad de peso desea convertir los kg \n"
                + "1. Libras \n"
                + "2. Gramos \n"
                + "3. Miligramo");
        opc = teclado.nextInt();
        
        switch (opc){
                case 1: 
                    resul = kg * libras; 
                    break;
                case 2:
                    resul = kg * gramos;
                    break;
                case 3:
                    resul = kg * miligramo;
                    break;
                default: System.out.println("Se ha equivocado al elegir las opciones");          
                            
                    
        }
        System.out.println("el resultado de la conversion es: "+resul);
    }
    
}
