import java.util.Scanner;

public class Holamundo {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		int a, b;
		a=1;
		b=2;
		char e = 'c';
		long l = 8181818181818181l;
		float f = 34.6f;
		System.out.println(a);
		System.out.println(b);
		System.out.println(e);
		System.out.println(f);
		boolean bool = true;
		System.out.println(bool);
		System.out.println(f);
		String nombre = "MAMA";
		System.out.println(nombre);
		System.out.println(l);
		
		//Create a Scanner object
		Scanner sc = new Scanner(System.in);

		// System.out.println("Dime tu nombre");
		// nombre = sc.nextLine();
		// System.out.println("Hola "+ nombre);
		// System.out.print("dame a:");
		// a = sc.nextInt();
		// System.out.print("dame b:");
		// b = sc.nextInt();
		// int sum= a+b;
		// System.out.println("suma es "+sum);
		sc.close();
	}
}
