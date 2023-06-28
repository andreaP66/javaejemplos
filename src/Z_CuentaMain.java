import java.util.Scanner;

public class Z_CuentaMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nombre, numero;
		double tipo, importe;
		boolean a, b;
		// se crea objeto cuenta1 sin parámetros
		// se ejecuta el constructor por defecto
		
		CuentaClass cuenta1 = new CuentaClass();
//		System.out.print("Nombre : ");
//		nombre = sc.nextLine();
//		System.out.print("Número de cuenta : ");
//		numero = sc.nextLine();
//		System.out.print("Tipo de interes : ");
//		tipo = sc.nextDouble();
//		System.out.print("Saldo: ");
//		importe = sc.nextDouble();
//
//		cuenta1.setNombre(nombre);
//		cuenta1.setNumeroCuenta(numero);
//		cuenta1.setTipoInteres(tipo);
//		cuenta1.setSaldo(importe);
//		System.out.println(cuenta1);
		
		
		//Cuenta2
		CuentaClass cuenta2 = new CuentaClass("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);
		//CuentaClass cuenta2 = cuenta1; // hace referencia a la zona de memoria
		
		
		//Cuenta3		
		CuentaClass cuneta3 = new CuentaClass(cuenta2);	
		
		
		//Check Class Construction
//		cuenta2.setSaldo(666.0);
//		System.out.println("Cunenats 1 y 2 despues modificar la 2");
//		System.out.println(cuenta1);		
//		System.out.println(cuenta2);	
//		System.out.println(cuenta2);		
//		System.out.println(cuneta3);
		
		
		 //se realiza un ingreso en cuenta1
		 a=cuenta2.ingreso(-4000);				 
//		System.out.println(cuenta2);		
//		System.out.println(cuneta3);
//		b = cuenta2.ingreso(4000);
		System.out.println(cuenta2 + " " +a);		
		System.out.println(cuneta3);
//		System.out.println(a + " " + b);
		
		
		// trasferencia
		cuenta2.tranferencia(cuneta3, 10.00);
		System.out.println(cuenta2 + " " +a);		
		System.out.println(cuneta3);	
	}

}
