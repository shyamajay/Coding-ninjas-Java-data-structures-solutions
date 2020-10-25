package classesandobjects;

public class ComplexUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(2,3);
		c1.print();
		c1.setReal(4);
		c1.setImaginary(10);
		c1.print();
		
		Complex c2 = new Complex(2,3);
		c1.add(c2);
		c1.print();
		c2.print();
		
		Complex c3 = new Complex(2,3);
		c3.multiply(c2);
		c3.print();
		c2.print();
	}

}
