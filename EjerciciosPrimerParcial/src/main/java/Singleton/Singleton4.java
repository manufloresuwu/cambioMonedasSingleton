package Singleton;

public class Singleton4 {

	private static Singleton4 instancia = null;

	private Singleton4() {
		System.out.println("Accediendo a notas...");
	}

	public static Singleton4 getInstance() {
		if (instancia == null)
			instancia = new Singleton4();
		return instancia;
	}

	public void print() {
		System.out.println("Calificaciones");
		System.out.println("Fisica: 65");
		System.out.println("Quimica: 45");
		System.out.println("Ciencias Sociales: 100");
		System.out.println("Lenguaje: 100");
	}

	public void restartInstancia() {
		instancia = null;
	}

}
