package func;

import javax.swing.JFrame;

public class Fatou  extends ComplexDynamicsFunction
{
	Fatou()
	{
		super(-1.5, 1.5, -1.5, 1.5, new Complex(.11031, -.67037));
	}
	
	
	@Override
	public double fOfXY(int x, int y) 
	{
		return super.fOfXY(x, y) * 4;
		
	}
	
	
	public String getName()
	{
		return "Fatou dust";
	}
}
