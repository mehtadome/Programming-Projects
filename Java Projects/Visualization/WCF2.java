package func;

public class WCF2 implements DoubleFunctionOfTwoInts
{
	@Override
	public double fOfXY(int x, int y) 
	{
		Complex cOriginal = new Complex(x/500f, y/500f);
		Complex c = new Complex(cOriginal);
		
		for (int n=1; n<=255; n++)
		{
			if (c.norm() >= 2)
			{
				if (n%2 == 0) 
					//n = 0;
					n *= 30;
				return n;
			}
			c = Complex.multiply(c, c);
			c = Complex.add(c, cOriginal);
		}
		return 0;
	}
	
	
	@Override
	public String getName()
	{
		return "Weird complex function 2";
	}
}
