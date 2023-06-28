import java.math.BigDecimal;
import java.math.MathContext;

public class Funciones {


	static double sumar(double x, double y) {
		return x + y;
	}

	static double[] ecuacionCuadratica(double a, double b, double c) {
		double x1 = 0.0, x2 = 0.0;
		double[] resultado = new double[2];
		double raiz = Math.sqrt((b * b - 4 * a * c));
		double denominador = 2 * a;
		x1 = (-b + raiz) / denominador;
		x2 = (-b - raiz) / denominador;

		resultado[0] = x1;
		resultado[1] = x2;
		return resultado;
	}

	static BigDecimal[] ecuacionCuadratica(BigDecimal a, BigDecimal b, BigDecimal c) {
		BigDecimal x1 = BigDecimal.ZERO, x2 = BigDecimal.ZERO;
		BigDecimal[] resultado = new BigDecimal[2];
		BigDecimal raiz = (b.multiply(b).subtract(new BigDecimal("4").multiply(a).multiply(c))).sqrt(new MathContext(10000));
		BigDecimal denominador = new BigDecimal("2").multiply(a);
		x1 = (b.negate().add(raiz)).divide(denominador);
		x2 = (b.negate().subtract(raiz)).divide(denominador);

		resultado[0] = x1;
		resultado[1] = x2;
		return resultado;
	}

	static boolean verificarEcuacionCuadratica(double a, double b, double c, double x) {
		double ecuacion = a * x * x + b * x + c;
		System.out.println(ecuacion);
		return ecuacion == 0;
	}
	
	static boolean verificarEcuacionCuadratica(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal x) {
		BigDecimal ecuacion = a.multiply(x).multiply(x).add(b).multiply(x).add(c);
		System.out.println(ecuacion);
		return ecuacion.compareTo(BigDecimal.ZERO) == 0;
	}
}
