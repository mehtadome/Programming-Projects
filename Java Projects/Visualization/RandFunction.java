package func;

public class RandFunction implements DoubleFunctionOfTwoInts{

	@Override
	public double fOfXY(int x, int y) {
		return x+x+x+y+y+x+y;
	}

	@Override
	public String getName() {
		return "Random Function";
	}

}
