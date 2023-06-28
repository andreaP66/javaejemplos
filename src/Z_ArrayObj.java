import java.util.ArrayList;
import java.util.Scanner;

public class Z_ArrayObj {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Coche> choces = new ArrayList();

	public static void main(String[] args) {
		leerCoches();
		System.out.println(choces);
	}

	public static Void leerCoches() {
		String matricula;
		String marca;
		String modelo;
		int Km;

		Coche element;
		int i, N;

		do {
			System.out.println("Quantos coches?");
			N = sc.nextInt();
		} while (N <= 0);
		sc.nextLine();
		// System.out.println(N);

		for (i = 1; i <= N; i++) {
			System.out.println("Coche numero " + i);
			System.out.println("Matricula?");
			matricula = sc.nextLine();
			System.out.println("Marca?");
			marca = sc.nextLine();
			System.out.println("Modelo?");
			modelo = sc.nextLine();
			System.out.println("KM?");
			Km = sc.nextInt();
			sc.nextLine();

			element = new Coche(); // Creo objecto Coche y se le asigna su referencia

			element.setMatricula(matricula);
			element.setMarca(marca);
			element.setModelo(modelo);
			element.setKm(Km);
			//System.out.println(element);
			choces.add(element);

		}

		return null;

	}
}
