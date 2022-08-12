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
public class LecturaConsola {
    
    public static void main(String[] args){
        //variable de tipo de scanner, es posible usarlo gracias al import
        Scanner reader  = new Scanner(System.in);
        //variable de tipo string y entero
        String nombre = "";
        int edad;
        
        //Salida 
        System.out.println("Ingrese su nombre: ");
        //Lectura de datos 
        nombre = reader.nextLine();
        //Salida o escritura
        System.out.println("Ingrese su edad: ");
        //Aqui cambia porque la lectura de datos no es de tipo cadena si no de tipo entero
        edad = reader.nextInt();
        
        
        
        
    }
    
}
