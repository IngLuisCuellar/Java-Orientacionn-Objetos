/*Entidad Cuenta: Class para representar entidades
 * Saldo
 * Agencia
 * Numero
 * Titular 
 */

class Cuenta {
	
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular = new Cliente(); //Se referencia con el objeto tipo Cliente
	
	
	//Void --> No retorna valor
	public void depositar(double saldo){//El dinero que se va agregar a la cuenta
		this.saldo += saldo;
		// This.saldo es el saldo de este objeto (Cuenta), por otro lado, saldo es el parámetro
		//que le ingresa
	}
	
	
	// Retorna true or false
	public boolean retirar(double saldo){ //Boolean porque retorna si es un exito o un error
		if(this.saldo >= saldo) {
			this.saldo -= saldo;
			return true;
		}
		return false;
	}
								//Objeto tipo cuenta
	public boolean transferir(double saldo, Cuenta cuenta) {
		if (this.saldo >= saldo) {
			this.saldo -= saldo;
			cuenta.depositar(saldo);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setAgencia(int agencia) {
		if(agencia > 0) {
			this.agencia = agencia;
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}

}
