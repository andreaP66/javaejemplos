import java.util.Scanner;

public class Z_ContadorMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, i;
		System.out.println("insertar un numero intero");
		n = sc.nextInt();
		sc.nextLine();
		Contador cnt = new Contador();

		cnt.setCount(n);
		System.out.println(cnt.getCount());

		for (i = 0; i < 5; i++) {
			cnt.incrementar();
			System.out.println(cnt.getCount());
		}
		

		cnt.decrementar();
		
		
		System.out.println("originale dopo primo decremento");
		System.out.println(cnt.getCount());
        Contador contador2 = new Contador(10);
		Contador cnt_cp = new Contador(cnt);
		
		cnt.decrementar();
		System.out.println("copia no modificada, no es una referencia");
		System.out.println(cnt.getCount());
		System.out.println(cnt_cp.getCount());

		
		
		//crear un nuevo objeto Contador con valor inicial 10

		System.out.println("el secundo con inizializacion de 10");
		System.out.println(contador2.getCount());
		
		
		
		sc.close();

	}
}
