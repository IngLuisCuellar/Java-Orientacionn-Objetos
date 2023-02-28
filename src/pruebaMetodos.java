
public class pruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		Cuenta segundaCuenta = new Cuenta();
		miCuenta.saldo = 300;
		miCuenta.depositar(1500);
		
		System.out.println(miCuenta.saldo);
		
		miCuenta.retirar(300);
		System.out.println(miCuenta.saldo);
		
		///
		
		segundaCuenta.depositar(1000);
		segundaCuenta.transferir(600,miCuenta);
		
		System.out.println(segundaCuenta.saldo);
		System.out.println(miCuenta.saldo);
	}
}
