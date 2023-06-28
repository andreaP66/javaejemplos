

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.Scanner;

	public class Z_media {

	   public static void main(String[] args) {
	         ArrayList<Integer> array = leerValores();
	         double suma = calcularSuma(array);
	         double media = suma / array.size();
	         //mostrarResultados(array, suma, media);
	   }

	   //pedir por teclado los valores y guardarlos en el ArrayList
	   //la lectura acaba cuando se introduzca -99
	   public static ArrayList<Integer> leerValores() {
	        ArrayList<Integer> valores = new ArrayList();
	        Scanner sc = new Scanner(System.in);
	        int n;
	        System.out.print("Introduce entero. -99 para acabar: ");
	        n = sc.nextInt();
	        while (n != -99) {
	                 valores.add(n);
	                 System.out.print("Introduce entero. -99 para acabar: ");
	                 n = sc.nextInt();
	        }
	        return valores;
	   }

	   //recorrer el ArrayList y sumar todos sus elementos
	   public static double calcularSuma(ArrayList<Integer> valores) {
	         int suma = 0;
	         Iterator it = valores.iterator();
	         while (it.hasNext()) {
	                  suma = suma + (Integer) it.next();
	                 //next() devuelve un dato de tipo Object. Hay que convertirlo a Integer
	         }
	         System.out.println(suma);
	         return suma;
	   }
}
