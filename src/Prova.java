
import java.math.BigDecimal;
import java.time.LocalDate;

import com.ipartek.formacion.poo.pojos.Almacen;
import com.ipartek.formacion.poo.pojos.Producto;

public class Prova {
	public static void main(String[] args) {
		int i;

		
		Almacen bilbao = new Almacen(1L, "Bilbao", 42.0, -2.0);
		for (i=1; i<5; i++) {
		Long id = (long) i;
		Producto p = new Producto(id, "Naranja", new BigDecimal("2.13"), LocalDate.of(2024, 12, 12));
		bilbao.meter(p);
		
		}
		System.out.println(bilbao.listado());


		
//		int i = 1;
//		String a ;
//		a = "Ciao " + i;
//		System.out.println(a);
		
		
//		System.out.println(leerLocalDate("dame"));
		
		
//		long l ;
//		l = leerLong("dammi un long");
//		System.out.println(l);
		
//		System.out.println(Funciones.sumar(3, 4));
		
		
//		mostrarLinea("Ciao " + 4);
//		int numero = leerEntero("Dime un número");
//		mostrarLinea(numero);
//		leerBooleano("quieres seguir");
	}

}
