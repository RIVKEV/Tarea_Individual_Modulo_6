/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *Esta es la clase PADRE que llamamos "Formas" 
 * @author Kevin Rivas
 */
public class Formas {
    //Atributo (almacena los datos de las Sub Claes)
    private String Nombre;
    
    private String Figuras;
    
    private String Calcular;
    
    /**
     *
     */
    public Formas (){
    
}    
//Establecer y Obtener

    /**
     *este parametro los recibimos de las Sub claes, Aqui Establecemos el nombre
     * @param Nombre
     */
public void EstablecerNombre(String Nombre){

     this.Nombre = Nombre;
  
}    

    /**
     *Aqui validasmos si obtenemos el parametro "nombre" de las sub clases
     * @return
     */
    public String ObtenerNombre(){

    return this.Nombre;
}

//Establecer y Obtener

    /**
     *este parametro los recibimos de las Sub claes, aqui Establecemos "calcular" 
     * @param Calcular
     */
public void EstablecerCalcular(String Calcular){

     this.Calcular = Calcular;
  
}    

    /**
     *Aqui validasmos si obtenemos el parametro "calcular" de las sub clases
     * @return
     */
    public String ObtenerCalcular(){

    return this.Calcular;
}
//Establecer y Obtener

    /**
     *este parametro los recibimos de las Sub claes, aqui Establecemos la figura  
     * @param Figuras
     */
public void EstablecerFiguras(String Figuras){

     this.Figuras = Figuras;
  
}    

    /**
     *Aqui validasmos si obtenemos el parametro "figura"  de las sub clases
     * @return
     */
    public String ObtenerFiguras(){

    return this.Figuras;
}

    /**
     *por ultimos imprimimos las subclases 
     */
    public void imprimirInformacion(){

    System.out.println("Nombre: " + Nombre);
     System.out.println("Figuras: " + Figuras);
     System.out.println("Calcular: " + Calcular);
}

}
