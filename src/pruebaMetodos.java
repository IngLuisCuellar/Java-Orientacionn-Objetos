
public class pruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		Cuenta segundaCuenta = new Cuenta();
		miCuenta.depositar(300);
		miCuenta.depositar(1500);
		
		System.out.println(miCuenta.getSaldo());
		
		miCuenta.retirar(300);
		System.out.println(miCuenta.getSaldo());
		
		///
		
		segundaCuenta.depositar(1000);
		segundaCuenta.transferir(600,miCuenta);
		
		System.out.println(segundaCuenta.getSaldo());
		System.out.println(miCuenta.getSaldo());
	}
}
