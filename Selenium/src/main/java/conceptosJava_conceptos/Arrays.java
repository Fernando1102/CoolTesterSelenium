package conceptosJava_conceptos;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[];
		int[] Array;
		
		//declaramos el arreglo
		String [] arr;
		arr = new String[5];
		//inicializamos el valor de cada celda del arreglo
		arr[0]="cero";
		arr[1]="uno";
		arr[2]="dos";
		arr[3]="tres";
		arr[4]="cuatro";
		
		//acccedemos e imprimimos los valores del arreglo
		
		for(int i=0; i < arr.length;i++) {
			
			System.out.println("El valor en el indicie " + i + ":" + arr[i]);
		}

	}

}
