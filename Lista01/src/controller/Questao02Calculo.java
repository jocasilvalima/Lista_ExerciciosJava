package controller;

import util.Teclado;

public class Questao02Calculo {

	public static void main(String[] args) {

		int primeiroN = Teclado.lerInt("Digite o primeiro numero: ");
		int segundoN = Teclado.lerInt("Digite o segundo numero: ");
		int terceiroN = Teclado.lerInt("Digite o terceiro numero: ");
		int quartoN = Teclado.lerInt("Digite o quarto numero: ");

		int multiplicacao = ((primeiroN * segundoN) * terceiroN) * quartoN;
		int divisao = primeiroN / segundoN / terceiroN / quartoN;
		int adicao = primeiroN + segundoN + terceiroN + quartoN;
		int subtracao = primeiroN - segundoN - terceiroN - quartoN;
		int restodadivisao = primeiroN % segundoN % terceiroN % quartoN;

		System.out.println("A multiplicação é: " + multiplicacao);
		System.out.println("A divisão é: " + divisao);
		System.out.println("A adição é: " + adicao);
		System.out.println("A subtração é: " + subtracao);
		System.out.println("A resto da divisão é: " + restodadivisao);

	}

}
