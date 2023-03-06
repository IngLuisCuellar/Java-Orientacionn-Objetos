
public class PruebaAcceso {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		cuenta.depositar(500);
		cuenta.retirar(200);
		
		System.out.println(cuenta.getSaldo());
	}
}
