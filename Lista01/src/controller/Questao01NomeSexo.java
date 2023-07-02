package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
		String nome = Teclado.lerTexto("Digite seu nome:");
		String sexo = Teclado.lerTexto("Digite seu sexo: ");

		System.out.println("Seu nome é: " + nome);
		System.out.println("Seu sexo é: " + sexo);

	}

}
