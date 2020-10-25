package classesandobjects;

public class FractionUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(4,6);
		f1.print();
//		f1.get_numerator();
//		f1.get_denominator();
//		f1.set_values(10,8);
		Fraction f2 = new Fraction(4,8);
		//f2.print();
		//f1.add(f2);
		//f1.print();
		Fraction f3 = Fraction.add(f1,f2);
		//f1.subtract(f2);
		//f1.print();
		Fraction f4 = Fraction.subtract(f1, f2);
		System.out.println(f4.get_numerator() + "/" + f4.get_denominator());
	}


}

