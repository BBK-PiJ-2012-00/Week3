public class Matrix {
	private int[][] matrix2D;
	private int firstD;
	private int secondD;
	
	public Matrix(int firstD, int secondD) {
		int counter = 0;
		matrix2D = new int[firstD][secondD];
		for (counter = 0; counter < firstD; counter++) {
		matrix2D[0][counter] = 1;
		}
		for (counter = 0; counter < secondD; counter++) {
		matrix2D[1][counter] = 1;
		}
	} //successfully compiles and runs as expected.
		
		