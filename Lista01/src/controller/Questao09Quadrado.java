package controller;

import util.Teclado;

public class Questao09Quadrado {

	public static void main(String[] args) {

		int numero = Teclado.lerInt("Digite um número para descobria o quadrado e a raiz quadrada deste número ");

	double quadrado =	Math.pow(numero, 2);
	double raizQ =	Math.sqrt(numero);

		System.out.println("O número: " + numero + " tem: " + quadrado + " como seu quadrado");

		System.out.println("O número: " + numero + " tem: " + raizQ + " como seu raiz quadrada");
	}

}
