/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoclaseprincipal;

/**
 *
 * @author Kevin Rivas
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Estudiante 
        //Instanciar la clase Estudiante
        Estudiante estudiante = new Estudiante();
        estudiante.setCarrera("Ing Electrico");
        estudiante.setEdad("36");
        estudiante.setName("Kevin Rivas");
        estudiante.setNumeroCarnet(123);
        
        //Obtener la informacion del Estudiante
        
        System.out.println("La carrera del estudiante es "+ estudiante.getCarrera());
        System.out.println("La edad del estudiante es "+ estudiante.getEdad());
        System.out.println("El nombre del estudiante es "+ estudiante.getName());
        System.out.println("El numero de carnet del estudiante es "+ estudiante.getNumeroCarnet());
        
        
    }
    
}
