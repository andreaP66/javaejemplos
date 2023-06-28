import java.util.Scanner;

public class Z_excercises_javi {
public static void main(String[] args) {
	
	int n, r;
	double rd;
	Scanner sc = new Scanner (System.in);
	System.out.println("Inserire un numero: ");
	n = sc.nextInt();
	r = (int) (Math.random() *10)+1;
	
	System.out.println("numero elegido: " + n);
	System.out.println("numero random: " + r);
	
}
}
