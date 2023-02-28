/*Entidad Cuenta: Class para representar entidades
 * Saldo
 * Agencia
 * Numero
 * Titular 
 */

class Cuenta {
	
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void depositar(double saldo){//El dinero que se va agregar a la cuenta
		this.saldo = this.saldo + saldo;
		// This.saldo es el saldo de este objeto (Cuenta), por otro lado, saldo es el parámetro
		//que le ingresa
	}

}
