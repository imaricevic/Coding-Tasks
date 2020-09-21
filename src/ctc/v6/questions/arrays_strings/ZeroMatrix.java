package ctc.v6.questions.arrays_strings;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ivan
 *
 *         1.8 Zero Matrix: Write an algorithm such that if an element in an MxN
 *         matrix is 0, its entire row and column are set to O.
 *         
 *         Hints: #17, #74, #102
 */
public class ZeroMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 2, 3, 4, 5 }, { 7, 8, 9, 10 }, { 0, 1, 2, 3 } };
		Helper.printMatrix(matrix);
		Helper.printMatrix(toZero(matrix));
	}
	
	public static int[][] toZero(int[][] matrix) {
		Set<Integer> zeroRows = new HashSet<>();
		Set<Integer> zeroColumns = new HashSet<>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == 0) {
					zeroRows.add(i);
					zeroColumns.add(j);
					break;
				}
			}
		}
		
		for (int i = 0; i < matrix.length && !zeroRows.isEmpty(); i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(zeroRows.contains(i) || zeroColumns.contains(j)) {
					matrix[i][j] = 0;
				}
			}
		}
		
		return matrix;
	}
	
}
