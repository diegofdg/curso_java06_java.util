package com.bytebank.modelo;

public class Contador extends Funcionario {
	
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde Contador");
		return 200;
	}
}