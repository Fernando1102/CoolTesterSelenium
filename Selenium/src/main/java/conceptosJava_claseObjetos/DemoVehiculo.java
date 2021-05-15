package conceptosJava_claseObjetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo minivan = new Vehiculo();
		Vehiculo carro = new Vehiculo();
		
		minivan.capacidad=15;
		minivan.pasajeros=9;
		minivan.kmh=20;
		
		int rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede transportar " + minivan.pasajeros + "en un rango de " + rango);
		
		// el sistema mostrara que el valor de carro.pasajeros es 0, debido a que no a sido inicializado, solo fue declarado en la linea 9
		System.out.println("La minivan puede transportar " + carro.pasajeros + "en un rango de " + rango);
		
		
		carro.pasajeros=4;
		
		System.out.println("El numero de pasajeros en el nuev carro es " + carro.pasajeros);
		

	}

}
