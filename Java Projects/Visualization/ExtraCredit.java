package func;

import java.lang.Math;

public class ExtraCredit implements DoubleFunctionOfTwoInts{

	@Override
	public double fOfXY(int x, int y) {
		return Math.pow(x, 2) + Math.hypot(x, y) * x * y * x * y;
	}

	@Override
	public String getName() {
	return "Extra Credit Function";
	}
	

}
