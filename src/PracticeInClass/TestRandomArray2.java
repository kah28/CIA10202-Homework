package PracticeInClass;

public class TestRandomArray2 {
	public static void main(String[] args) {
		TestRandomArray2 tra = new TestRandomArray2(); // 建立物件tra
		int[][] x = tra.getRandomArray(); // 呼叫下面的getRandomArray
		int[][] y = tra.getRandomArray();

		int[][] z = new int[3][3]; // 建立3x3矩陣物件z
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		tra.printArray(x); // 呼叫printArray，輸出x矩陣，以下以此類推
		tra.printArray(y);
		tra.printArray(z);

	}

// **************************************************************************

	public int[][] getRandomArray() { // 方法getRandomArray
		int[][] data = new int[3][3];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = (int) (Math.random() * 31); //// 產生0到30的隨機整數，並存入data陣列
			}
		}
		return data; // 回傳

	}

// **************************************************************************

	public void printArray(int[][] data) { // 方法printArray
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("===================");
	}
}
