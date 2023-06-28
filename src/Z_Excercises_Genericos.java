import java.util.Random;

public class Z_Excercises_Genericos {

	
	
	public static int[] llenarArrayAleatorio(int desde, int hasta, int tam) {
        int[] numeros = new int[tam];
        Random rnd = new Random();
        int n;
        for (int i = 0; i < numeros.length; i++) {                                                                
            do {
                n = rnd.nextInt(hasta - desde + 1) + desde;
            } while (comprobarSiContiene(numeros, i, n));
            numeros[i] = n;
        }
        return numeros;
}

public static boolean comprobarSiContiene(int[] numeros, int indice, int valor) {                                 
        for (int i = 0; i < indice; i++) {
            if (numeros[i] == valor) {
                return true;                                                                                      
            }
        }
        return false;
}
}


//public static void main(String[] args) {
//	int i;
//	int pos, neg;
//	int[] numer = new int[10];
//	int numerodenumeros= 4;
//	pos = neg = 0;
//	double  sumapos=0;
//	double sumaneg=0;
//
//	double mediapos, medianeg;
//	mediapos = medianeg = 0;
//	
//	Scanner sc = new Scanner(System.in);
//
//	for (i = 0; i < numerodenumeros; i++) {
//		System.out.println("Introducir un numero");
//		numer[i] = sc.nextInt();
//
//	}
//
//	for (i = 0; i < numerodenumeros; i++) {
//		System.out.println(numer[i]);
//		if (numer[i] != 0) {
//			if (numer[i] > 0) {
//				pos += 1;
//				sumapos =  sumapos + numer[i];
//				mediapos= sumapos/pos;
//				
//			} else {
//				neg += 1;
//				sumaneg =  sumaneg + numer[i];
//				medianeg= sumaneg/neg;
//			}
//		}
//
//	}
//	


//	
//	System.out.println("Los pos son " + pos + " " + "Los neg son " +neg);
//	System.out.println("Media pos es " + mediapos + " " + "media neg es " +medianeg);
//
//}

//    	Scanner sc = new Scanner(System.in);
//        int n, cifras;
//        char car;
//        do{
//            System.out.print("Introduce un número entero: ");
//            n = sc.nextInt();
//            cifras= 0;    //esta variable es el contador de cifras
//            while(n!=0){             //mientras a n le queden cifras
//                    n = n/10;         //le quitamos el último dígito
//                   cifras++;          //sumamos 1 al contador de cifras
//            }
//            System.out.println("El número tiene " + cifras+ " cifras");                                           
//            System.out.print("Continuar? ");
//            car = (char)System.in.read();
//        }while(car!='n' && car != 'N');   
