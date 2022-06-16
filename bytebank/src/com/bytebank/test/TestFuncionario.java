package com.bytebank.test;

import com.bytebank.modelo.Contador;
import com.bytebank.modelo.Funcionario;

public class TestFuncionario {

	public static void main(String[] args) {
		
		Funcionario diego = new Contador();
		diego.setNombre("Diego");
		diego.setDocumento("12345678");
		diego.setSalario(2000);
		diego.setTipo(0);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());		
	}
}