package sudoku;

import java.util.*;


public class Grid 
{
	private int[][]						values;

	//
	// Constructs a Grid instance from a string[] as provided by TestGridSupplier.
	// See TestGridSupplier for examples of input.
	// Dots in input strings represent 0s in values[][].
	//
	
	public Grid(String[] rows)
	{
		values = new int[9][9];
		for (int j=0; j<9; j++)
		{
			String row = rows[j];
			char[] charray = row.toCharArray();
			for (int i=0; i<9; i++)
			{
				char ch = charray[i];
				if (ch != '.')
					values[j][i] = ch - '0';
			}
		}
	}
	
	//
	// DON'T CHANGE THIS.
	//
	public String toString()
	{
		String s = "";
		for (int j=0; j<9; j++)
		{
			for (int i=0; i<9; i++)
			{
				int n = values[j][i];
				if (n == 0)
					s += '.';
				else
					s += (char)('0' + n);
			}
			s += "\n";
		}
		return s;
	}

	//
	// DON'T CHANGE THIS.
	// Copy ctor. Duplicates its source. You’ll call this 9 times in next9Grids.
	//
	Grid(Grid src)
	{
		values = new int[9][9];
		for (int j=0; j<9; j++)
			for (int i=0; i<9; i++)
				values[j][i] = src.values[j][i];
	}

	//
	// Finds an empty member of values[][]. Returns an array list of 9 grids that look like the current grid,
	// except the empty member contains 1, 2, 3 .... 9. Returns null if the current grid is full. Don’t change
	// “this” grid. Build 9 new grids.
	// 
	
	public ArrayList<Grid> next9Grids()
	{		
		// Find x and y of next empty cell.
		int[] xyOfNext = xyOfNextEmptyCell();
		int yOfNext = xyOfNext[1];
		int xOfNext = xyOfNext[0];

		// This list will contain the next 9 grids.
		ArrayList<Grid> theNext9 = new ArrayList<Grid>();

		for (int i = 1; i <= 9;i++)
		{
			Grid nextGrid = new Grid(this);		
			nextGrid.values[xOfNext][yOfNext] = i;
			theNext9.add(nextGrid);
		}
		return theNext9;
	}


	// Finds indices of a cell that contains 0
	private int[] xyOfNextEmptyCell()
	{
		int[] xy = new int[2];

		// Search every member of values[][], looking for  zero.
		for (xy[0]=0; xy[0] < 9; xy[0]++) {
			
			for (xy[1]=0; xy[1] < 9; xy[1]++) {
				
				if (values[xy[0]][xy[1]] == 0) {
					return xy;
				}
			} // xy[1] for loop end
		} // xy[0] for loop end

		return null;
	}

	//
	// Will return true if inputed array contains a repeated value in the 1-9 range. 
	// Will set the observed[i] to true if it's the first time any i observed
	// Returns true the second time if any i is observed
	
	private boolean containsRepeated1Thru9(int[] ints)
	{
		boolean[] hasBeenObserved = new boolean[10];

		for (int i: ints)
		{
			if (i == 0) {
				continue;				// repeated 0s are fine
			} else if (hasBeenObserved[i] == true) {
				return true;			// i has been seen already
			} else {
				hasBeenObserved[i] = true;		// i has been spotted
			}
		}
		return false;
	}

	//
	// Returns true if this grid is legal. A grid is legal if no row, column, or
	// 3x3 block contains a repeated 1, 2, 3, 4, 5, 6, 7, 8, or 9.
	//
	public boolean isLegal()
	{
		// Check all rows.
		for (int j = 0; j < 9; j++)
		{
			int[] integers = new int[9];
			
			for (int i = 0; i < 9; i++) {
				
				integers[i] = values[j][i]; 
			
			if (containsRepeated1Thru9(integers)) {
				return false;
				}
			} // i for loop end
		} // j for loop end

		// Check all cols.
		for (int j = 0; j < 9; j++)
		{
			int[] integers = new int[9];
			for (int i=0; i<9; i++) {
				
				integers[i] = values[i][j];
			
			if (containsRepeated1Thru9(integers)) {
				return false;
				}
			} // i for loop end
		} // j for loop end

		// 
		// Checks all blocks in the 3x3 matrix
		//
		for (int j=0; j < 9; j+=3)
		{
			for (int i = 0; i < 9; i+=3)
			{
				int[] integers = new int[9];
				int n = 0;
				for (int jj=j; jj<j+3; jj++)
				{
					for (int ii=i; ii<i+3; ii++)
					{
						integers[n++] = values[jj][ii];
						
						if (containsRepeated1Thru9(integers))
							return false;
					} // ii for loop end
				} // jj for loop end
			} // i for loop end
		} // j for loop end

		return true;
	}

	//
	// Returns true if every cell member of values[][] is a digit from 1-9.
	//
	public boolean isFull()
	{
		for (int j = 0; j < 9; j++) {
			
			for (int i = 0; i < 9; i++) {
				
				if (values[j][i] == 0) {
					return false;
				}
			} // i for loop end
		} // j for loop end
		return true;
	}

	//
	// Returns true if x is a Grid and, for every (i,j), 
	// x.values[i][j] == this.values[i][j].
	//
	public boolean equals(Object x)
	{
		Grid that = (Grid)x;
		
		for (int i=0; i<9; i++) {
			
			for (int j=0; j<9; j++) {
				
				if (this.values[i][j] != that.values[i][j]) {
					return false;
				}
			} // j for loop end
		} // i for loop end
		return true;
	}
	
} // class end
