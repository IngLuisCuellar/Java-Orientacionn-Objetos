
public class PruebaReferenciaTitular {
	
	public static void main(String[] args) {
		
		Cuenta cuentaDeLuis = new Cuenta();
		
		cuentaDeLuis.titular = new Cliente();
		
		cuentaDeLuis.titular.nombre = "Luis Cuellar";
		cuentaDeLuis.titular.documento = "1000010001";
		cuentaDeLuis.titular.telefono = "44444444444";
		
		System.out.println(cuentaDeLuis.titular.nombre);
		System.out.println(cuentaDeLuis.titular.documento);
		
	}
}
