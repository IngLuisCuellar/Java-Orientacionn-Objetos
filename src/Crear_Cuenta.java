
public class Crear_Cuenta {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(); //Crea una nueva Cuenta, la variable es tipo Cuenta
		primeraCuenta.depositar(1000);
		
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.depositar(500);
		
		System.out.println(segundaCuenta.getSaldo());
	}
}
