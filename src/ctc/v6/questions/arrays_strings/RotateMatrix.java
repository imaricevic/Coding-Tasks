package ctc.v6.questions.arrays_strings;

/**
 * @author ivan
 *
 *         1.7 Rotate Matrix: Given an image represented by an NxN matrix, where
 *         each pixel in the image is 4 bytes, write a method to rotate the
 *         image by 90 degrees. Can you do this in place?
 * 
 *         Hints: #51, #100
 */
public class RotateMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 2, 3, 4, 5 }, { 7, 8, 9, 10 }, { 0, 1, 2, 3 }, { 0, 1, 2, 3 } };
		Helper.printMatrix(matrix);
		Helper.printMatrix(rotateMatrixInPlace(matrix));
	}

	public static int[][] rotateMatrix(int[][] matrix) {
		int[][] newMatrix = new int[matrix.length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				newMatrix[j][matrix.length - i - 1] = matrix[i][j];
			}
		}
		
		return newMatrix;
	}
	
	/**
	 * Only for NxN
	 * @param matrix
	 * @return
	 */
	public static int[][] rotateMatrixInPlace(int[][] matrix) {
		int n = matrix.length;
		
		for(int i=0; i < matrix.length / 2; i++) {
			int min = i;
			int max = n - min - 1;
			for(int j=min; j < max; j++) {
				int tmp = matrix[min][min + j];
				matrix[min][min + j] = matrix[max -j][min]; 
				matrix[max - j][min] = matrix[max][max - j]; 
				matrix[max][max - j] = matrix[min + j][max]; 
				matrix[min + j][max] = tmp;
			}
		}
		
		return matrix;
	}

}
