package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorro;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.SaldoInsuficienteException;

public class TestCuenta {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		CuentaCorriente cc = new CuentaCorriente (111, 111);
        cc.depositar(100.0);

        CuentaAhorro ca = new CuentaAhorro(222, 222);
        ca.depositar(200.0);

        cc.transferir(110.0, ca);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CA: " + ca.getSaldo());
	}
}