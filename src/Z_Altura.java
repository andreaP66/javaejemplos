import java.util.ArrayList;
import java.util.Scanner;

public class Z_Altura {

   public static void main(String[] args) {
      //creamos el ArrayList que contendrá la altura de los alumnos
      ArrayList<Double> altura = new ArrayList();
      int N;
      double media;
      //obtenemos el número de alumnos de la clase
      N = numeroAlumnos();
      //leemos la altura de los N alumnos
      leerAlturas(altura, N);
      //calculamos la media
      media = calcularMedia(altura);
	  //mostramos los resultados
      mostrarResultados(altura, media);
   }

   //Método para pedir por teclado el número de alumnos de la clase
   public static int numeroAlumnos() {
      Scanner sc = new Scanner(System.in);
      int n;
      do {
            System.out.print("Introduce número de alumnos: ");
            n = sc.nextInt();
      } while (n < 1);
      return n;
   }

   //Este método recibe el ArrayList y el número de alumnos de la clase
   //Pide por teclado la altura de todos los alumnos y las guarda en el ArrayList
   public static void leerAlturas(ArrayList<Double> a, int n) {
      Scanner sc = new Scanner(System.in);
      int i;
      double alto;
      for (i = 1; i <= n; i++) {
           do {
                 System.out.print("Alumno " + i + " altura: ");
                 alto = sc.nextDouble();
           } while (alto <= 0);
           a.add(alto); //añade la altura al final del ArrayList
           //System.out.println(a);
      }
  }
   
   public static double calcularMedia (ArrayList<Double> a) {
	   double media=0;
	   System.out.println(a);
	   for (double d: a) {
	   media = d +  media;
			   }
	   return media/a.size();
	   
   }
   //Muestra la altura de todos los alumnos, la media y calcula y muestra
   //cuantos alumnos hay con altura superior a la media
   //y cuántos con altura inferior
   
   public static void mostrarResultados (ArrayList<Double> a, double media){
	   int sup, inf, eq; 
	   sup=inf=eq=0;
	   for (double d:a) {
		   if (d>media) {sup++;}
		   else if (d<media) {inf ++;}
		   else  {eq ++;}
 
	   }
	   System.out.printf("la media é %.2f %n", media);
	   System.out.printf("\nCi sono %d persone sopra la media", sup); 
	   System.out.printf("\nCi sono %d persone sotto la media", inf); 
	   System.out.printf("\nCi sono %d persone uguali alla media", eq); 
	   
   }
}


