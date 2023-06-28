import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ficheros_IOException {
	public static void main(String[] args) throws IOException {
		// "::: prueba.txt"; or "/prueba.txt";  da I/O exception
		final String RUTA_FICHERO = "prueba.txt";
		
		FileWriter fw = new FileWriter(RUTA_FICHERO);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println("Hola desde el fichero");
		pw.println("Que tal");
		System.out.println("Se ha escrito el fichero");
		pw.close();

		
		FileReader fr = new FileReader(RUTA_FICHERO);
		Scanner sc = new Scanner(fr);
		String linea;
		
		while(sc.hasNextLine()) {
			linea= sc.nextLine();
			System.out.println(linea);
		}
		sc.close();
		
	}
}
