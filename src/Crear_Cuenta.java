
public class Crear_Cuenta {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(); //Crea una nueva Cuenta, la variable es tipo Cuenta
		primeraCuenta.saldo = 1000;
		
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 500;
		
		System.out.println(segundaCuenta.saldo);
	}
}
