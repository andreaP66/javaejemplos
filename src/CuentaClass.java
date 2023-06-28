
public class CuentaClass {
	// decclar
	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;

	// Constructor por defecto
	public CuentaClass() {
	}

	public boolean ingreso(double n) {
		boolean ingresoCorecto = true;

		if (n < 0) {
			ingresoCorecto = false;
		} else {
			saldo = saldo + n;
		}

		return ingresoCorecto;
	}
	
	public boolean tranferencia(CuentaClass c, double n) {
		boolean haySaldo = true;

		if ((saldo - n) < 0) {
			System.out.println("no se puede efectuar la trnsferencia");
			haySaldo = false;
		} else {
			saldo = saldo - n;
			c.saldo = c.saldo + n;
		}

		return haySaldo;
	}

	// constructor de instancia
	public CuentaClass(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
		setNombre(nombre);
		setNumeroCuenta(numeroCuenta);
		setTipoInteres(tipoInteres);
		setSaldo(saldo);
	}

	// Constructor de copia

	public CuentaClass(CuentaClass cuenta) {
		this(cuenta.getNombre(), cuenta.getNumeroCuenta(), cuenta.getTipoInteres(), cuenta.getSaldo());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(Double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "CuentaClass [nombre=" + nombre + ", numeroCuenta=" + numeroCuenta + ", tipoInteres=" + tipoInteres
				+ ", saldo=" + saldo + "]";
	}

}
