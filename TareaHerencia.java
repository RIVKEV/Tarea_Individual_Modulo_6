/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaherencia;

import Clases.Circulo;
import Clases.Cuadrado;
import Clases.Linea;
import Clases.Triangulo;

/**
 *
 * @author comp
 */
public class TareaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo Circulo = new Circulo();
        Linea Linea = new Linea();
        Triangulo Triangulo = new Triangulo();
        Cuadrado Cuadrado = new Cuadrado(); 
     
        System.out.println("Clase 1");
        Circulo.imprimirInformacion();
        
        System.out.println("Clase 2");
        Linea.imprimirInformacion();
        
        System.out.println("Clase 3");
        Triangulo.imprimirInformacion();
        
        System.out.println("Clase 4");
        Cuadrado.imprimirInformacion();
    }
    
}
