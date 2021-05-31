package Singleton;

public class Singleton5 {

	private static Singleton5 instancia = null;

	private Singleton5() {
		System.out.println("Accediendo a notas...");
	}

	public static Singleton5 getInstance() {
		if (instancia == null)
			instancia = new Singleton5();
		return instancia;
	}

	public void print() {
		System.out.println("Calificaciones");
		System.out.println("Fisica: 74");
		System.out.println("Quimica: 12");
		System.out.println("Ciencias Sociales: 64");
		System.out.println("Lenguaje: 54");
	}

	public void restartInstancia() {
		instancia = null;
	}

}
