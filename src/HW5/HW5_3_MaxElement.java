package HW5;

public class HW5_3_MaxElement {
	
	public static void main(String[] args) {
		MaxNum mn = new MaxNum();

		int[][] intArray = mn.intArray;
		double[][] doubleArray = mn.doubleArray;

		System.out.println(mn.maxElement(intArray));
		System.out.println(mn.maxElement(doubleArray));

	}

	public static class MaxNum {
		int[][] intArray = { 
							{ 1, 6, 3 }, 
							{ 9, 5, 2 } 
							};

		double[][] doubleArray = { 
									{ 1.2, 3.5, 2.2 }, 
									{ 7.4, 2.1, 8.2 } 
									};

		// 整數陣列:提供整數陣列，回傳最大值(整數)
		public int maxElement(int x[][]) {

			int maxInt = 0;

			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[i].length; j++) {
					if (x[i][j] > maxInt) {
						maxInt = x[i][j];
					}
				}
			}
			return maxInt;
		}

		// 浮點數陣列:提供浮點數陣列，回傳最大值(浮點數)
		public double maxElement(double y[][]) {
			Double maxDouble = 0.0;

			for (int i = 0; i < y.length; i++) {
				for (int j = 0; j < y[i].length; j++) {
					if (y[i][j] > maxDouble) {
						maxDouble = y[i][j];
					}
				}
			}
			return maxDouble;
		}

	}
}
