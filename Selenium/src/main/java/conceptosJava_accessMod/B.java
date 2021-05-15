package conceptosJava_accessMod;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		//tratando de acceder al metodo privado
		//Se comenta porque marca error
		//obj.mostrar();
		
		//accedemos al metodo publico
		obj.mostrarPublic();

	}

}
