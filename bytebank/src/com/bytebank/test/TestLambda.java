package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorro;
import com.bytebank.modelo.CuentaCorriente;

public class TestLambda {

	public static void main(String[] args) {
		Cuenta cc1 = new CuentaCorriente(10, 40);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNombre("Noel");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Cuenta cc2 = new CuentaAhorro(20, 30);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNombre("Diego");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);

        Cuenta cc3 = new CuentaCorriente(30, 20);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNombre("Liam");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Cuenta cc4 = new CuentaAhorro(40, 10);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNombre("Renato");
        cc4.setTitular(clienteCC4);
        cc4.depositar(222.0);

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
	    
	    System.out.println("\nAntes de ordenar");
	    for (Cuenta cuenta : lista) {
	    	System.out.println(cuenta);
	    }
	    
	    // Usando Lambdas
	    lista.sort((Cuenta o1, Cuenta o2) -> 
	    	Integer.compare(o1.getNumero(), o2.getNumero())	
		);
	    
	    System.out.println("\nDespues de ordenar");
	    for (Cuenta cuenta : lista) {
	    	System.out.println(cuenta);
	    }
	    
	    Collections.sort(lista, (c1, c2) -> 
	    	c1.getTitular().getNombre()
	    			.compareTo(c2.getTitular().getNombre())
	    );
	    
	    
	    System.out.println("\nDespues de ordenar por nombre titular");
	    // for (Cuenta cuenta : lista) {
	    //	 	System.out.println(cuenta);
	    // }
	    
	    lista.forEach(cuenta -> System.out.println(cuenta));
	    
	    Collections.sort(lista);
	    
	    System.out.println("\nDespues de ordenar por orden natural");
	    
	    for (Cuenta cuenta : lista) {
	    	System.out.println(cuenta);
	    }
	}
}