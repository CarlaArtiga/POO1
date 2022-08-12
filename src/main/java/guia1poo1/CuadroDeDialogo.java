/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo1;

/**
 *
 * @author LENOVO
 */
//el import sirve para utilizar clases, como una biblioteca en c++
//Esta clase ayuda a usar interfaces graficas
import javax.swing.JOptionPane;
public class CuadroDeDialogo {
    
    public static void main(String[] args) {
    
       //Se llama al metodo show Message Dialog para abrir un cuadro de dialogo
       //Este metodo requiere de dos argumentos, el primero es la posicion y al colocar null el cuadro
       //se coloca en el centro.
       //El segundo es el mensaje
       JOptionPane.showMessageDialog(null, "Bienvenido a netbeans");
       //Sirve para terminar la aplicacion
       System.exit(0);
        
    }
    
}
