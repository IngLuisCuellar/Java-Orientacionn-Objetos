
public class PruebaReferenciaTitular {
	
	public static void main(String[] args) {
		
		Cuenta cuentaDeLuis = new Cuenta();
		
		cuentaDeLuis.titular = new Cliente();
		
		cuentaDeLuis.titular.setNombre("Luis Cuellar");
		cuentaDeLuis.titular.setDocumento("1000010001");
		cuentaDeLuis.titular.setTelefono("44444444444");
		
		System.out.println(cuentaDeLuis.getTitular().getNombre());
		System.out.println(cuentaDeLuis.getTitular().getDocumento());
		
	}
}
