package classesandobjects;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator,int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}

	private void simplify() {
		// TODO Auto-generated method stub
		int gcd = 1;
		int min = Math.min(denominator, numerator);
		
		for(int i = 2;i <= min;i++)
		{
			if(numerator%i == 0 && denominator%i == 0)
			{
				gcd = i;
			}
		}
		numerator /= gcd;
		denominator /= gcd;
	}
	
	public int get_numerator()
	{
		simplify();
		return numerator;
	}
	
	public int get_denominator()
	{
		simplify();
		return denominator;
	}
	
	public void set_values(int numerator,int denominator)
	{
		this.numerator = numerator;
		if(this.denominator == 0)
		{
			return;
		}
		else
		{
			this.denominator = denominator;
		}
		simplify();
	}
	
	public void increement()
	{
		numerator = numerator + denominator;
		simplify();
	}
	
	public void print()
	{
		System.out.println(numerator + "/" + denominator);
	}
	
	public void add(Fraction f2) {
		// TODO Auto-generated method stub
		this.numerator = this.numerator * f2.denominator + f2.numerator * this.denominator;
		
		this.denominator = this.denominator * f2.denominator;
		
		simplify();
	}
	
	public static Fraction add(Fraction f1,Fraction f2)
	{
		int num = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
		
		int deno = f1.denominator * f2.denominator;
		
		Fraction f3 = new Fraction(num,deno);
		
		return f3;
	}
	
	public void subtract(Fraction f2)
	{
		this.numerator = this.numerator * f2.denominator - f2.numerator * this.denominator;
		
		this.denominator = this.denominator * f2.denominator;
		
		simplify();
	}
	
	public static Fraction subtract(Fraction f1,Fraction f2)
	{
		int num = f1.numerator * f2.denominator - f2.numerator * f1.denominator;
		
		int deno = f1.denominator * f2.denominator;
		
		Fraction f4 = new Fraction(num,deno);
		
		return f4;
	}

}