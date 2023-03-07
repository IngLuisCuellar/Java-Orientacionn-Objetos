//Constructores se usan para inicializar los atributos
public class PruebaConstructor {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(458);
		Cuenta cuenta2 = new Cuenta(4);
		Cuenta cuenta3 = new Cuenta(8);
		System.out.println(cuenta.getAgencia());
	}
}
