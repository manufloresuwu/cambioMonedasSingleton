package Singleton;

public class Singleton2 {

	private static Singleton2 instancia = null;

	private Singleton2() {
		System.out.println("Accediendo a notas...");
	}

	public static Singleton2 getInstance() {
		if (instancia == null)
			instancia = new Singleton2();
		return instancia;
	}

	public void print() {
		System.out.println("Calificaciones");
		System.out.println("Fisica: 54");
		System.out.println("Quimica: 23");
		System.out.println("Ciencias Sociales: 61");
		System.out.println("Lenguaje: 100");
	}

	public void restartInstancia() {
		instancia = null;
	}

}
