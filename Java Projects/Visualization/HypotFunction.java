package func;

import java.lang.Math; //imports Math function 

public class HypotFunction implements DoubleFunctionOfTwoInts{
	
	public double fOfXY(int x, int y) { //Using the Math function, method returns 
										//the hypotenuse of the right triangle  
										//with base legs x and y
		return Math.hypot(x, y); //Returns square-root of x^2 and y^2
	}

	public String getName() {
		return "Hypot Function";
	}

}
