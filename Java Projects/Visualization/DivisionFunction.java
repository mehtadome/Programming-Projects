package func;

public class DivisionFunction implements DoubleFunctionOfTwoInts {

	@Override
	public double fOfXY(int x, int y) {
		if (y == 0)
			System.out.println("y cannot be 0, changing to 1");
			y = 1;
		return x / y;
	}

	@Override
	public String getName() {
		return "Division Function";
	}

	
	
}
