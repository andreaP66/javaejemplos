
public class Z_ConstrucorCopy {

	// Main driver method
	public static void main(String[] args) {

		// Creating object of above class
		Complex c1 = new Complex(10, 15);
		System.out.println("original " + c1);
		

		// Following involves a copy constructor call
		Complex c2 = new Complex(c1);
		c1.setIm(-3);		
		
		// Note: Following doesn't involve a copy
		// constructor call
		// as non-primitive variables are just references.
		Complex c3 = c2;

		// toString() of c2 is called here
		
		c2.setIm(6);
		c3.setIm(9);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}

// Class 1
class Complex {

	// Class data members
	private double re, im;

	// Constructor 1
	// Parameterized constructor
	public Complex(double re, double im) {

		// this keyword refers to current instance itself
		this.re = re;
		this.im = im;
	}

	public double getRe() {
		return re;
	}

	public void setRe(double re) {
		this.re = re;
	}

	public double getIm() {
		return im;
	}

	public void setIm(double im) {
		this.im = im;
	}

	// Constructor 2
	// Copy constructor
	Complex(Complex c) {

		System.out.println("Copy constructor called");

		re = c.re;
		im = c.im;
	}

	// Overriding the toString() of Object class
	@Override
	public String toString() {

		return "(" + re + " + " + im + "i)";
	}
}
