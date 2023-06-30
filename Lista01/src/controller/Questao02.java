package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {

		int primeiron = Teclado.lerInt("Digite o primeiro numero: ");
		int segundon = Teclado.lerInt("Digite o segundo numero: ");

		int multiplicacao = primeiron * segundon;
		int divisao = primeiron / segundon;
		int adicao = primeiron + segundon;
		int subtracao = primeiron - segundon;
		int restodadivisao = primeiron % segundon;

		System.out.println("A multiplicação é: " + multiplicacao);
		System.out.println("A divisão é: " + divisao);
		System.out.println("A adição é: " + adicao);
		System.out.println("A subtração é: " + subtracao);
		System.out.println("A resto da divisão é: " + restodadivisao);

	}

}
