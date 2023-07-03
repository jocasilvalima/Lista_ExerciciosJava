package controller;

import util.Teclado;

public class Questao08ConsumoMedio {

	public static void main(String[] args) {
		
		double distancia = Teclado.lerDouble("Quantos KM será percorrido");
		double kmLitro = Teclado.lerDouble("Média gasta de 1KM por litros:");
		
		double litros = distancia / kmLitro;
		
		System.out.println("Será gasto: " + litros + " litros nessa viagem. " );
		

	}

}
