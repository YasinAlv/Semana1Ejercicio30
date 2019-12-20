/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio30;

import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class Ejercicio30 {

    /**
     * Convertir una frase a mayúsculas o minúsculas, 
     * que daremos opción a que el usuario lo pida y mostraremos el resultado por pantalla
     * @param args
     */
    public static void main(String[] args) {
      
       Scanner Teclado = new Scanner(System.in);
       int opcion;
       String frase;
       char letra;
       
            System.out.println("Digite una frase: ");
            frase = Teclado.nextLine();
        do {
            
            System.out.println("Que desea hacer ahora: "
                    + "1) CONVERTIR A MAYUSCCULA "
                    + "2) convertir a minuscula "
                    + "3) Salir ");
            opcion = Teclado.nextInt();
            
            if(opcion==1){
            
            System.out.println(frase.toUpperCase());
            }
            
            else if(opcion==2){
            
            System.out.println(frase.toLowerCase());
            }

            else if(opcion!=3){
                System.out.println("Digite una opcion valida");
            }
        } while (opcion != 3);    
    }
}
