package HomeWork;

public class HW4Array {

	public static void main(String[] args) {
		//題目1
		int[] x = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println("平均值為" + sum / 10);

		for (int i = 0; i < x.length; i++) {
			if (x[i] > (sum / 10)) {
				System.out.print(x[i] + " ");
			}
		}
		
		
	}
}
