
public class pruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.saldo = 300;
		miCuenta.depositar(1500);
		
		System.out.println(miCuenta.saldo);
	}
}
