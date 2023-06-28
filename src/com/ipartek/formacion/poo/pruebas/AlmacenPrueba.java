package com.ipartek.formacion.poo.pruebas;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.ipartek.formacion.poo.pojos.Almacen;
import com.ipartek.formacion.poo.pojos.Producto;

public class AlmacenPrueba {

	public static void main(String[] args) {
		Almacen bilbao = new Almacen(1L, "Bilbao", 42.0, -2.0);
		
		//System.out.println(bilbao);
		
		for(int i = 1; i <= 10; i++) {
			Long id = (long)i;
			String nombre = "Producto " + i;
			BigDecimal precio = new BigDecimal(i + "0");
			LocalDate caducidad = LocalDate.of(2024+i, i, i*2);
			
			Producto producto = new Producto(id, nombre, precio, caducidad);
			
			bilbao.meter(producto);
		}
		
//		for (Producto p: bilbao.listado()){
//		System.out.println(p);}
		
		
		Producto producto5 = bilbao.sacar(5L);
		
//		System.out.println(producto5);
		
		for(Producto p: bilbao.listado()) {
			System.out.println(p);
		}
		
		producto5 = bilbao.sacar(5L);
		
		System.out.println(producto5);
		
		bilbao.listado().add(null);
		
		//System.out.println(producto5);
		
		System.out.println("LISTADO");
		
		
		// simplemente para no escribirlas en filas 
		for(Producto p: bilbao.listado()) {
			System.out.println(p);
		}	
//		System.out.println(bilbao.listado());
		
		
	}

}