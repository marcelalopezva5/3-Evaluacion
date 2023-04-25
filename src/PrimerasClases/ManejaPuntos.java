package PrimerasClases;

public class ManejaPuntos {

	public static void main(String[] args) {
		//Esra clase sirve para ver si he pensado bien
		//la clase Punto
		int x=2;
		double y=3.1416;
		char l= 'A';
		boolean respuesta=true;
		String palabra;
		Punto miPrimerPuntito;//declaro un objeto de la clase Punto
		miPrimerPuntito=new Punto(2,3);//Utilizo su conductor para inicializarlo
		System.out.println("Este punto dista del origen: ");
		System.out.println(miPrimerPuntito.devuelveDistanciaOrigen());
		
		
				
	}
}
