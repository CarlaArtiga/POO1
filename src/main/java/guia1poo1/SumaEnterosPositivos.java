/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo1;

/**
 *
 * @author LENOVO
 */
import javax.swing.JOptionPane;
public class SumaEnterosPositivos {
    public static void main(String[] args) {
        //Declaramos estas variables de tipo string debido a que el cuadro de dialogo no admite numeros
        //Por lo que es necesario convertir de string a entero
        String primernumero;
        String segundonumero;
        
        //Variables que nos sirven para hacer una operacion
        int numero1;
        int numero2;
        int suma;
        
        primernumero = JOptionPane.showInputDialog("Digite el primero numero");
        segundonumero = JOptionPane.showInputDialog("Digite el segundo numero");
        
        //Conversion de tipo de datos string a enteros
        numero1 = Integer.parseInt(primernumero);
        numero2 = Integer.parseInt(segundonumero);
        
        
        //Operacion
        suma = numero1 + numero2;
        
        //El argumento resultados es el titulo del cuadro de dialogo
        //El cuarto argumento es un estilo del cuadro de dialogo
        //El operador suma es para concatenar
        if(numero1<=0 ||numero2<=0)
        {
            JOptionPane.showMessageDialog(null,"No se admiten numero negativos");
        
        }
        else{
            JOptionPane.showMessageDialog(null,"La suma es: "+suma,"Resultado",JOptionPane.PLAIN_MESSAGE);
        }
        
        
        
        
        
        System.exit(0);
       
    
    
    }
}
