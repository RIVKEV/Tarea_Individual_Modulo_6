package operaciones.aritmeticas;

public class OperacionesAritmeticas {

   
    public static void main(String[] args) {
        // Declaracion de variables
        double suma = 0;
        double resta = 0; 
        double multiplicacion = 0;
        double division = 0;
        double mod = 0;
        
        double numero1 = 93;
        double numero2 = 5;
        
        //Operaciones
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        mod = numero1 % numero2;
        //No se podra dividir cuando el denominador sea 0
        if (numero2 != 0);{ 
        division = numero1 / numero2;    
    }
        
        //Imprimir los valores en pantalla
        System.out.println("la sumas es: " + suma);
        System.out.println("la resta es: " + resta);
        System.out.println("la multiplicacion es: " + multiplicacion);
        System.out.println("la division es: " + division);
        System.out.println("El mod es: " + mod);
        
    }
    
}
