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
public class Comparación {
    public static void main(String[] args) {
        
        //variables
        String primernumero;
        String segundonumero;
        String resultado;
        
        int numero1;
        int numero2;
        
        primernumero = JOptionPane.showInputDialog("Escriba el primero numero");
        segundonumero = JOptionPane.showInputDialog("Escribra el segundo numeri");
        
        numero1 = Integer.parseInt(primernumero);
        numero2 = Integer.parseInt(segundonumero);
        
        resultado = "";
        
        if(numero1 == numero2){
            resultado = resultado + numero1 + " == " + numero2;
            
        }
        if(numero1!=numero2){
            resultado = resultado + numero1 + " != " + numero2;
            
        }
        if(numero1<numero2){
            resultado = resultado + numero1 + " < " + numero2;
        }
        if(numero1>numero2){
            resultado = resultado + numero1 + " > " + numero2;
        }
        if(numero1<=numero2){
            resultado = resultado + numero1 + " <= " + numero2;
        }
        if(numero1>=numero2){
            resultado = resultado + numero1 + " >= " + numero2;
        }
        JOptionPane.showConfirmDialog(null, resultado,"Resultado de la comparacion",
                                      JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
              
    }
}
