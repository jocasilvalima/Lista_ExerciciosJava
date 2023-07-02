package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		
		double gfahrenheit = Teclado.lerDouble("Escreva a mediada em graus Fahrenheit para ser convertida em graus celsius.");
		
		double gcelsius = (gfahrenheit - 32) * 5/9;
		
		System.out.println("O grau " + gfahrenheit + "Fº convertido para celsius é: " + gcelsius + "Cº");
	}

}
