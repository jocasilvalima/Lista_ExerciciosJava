package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {

		int primeiron = Teclado.lerInt("Digite o primeiro numero: ");
		int segundon = Teclado.lerInt("Digite o segundo numero: ");
		int terceiron = Teclado.lerInt("Digite o terceiro numero: ");
		int quarton = Teclado.lerInt("Digite o quarto numero: ");

		int multiplicacao = ((primeiron * segundon) * terceiron) * quarton;
		int divisao = primeiron / segundon / terceiron / quarton;
		int adicao = primeiron + segundon + terceiron + quarton;
		int subtracao = primeiron - segundon - terceiron - quarton;
		int restodadivisao = primeiron % segundon % terceiron % quarton;

		System.out.println("A multiplicação é: " + multiplicacao);
		System.out.println("A divisão é: " + divisao);
		System.out.println("A adição é: " + adicao);
		System.out.println("A subtração é: " + subtracao);
		System.out.println("A resto da divisão é: " + restodadivisao);

	}

}
