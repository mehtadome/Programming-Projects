package func;

import javax.swing.JFrame;


/*
 * The amazing Barnsley fractal. Prof. Barnsley might not be the only person alive who understands
 * why this works. But /I/ sure don't!
 */


public class Barnsley implements DoubleFunctionOfTwoInts
{
	private final static int			OLD_XMIN		= -350;		// dictated by geometry of VizPanel
	private final static int			OLD_XMAX		= +350;
	private final static int			OLD_YMIN		= -250;
	private final static int			OLD_YMAX		= +250;
	
	private final static double			NEW_XMIN 		= -2.182;
	private final static double			NEW_XMAX 		= +4.6558;
	private final static double			NEW_YMIN 		= 0;
	private final static double			NEW_YMAX 		= 16;
	
	private final static int 			N_ITERATIONS	= 80_000;
	private final static int			INDEX_OF_FG		=     90;
	private final static int			INDEX_OF_BG		=      0;
	
	
	private boolean[][]					pixels;						// [x][y]
	private double 						newDistPerHorizPix;
	private double						newDistPerVertPix;
	
	
	Barnsley()
	{
		int nHorizPix = OLD_XMAX - OLD_XMIN;
		newDistPerHorizPix = (NEW_XMAX - NEW_XMIN) / nHorizPix;
		int nVertPix = OLD_YMAX - OLD_YMIN;
		newDistPerVertPix = (NEW_YMAX - NEW_YMIN) / nHorizPix;
		
		pixels = new boolean[nHorizPix][nVertPix];

		double x = 0;
		double y = 0;
		setPixelFor(x, y);
		
		double nextX;
		double nextY;
		for (int i=0; i<N_ITERATIONS; i++)
		{
			double rand = Math.random();
			if (rand < 0.01)
			{
				nextX = 0;
				nextY = 0.16*y;
			}
			else if (rand < 0.86)
			{
				nextX = 0.85*x + 0.04*y;
				nextY = -0.04*x + 0.85*y + 1.6;
			}
			else if (rand < 0.932)
			{
				nextX = 0.2*x - 0.26*y;
				nextY = 0.23*x + 0.22*y + 1.6;
			}
			else
			{
				nextX = -0.15*x + 0.28*y;
				nextY = 0.263*x + 0.24*y + 0.44;
			}
			x = nextX;
			y = nextY;
			setPixelFor(x, y);		
		}
	}
	
	
	private void setPixelFor(double x, double y)
	{
		int i = (int)((x - NEW_XMIN) / newDistPerHorizPix);  
		if (i < 0  ||  i >= pixels.length)
			return;
		int j = (int)((y - NEW_YMIN) / newDistPerVertPix);
		if (j < 0  ||  j >= pixels[0].length)
			return;
		pixels[i][j] = true;
	}
	
	
	@Override
	public double fOfXY(int x, int y) 
	{
		int xIndex = x - OLD_XMIN;
		if (xIndex >= pixels.length)
			xIndex--;
		int yIndex = y - OLD_YMIN;
		if (yIndex >= pixels[0].length)
			yIndex--;
		return pixels[xIndex][yIndex]  ?  INDEX_OF_FG  :  INDEX_OF_BG;
	}

	
	@Override
	public String getName() 
	{
		return "Barnsley set";
	}
}
