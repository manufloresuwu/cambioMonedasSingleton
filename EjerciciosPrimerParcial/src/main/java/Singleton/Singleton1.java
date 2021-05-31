package Singleton;

public class Singleton1 {

	private static Singleton1 instancia = null;

	private Singleton1() {
		System.out.println("Accediendo a notas...");
	}

	public static Singleton1 getInstance() {
		if (instancia == null)
			instancia = new Singleton1();
		return instancia;
	}
	
	public void print() {
		System.out.println("Calificaciones");
		System.out.println("Fisica: 87");
		System.out.println("Quimica: 81");
		System.out.println("Ciencias Sociales: 40");
		System.out.println("Lenguaje: 90");
	}

	public void restartInstancia() {
		instancia = null;
	}
	
}
