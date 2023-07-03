package controller;

import util.Teclado;

public class Questao05Reajuste {

	public static void main(String[] args) {
		
		double antigoSal = Teclado.lerDouble("Digite seu salário para cálculo do reajuste: R$");
		
		double atualSal = antigoSal * 1.15;
		double totReajuste = atualSal - antigoSal;
		
		System.out.println("Seu salário com o reajuste é R$" + atualSal + " você teve R$" + totReajuste + " de reajuste");
		
	}

}
