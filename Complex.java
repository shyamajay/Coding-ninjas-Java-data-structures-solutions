package classesandobjects;

public class Complex {
	
	private int real;
	private int imaginary;
	
	public Complex(int real, int imaginary) {
		// TODO Auto-generated constructor stub
		this.real = real;
		this.imaginary = imaginary;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.real + " + " + this.imaginary + "i");
	}

	public void setReal(int real) {
		// TODO Auto-generated method stub
		this.real = real;
	}

	public void setImaginary(int imaginary) {
		// TODO Auto-generated method stub
		this.imaginary = imaginary;
	}

	public void add(Complex c2) {
		// TODO Auto-generated method stub
		this.real = this.real + c2.real;
		this.imaginary = this.imaginary + c2.imaginary;
		
	}

	public void multiply(Complex c2) {
		// TODO Auto-generated method stub
		int real = this.real * c2.real - this.imaginary * c2.imaginary;
		int img = this.real * c2.imaginary + this.imaginary * c2.real;
		this.real = real;
		this.imaginary = img;
	}

}
