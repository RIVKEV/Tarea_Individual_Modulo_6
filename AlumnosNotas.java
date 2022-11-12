
package alumnosnotas;

import java.util.Scanner;
import java.util.*;
public class AlumnosNotas {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String VectorNombres [];
        int VectorNotas [];
        VectorNombres = new String [5];
        VectorNotas = new int [5];
        
        for (int i = 0; i < VectorNombres.length; i++ ){
        
        System.out.println("Ingrese el nombre de estudiante: ");
        VectorNombres[i] =teclado.next();
        
        System.out.println("Ingrese la nota del estudiante: ");
        VectorNotas[i] =teclado.nextInt();
        
        if (VectorNotas[i] > 70) {

                System.out.println("Aprobado  ");

            } else {
                System.out.println("Reprobado  ");

            }
        
        }
        System.out.println("El vector resultante es: ");
        
        for (int i = 0; i < VectorNombres.length; i++ ){
        
        System.out.println("["+VectorNombres[i] +"]"+ "");
        System.out.println("["+VectorNotas[i] +"]"+ "");
        
        }
       
    }
    
}
