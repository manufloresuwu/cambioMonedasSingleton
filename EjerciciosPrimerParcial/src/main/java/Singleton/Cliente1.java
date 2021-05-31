package Singleton;

public class Cliente1 {

	public static void main(String[] args) {
		Singleton1.getInstance();
		
		
		Singleton1.getInstance().print();

		Singleton1.getInstance().restartInstancia();

	}
}
