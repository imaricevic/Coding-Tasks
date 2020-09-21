package leetcode;

import org.junit.Assert;
import org.junit.Test;


public class Knapsac {

	private int[] weights;
	private int[] values;
	

	public int maxValue(int capacity) {
		
		return recursion(1, capacity);
	}
	
	
	public int[] getWeights() {
		return weights;
	}


	public void setWeights(int[] weights) {
		this.weights = weights;
	}


	public int[] getValues() {
		return values;
	}


	public void setValues(int[] values) {
		this.values = values;
	}


	private int recursion(int index, int capacityLeft) {
		
		if(capacityLeft <= 0) {
			return 0;
		}
		
		if(index == values.length) {
			return capacityLeft < weights[index - 1] ? 0 : values[index - 1];
		}
		
		int noTake = recursion(index + 1, capacityLeft);
		if(capacityLeft - weights[index - 1] < 0) {
			return noTake;
		}
		
		int take = recursion(index + 1, capacityLeft - weights[index - 1]) + values[index - 1];
		
		return Math.max(take, noTake);
	}
	
	@Test
	public void test() {
		
		int w[] = { 2, 1, 8, 6, 5 };
		int v[] = { 3, 4, 12, 7, 4 };

		Knapsac knapsac = new Knapsac();
		knapsac.setValues(v);
		knapsac.setWeights(w);
		Assert.assertEquals(knapsac.maxValue(12), 19);
		
	}
	
}
