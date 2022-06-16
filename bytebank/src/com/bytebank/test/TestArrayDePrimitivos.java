package com.bytebank.test;

import com.bytebank.modelo.CuentaCorriente;

public class TestArrayDePrimitivos {

	public static void main(String[] args) {
		/*
		int[] edades = new int[5];

        edades[0] = 29;
        edades[1] = 39;
        edades[2] = 49;
        edades[3] = 59;
        edades[4] = 69;

        int edad4 = edades[3];

        System.out.println(edad4);
        System.out.println(edades.length);
        */
		
		/*
		int[] edades = new int[5];

        for (int i = 0; i < edades.length; i++) {
            edades[i] = i * i;
        }

        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }
        */
		
		CuentaCorriente[] cuentas = new CuentaCorriente[5];
		
		CuentaCorriente cc1 = new CuentaCorriente(22, 11);
        CuentaCorriente cc2 = new CuentaCorriente(22, 22);

        cuentas[0] = cc1;
        cuentas[1] = cc2;

        System.out.println(cuentas[0].getNumero());
	}

}
