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
public class Estudiante {
    //Propiedades
    private int numeroCarnet;
    private String name;
    private String carrera;
    private String edad;
    
    
    //Contructor por defecto
    public Estudiante() {
    }
    
    //Contructor personalizado
    public Estudiante(int numeroCarnet, String name, String carrera, String edad) {    
        this.numeroCarnet = numeroCarnet;
        this.name = name;
        this.carrera = carrera;
        this.edad = edad;
    }

    //Metodos para establecer  la informacion del estudiante
    public void setNumeroCarnet(int numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    //Metodos para obtener la informacion del estudiante
    public int getNumeroCarnet() {
        return numeroCarnet;
    }

    public String getName() {
        return name;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getEdad() {
        return edad;
    }
    
    
    
    
}
