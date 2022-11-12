
package arreglos.multidimencionales;
import java.util.Scanner;

public class ArreglosMultidimencionales {


    public static void main(String[] args) {
        /*
David	Hernandez	Ing. Computacion	Progreso
Marco	Nuñez	Ing. Computacion	Progreso
Luis 	Vallecillo	Ing. Computacion	San Pedro Sula
Marlon 	Carias	Ing. Computacion	choluteca 
Tiffany	Batiz	Ing. Computacion	Progreso
 
        */
        
        String personas[][] = new String[5][5];
       
        Scanner entra = new Scanner(System.in);
        
        for(int i=0; i<personas.length; i++){
        
            System.out.println("Ingrese los datos de las personas "+(i+1));
            for(int j=0; j<5; j++){
            personas[i][j]=entra.next();
            
            }
        }
        
        
    }
    
}
