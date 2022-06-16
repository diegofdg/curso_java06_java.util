package com.bytebank.modelo;


/**
 * Cuenta va a crear nuevas instancias de CuentaCorriente y CuentaAhorro 
 * @version 1.0
 * @author diego
 *
 */
public abstract class Cuenta {
	
	protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    
    private static int total;
    
    /**
     * Instancia una nueva cuenta sin parámetros
     * @param agencia
     * @param numero
     */
    public Cuenta() {
    	
    }
    
    /**
     * Instancia una nueva usando agencia y número
     * @param agencia
     * @param numero
     */
    public Cuenta(int agencia, int numero) {
    	if(agencia <= 0) {
    		System.out.println("No se permite 0");
    		this.agencia = 1;
    	} else {
    		this.agencia = agencia;
    	}
    	
    	this.numero = numero;
    	System.out.println("Estoy creando la cuenta número " + this.numero);

        Cuenta.total ++;
        System.out.println("Se van creando "+total +" cuentas");
    }
    
    public abstract void depositar(double valor);
    
    /**
     * Este método retira dinero de la cuenta y si ocurre un error devuelve una excepción
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void retirar(double valor) throws SaldoInsuficienteException {
    	if(this.saldo < valor ) {
    		throw new SaldoInsuficienteException("No tienes saldo");
    	}
        this.saldo -= valor;            
    }
    
    public void transferir(double valor, Cuenta destino) throws SaldoInsuficienteException {
    	this.retirar(valor);
        destino.depositar(valor);
    }
    
    public double getSaldo() {
    	return this.saldo;    	
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getAgencia() {
        return agencia;
    }
    
    public void setAgencia(int agencia) {
    	if(agencia > 0) {
    		this.agencia = agencia;    		
    	} else {
    		System.out.println("no están permitidos números negativos");
    	}        
    }
    
    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    public static int getTotal() {
        return Cuenta.total;
    }
    
    @Override
    public String toString() {
    	String cuenta = "Numero: " + this.numero + ", Agencia:" + this.agencia;
    	return cuenta;
    }
}