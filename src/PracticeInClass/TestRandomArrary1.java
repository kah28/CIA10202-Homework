package PracticeInClass;

public class TestRandomArrary1 {

	public static void main(String[] args) {
//		// 範圍1~10
//		int r1 = (int) (Math.random() * 10) + 1; //隨機產生0~0.9的浮點數，故要*10進位。+1會把範圍設定在1~10之間。
//		System.out.println(r1);

		// 範圍0~30
//		int r2 = (int) (Math.random() * 31); // 因為0~30總共有31個數字，最小值是0，故最後不用+

		// 1.建立三個3x3二維陣列
		int[][] x = new int[3][3]; // 用new創建新陣列，預設值=0
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];
		// 2.將亂數資料填到x陣列裡
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = (int) (Math.random() * 31);// 指定隨機數0~30
			}
		}
		// 3.將亂數資料填到y陣列裡
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				y[i][j] = (int) (Math.random() * 31);//
			}
		}

		// 4.將x,y對應位置的元素加總後，填入到z陣列對應的位置
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];// 加總x+y=z
			}
		}
		// 5.將三個陣列的元素個別顯現出來
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("========================");

		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				System.out.print(y[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("========================");

		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				System.out.print(z[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("========================");
	}
}
