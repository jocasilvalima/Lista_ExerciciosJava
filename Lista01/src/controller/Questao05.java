package controller;

import util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		
		double antigosal = Teclado.lerDouble("Digite seu salário para cálculo do reajuste: R$");
		
		double atualsal = antigosal * 1.15;
		double totreajuste = atualsal - antigosal;
		
		System.out.println("Seu salário com o reajuste é R$" + atualsal + " você teve R$" + totreajuste + " de reajuste");
		
	}

}
