package controller;

import util.Teclado;

public class Questao07Media {

	public static void main(String[] args) {
	
		int primeiroN = Teclado.lerInt("Digite o primeiro numero: ");
		int segundoN = Teclado.lerInt("Digite o segundo numero: ");
		int terceiroN = Teclado.lerInt("Digite o terceiro numero: ");
		
		int media = (primeiroN+segundoN+terceiroN)/3;
		
		System.out.println("A média aritmética entre estes 3 números é: " + media);

	}

}
