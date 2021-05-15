package conceptosJava_herencia;

public class Triangulo extends DosDimensiones{
	String estilo;
	double area() {
		return base*altura/2; //aqui se accede a las variables establecidas
	}
	
	void mostrarEstilo() {
		System.out.println("Triangulo es: " + estilo);
	}

}
