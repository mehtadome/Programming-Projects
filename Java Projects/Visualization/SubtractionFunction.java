package func;

public class SubtractionFunction implements DoubleFunctionOfTwoInts{
	
	public double fOfXY(int x, int y) { //subtracts y from x
		return x - y;
	}

	public String getName() {
		return "Subtraction Function";
	}
}
