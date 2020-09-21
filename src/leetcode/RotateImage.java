package leetcode;

/**
 * 
 * @author imaricevic
 *
 *         You are given an n x n 2D matrix representing an image, rotate the
 *         image by 90 degrees (clockwise).
 * 
 *         You have to rotate the image in-place, which means you have to modify
 *         the input 2D matrix directly. DO NOT allocate another 2D matrix and
 *         do the rotation.
 */
public class RotateImage {

	public void rotate(int[][] matrix) {

		if (matrix == null || matrix.length < 2 || matrix.length != matrix[0].length) {
			return;
		}

		for (int i = 0; i < matrix.length / 2; i++) {
			for (int j = i; j < matrix.length - i - 1; j++) {
				int max = matrix.length - 1;
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[max - j][i];
				matrix[max - j][i] = matrix[max - i][max - j];
				matrix[max - i][max - j] = matrix[j][max - i];
				matrix[j][max - i] = tmp;
			}
		}
	}

}
