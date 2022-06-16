package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorro;
import com.bytebank.modelo.SaldoInsuficienteException;

public class TestCuentaExceptionSaldo {

	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorro(123, 453);
		cuenta.depositar(200);
		try {
			cuenta.retirar(201);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}

	}

}
