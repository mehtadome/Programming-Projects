package func;

public class Complex 
{
	private double			real;
	private double			imaginary;
	
	
	// Constructs an instance, given its real and imaginary components.
	public Complex(double real, double imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	
	
	// Constructs an instance that duplicates source.
	// Complete this constructor, then remove this comment line.
	public Complex(Complex source)
	{
		this.real = source.getReal();
		this.imaginary = source.getImaginary();
	}
	
	
	// Getter method.
	public double getReal()
	{
		return real;

	}
	

	// Getter method.
	public double getImaginary()
	{
		return imaginary;

	}
	
	// Constructs and returns a new instance of Complex that represents the sum of its inputs,
	// according to the following formula:
	//
	// (a+bi) plus (c+di) = (a+c) + (b+d)i
	// 	
	public static Complex add(Complex c1, Complex c2)
	{
		double newReal = 0;
		double newImaginary = 0;

		//Implement the equation properly here
		newReal = c1.real + c2.real;
		newImaginary = c1.imaginary + c2.imaginary;
		
		return new Complex(newReal, newImaginary);


	}
	
	// Constructs and returns a new instance of Complex that represents the product of its inputs,
	// according to the following formula:
	//
	// (a+bi) times (c+di) = a*c + a*di + bi*c + bi*di = ac + (ad+bc)i + bd*ii
	// Since ii is -1 by definition, the last term is -bd ==> the result is ac-bd + (ad+bc)i
	//
	public static Complex multiply(Complex c1, Complex c2)
	{
		double a = c1.getReal();
		double b = c1.getImaginary();
		double c = c2.getReal();
		double d = c2.getImaginary();
		
		return new Complex ((a*c)-(b*d),(a*d)+(b*c));
	}
	
	
	//
	// The "norm" of complex number a+bi is the square root of (a^2 + b^2).
	//
	public double norm()
	{
		double a = Math.pow(this.real,2);
		double b = Math.pow(this.imaginary,2);
		double sum = a+ b;
		double root = Math.sqrt(sum);
		return root;

	}
}
