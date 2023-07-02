package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		
		double gFahrenheit = Teclado.lerDouble("Escreva a mediada em graus Fahrenheit para ser convertida em graus celsius.");
		
		double gCelsius = (gFahrenheit - 32) * 5/9;
		
		System.out.println("O grau " + gFahrenheit + "Fº convertido para celsius é: " + gCelsius + "Cº");
	}

}
