package Singleton;

public class Singleton3 {

	private static Singleton3 instancia = null;

	private Singleton3() {
		System.out.println("Accediendo a notas...");
	}

	public static Singleton3 getInstance() {
		if (instancia == null)
			instancia = new Singleton3();
		return instancia;
	}

	public void print() {
		System.out.println("Calificaciones");
		System.out.println("Fisica: 76");
		System.out.println("Quimica: 85");
		System.out.println("Ciencias Sociales: 64");
		System.out.println("Lenguaje: 70");
	}

	public void restartInstancia() {
		instancia = null;
	}

}
