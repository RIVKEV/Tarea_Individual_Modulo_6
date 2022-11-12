
public class Main {

	public static void main(String[] args) {
		
		
		Recursos instancia = new Recursos();		
	
		instancia.primerMetodo();
		instancia.segundoMetodo(25);
		instancia.tercerMetodo(10, 2);
		instancia.cuartoMetodo(10);
		
	}
			
}


class Recursos{

public String primerMetodo() {
	
	return "Programacion Orientada a Objetos 2022.";

}


public String segundoMetodo(int nota) {
if (nota >= 21) {
    return "Mayor de edad";
} else {
    return "Menor de edad";
}
}

public double tercerMetodo(int mul1, int mul2) {

    return mul1*mul2;

}


public int[] cuartoMetodo(int num) {
 
if (num < 1)
	return null;
else {
	int[] lista = new int[num];
	for (int i = 0; i <= num; i++)
		lista[i] = i+1;

	return lista;
}
}

}

