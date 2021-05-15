package conceptosJava_conceptos;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {
				{2,7,9},
				{3,6,1},
				{7,4,2}
		};
		System.out.println("imprime la posicion 2 del segundo arreglo :" + arr[1][2]);
		System.out.println(arr[1][2]);
		
		for (int i=0; i<3 ;i++) {
			for (int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=0; i<arr.length ;i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
