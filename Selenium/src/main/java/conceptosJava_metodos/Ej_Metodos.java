package conceptosJava_metodos;

public class Ej_Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resul= suma(3, 4);
		System.out.println(resul);
		
		
		int resul2= suma(3, 4, 5);
		System.out.println(resul2);
		
		String car= carro(3);
		System.out.println(car );

	}

	public static  int suma (int a, int b) {
		int c= a + b;
		return c;
	}
	public static int suma (int a, int b, int c) {
		int m= a + b + c;
		return m;
	}
	
	public static String carro(int a) {
	String[] cars= {"volvo", "BMW", "ford","Mazda"};
	return cars[a];
	}
	

}
