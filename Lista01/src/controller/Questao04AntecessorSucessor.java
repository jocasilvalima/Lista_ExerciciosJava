package controller;

import util.Teclado;

public class Questao04AntecessorSucessor {

	public static void main(String[] args) {
	
		int numero = Teclado.lerInt("Digite um numero para descobrir o antecessor e o sucessor.");
		int ante = numero - 1;
		int suce = numero + 1;
		
		System.out.println("O sucessor do numero " + numero + " é o numero " + suce + " e o antecessor é o numero " + ante);

	}

}
