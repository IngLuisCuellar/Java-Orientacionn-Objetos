
public class PruebaReferenciaTitular {
	
	public static void main(String[] args) {
		Cliente Luis = new Cliente();
		Luis.nombre = "Luis Cuellar";
		Luis.documento = "1000010001";
		Luis.telefono = "44444444444";
		
		Cuenta cuentaDeLuis = new Cuenta();
		cuentaDeLuis.titular = Luis;
		
		System.out.println(cuentaDeLuis.titular.nombre);
		
	}
}
