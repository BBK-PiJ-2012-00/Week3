public class Matrix {
	private int[][] matrix2D;
	private int firstD;
	private int secondD;
	
	public Matrix(int firstD, int secondD) {
		int arrayCounter = 0;
		int posCounter = 0;
		matrix2D = new int[firstD][secondD];
		for (arrayCounter = arrayCounter; arrayCounter < firstD; arrayCounter++) {
			for(posCounter = 0; posCounter < secondD; posCounter++) {
			matrix2D[arrayCounter][posCounter] = 1;
			}
		}
	} //successful.
		
	public void prettyPrint() { 
		int nArrays = matrix2D.length; //number of arrays/rows.
		int nPositions = matrix2D[1].length; //number of positions/columns
		int aCounter = 0;
		int pCounter = 0;
		for (aCounter = aCounter; aCounter < nArrays; aCounter++) {
				System.out.println("\t"); //tabulation
			for (pCounter = 0; pCounter < nPositions; pCounter++) {
				System.out.print(matrix2D[aCounter][pCounter]);
			}
		}		
	} //successful.
	
	public void setElement(int arrayChoice, int position, int value) {
		int nArrays = matrix2D.length;
		int nPositions = matrix2D[1].length;
		if (arrayChoice < nArrays) {
			if (position < nPositions) {
				matrix2D[arrayChoice][position] = value;
			}
			else if (position > nPositions) {
				System.out.print("You cannot specify a position that is greater than the length of the array.  No changes have been made.");
			}
		}
		else if (arrayChoice > nArrays) {
			System.out.println("You cannot specify an array that doesn't exist.  No changes have been made.");
		}		
	}	//Successful.
	
	public void setRow(int arrayChoice, String values) {
		int nArrays = matrix2D.length;
		int nPositions = matrix2D[1].length;
		if (arrayChoice < nArrays) {
			int sLength = values.length();
			if (sLength == nPositions) {
				int posCounter = 0;
				String s = "";
				for (posCounter = 0; posCounter < sLength; posCounter++) {
					char c = values.charAt(posCounter);
					s = s + c;
					int value = Integer.parseInt(s);
					matrix2D[arrayChoice][posCounter] = value;
					s = ""; //needs to be reset.  Casting for complex types?
				}
			}
			else if (sLength > nPositions) {
				System.out.println("You cannot enter more values than there are positions in the array.  No changes have been made.");
			}
		}
		else if (arrayChoice > nArrays) {
			System.out.println("You cannot select array that doesn't exist.  No changes have been made.");
		}
	} //number of characters in string = number of columns/positions; numbers themselves represent values to be inserted.  Successful.		
	
	public void setColumn(int column, String values) {
		int nArrays = matrix2D.length;
		int nPositions = matrix2D[1].length;
			if (column < nPositions) {
				int sLength = values.length();
				if (sLength == nArrays) {
					int aCounter = 0;
					String s = "";
					for (aCounter = 0; aCounter < sLength; aCounter++) {
						char c = values.charAt(aCounter);
						s = s + c;
						int value = Integer.parseInt(s);
						s = "";
						matrix2D[aCounter][column] = value;
					}
				}
				else if (sLength != nArrays) {
					System.out.println("To change the values in a specific column across all arrays, you must enter the same number of values as there are arrays.  No changes have been committed.");
				}
			}				
		else if (column >= nPositions) {
				System.out.println("You cannot specify a column that doesn't exist. No changes have been committed.");
		}		
	} //Successful. Modifies one positional column across all arrays - therefore, length of string must equal number of arrays.
	
	public String toString() {
		int nArrays = matrix2D.length; //number of arrays/rows.
		int nPositions = matrix2D[1].length; //number of positions/columns
		int aCounter = 0;
		int pCounter = 0;
		String printer = "[";
		for (aCounter = aCounter; aCounter < nArrays; aCounter++) {
				if (aCounter > 0) {
				printer = printer + ";";
				}
			for (pCounter = 0; pCounter < nPositions; pCounter++) {
				printer = printer + matrix2D[aCounter][pCounter] + ",";
			}
		}	
		printer = printer + "]";
		return printer;
	} //Successful.
	
	public static void main(String[] args) {
		System.out.println("Please enter two numbers to set the size of the 2D matrix: ");
		int firstD = Integer.parseInt(System.console().readLine());
		int secondD = Integer.parseInt(System.console().readLine());
		Matrix twoD = new Matrix(firstD, secondD);
		
		System.out.println("Now specify the array, position within the array and variable you would like to change: ");
		System.out.println("Array choice: ");
		int arrayChoice = (Integer.parseInt(System.console().readLine()) - 1);
		System.out.println("Position within chosen array: ");
		int position = (Integer.parseInt(System.console().readLine()) - 1);
		System.out.println("Value you would like to add: ");
		int value = Integer.parseInt(System.console().readLine());
		twoD.setElement(arrayChoice, position, value);
		String printer = twoD.toString();
		System.out.println(printer);
		
		System.out.println(" ");
		System.out.println("To change a whole row of the matrix, please enter the row (array) which you would like to change, followed by the values you would like to assign.  Take care that you do not enter more values than available positions: ");
		arrayChoice = (Integer.parseInt(System.console().readLine()) - 1);
		String values = System.console().readLine();
		twoD.setRow(arrayChoice, values);			
		printer = twoD.toString();
		System.out.println(printer);
		
		System.out.println(" ");
		System.out.println("To change the values of a column across all arrays, please enter the column number you would like to change (enter as many values as there are arrays): ");
		int column = (Integer.parseInt(System.console().readLine()) - 1);
		values = System.console().readLine();
		twoD.setColumn(column, values);
		printer = twoD.toString();
		System.out.println(printer);
	}
}