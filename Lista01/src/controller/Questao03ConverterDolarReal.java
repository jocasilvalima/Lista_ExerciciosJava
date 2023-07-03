package controller;

import util.Teclado;

public class Questao03ConverterDolarReal {

	public static void main(String[] args) {

		//double us = 5.42;
		double dolar = Teclado.lerDouble("Digite um valor em dolar para ser convertido em  real: ");

		double real = 5.42 * dolar;

		System.out.println("O valor em Dolar de U$" + dolar + " é equivalente ao valor de R$" + real + " em Real"); 

	}

}
