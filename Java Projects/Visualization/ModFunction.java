package func;

import java.io.IOException;

public class ModFunction implements DoubleFunctionOfTwoInts{

	public double fOfXY(int x, int y) {
		if(y == 0) {
			System.out.println("Cannot divide by zero. Changing y to 1.");
			y = 1;
		}
		return x % y;
	}

	public String getName() {
		return "Modulus Function";
	}
	
	

}
