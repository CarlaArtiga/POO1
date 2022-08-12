/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo1;

/**
 *
 * @author LENOVO
 */
import java.util.*;
public class NumerosDivisibles {
    public static void main(String[] args) {
        //variables para operaciones
        int numero1;
        int numero2;
        
        
        //variable scanner
        Scanner reader  = new Scanner(System.in);
        
        //Titulo del programa
        System.out.println("*** Programa que verifica si son numeros divisibles entre si ***");
        
        //Pedir al usuario dos numeros
        
        System.out.print("Escriba el primero numero: ");
        numero1 = reader.nextInt();
        System.out.print("Escriba el segundo numero: ");
        numero2 = reader.nextInt();
        
        
       if(numero1%numero2==0){
           System.out.println(numero1 + " y " + numero2 + " son divisibles ");
           
       }
       else{
           System.out.println(numero1 + " y " + numero2 + " no son divisibles ");
       }
       System.exit(0);
        
        
    }
}
