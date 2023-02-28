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
	
	//Void --> No retorna valor
	public void depositar(double saldo){//El dinero que se va agregar a la cuenta
		this.saldo = this.saldo + saldo;
		// This.saldo es el saldo de este objeto (Cuenta), por otro lado, saldo es el parámetro
		//que le ingresa
	}
	
	
	// Retorna true or false
	public boolean retirar(double saldo){ //Boolean porque retorna si es un exito o un error
		if(this.saldo >= saldo) {
			this.saldo = this.saldo - saldo;
			return true;
		} else {
			System.out.println("No es posible retirar");
			return false;
		}
	}

}
