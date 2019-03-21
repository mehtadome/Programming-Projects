package func;

import javax.swing.JFrame;

public class Cantor extends ComplexDynamicsFunction
{
	Cantor()
	{
		super(-1.5, 1.5, -1.5, 1.5, new Complex(-.194, .6557));
	}
	
	
	public String getName()
	{
		return "Cantor set";
	}
	
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		VizPanel vp = new VizPanel(new Cantor());
		frame.add(vp);
		frame.pack();
		frame.setVisible(true);
	}
}
