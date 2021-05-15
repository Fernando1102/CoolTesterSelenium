package conceptosJava_accessMod;

public class A {
	private void mostrar() {
		System.out.println("Modificador de acceso pprivado");
	}
	
	public void mostrarPublic() {
		mostrar();
		System.out.println("Modificador de acceso publico");
	}

}
