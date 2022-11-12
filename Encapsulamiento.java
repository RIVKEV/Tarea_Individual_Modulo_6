/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulamiento;

import Clases.Futbolista;


/**
 *
 * @author comp
 */
public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciar la clase Futbolista
        
        Futbolista futbolista = new Futbolista ("Mateo Rivas", "C.D San Jose");
        
        System.out.println("Mateo Rivas");
        futbolista.imprimirEquipoActual();
        futbolista.establecerEdad(9);
       
        //Imprimir el valor de una variable privada
        
        System.out.println(futbolista.odtenerEdad());
    }
    
}
