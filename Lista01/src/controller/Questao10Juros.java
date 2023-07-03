package controller;

import util.Teclado;

public class Questao10Juros {

	public static void main(String[] args) {
		
		int diaAtraso = Teclado.lerInt("Quandos dias em atraso? ");
		
		double valorJuros = 123 + (123 * (2.3 / 100)* diaAtraso);
	}

}
