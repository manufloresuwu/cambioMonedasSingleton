package FactoryMethod;

public class Cliente {

	public static void main(String[] args) {

		System.out.println("Kit Colegial:");
		CreatorKitColegial colegial = new CreatorKitColegial();
		colegial.create().create();

		System.out.println("Kit Escolar:");
		CreatorKitEscolar escolar = new CreatorKitEscolar();
		escolar.create().create();

	}
}
