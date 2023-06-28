import java.util.Scanner;

public class Condicionales {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Dime tu nombre: ");
		String nombre = sc.nextLine();
		//if (nombre == "Baba");  compara punteros 
//		if ("Baba".equals(nombre)) 
//		{
//			System.out.println("el baba original");
//		}
//		else if ("Baba1".equals(nombre))
//		{
//			System.out.println("el baba copia");
//		}
//		else {
//			System.out.println("No te conosco");
//		}
//		System.out.println("ciao");
		
		// Antes de Java7 no switch con string
		switch(nombre)  {
		case "Baba":
			System.out.println("el baba original");
			break;
		case "Baba1":
			System.out.println("el baba copia");	
			break;
		default:
			System.out.println("ciao");
			System.out.println("No eres baba");
		sc.close();

						}
	}
}
