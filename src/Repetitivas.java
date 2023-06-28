import java.util.Scanner;
public class Repetitivas {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int c = 1;
	while (c <= 10) {
		System.out.print(c + " ");
		c++;
	}
	System.out.print("FIN ");
//	String sn;
//	do {
//		System.out.print("Quieres repetir (s/N)");
//
//		sn = sc.nextLine();
//		}
//	while (sn.equals("s"));
//	System.out.print("Acabo");
	
	for (int i =1; i<=10; i++) {
		System.out.print(i + " ");
	}
	sc.close(); 
}
}
