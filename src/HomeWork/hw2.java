package HomeWork;

public class HW2 {
	public static void main(String[] args) {

		// 題目1
		// 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int sum = 0;
		for (int count = 2; count <= 1000; count += 2) { // 從2開始每次遞增2，直到1000為止
			sum = sum += count; // sum從0開始，每次加上count(2的倍數直到1000)
		}
		System.out.println("1~1000的偶數和 = " + sum);

		// 題目2
		// 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int sum2 = 1;
		for (int count2 = 1; count2 <= 10; count2++) {
			sum2 *= count2;
		}
		System.out.println("1~10的連乘積 = " + sum2);

		// 題目3
		// 請設計一支Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int sum3 = 1, count3 = 1;
		while (count3 <= 10) {
			sum3 *= count3++;
		}
		System.out.println("1~10的連乘積 = " + sum3);

		// 題目4
		// 請設計一隻Java程式，輸出結果為以下： 1 4 9 16 25 36 49 64 81 100
		for (int count4 = 1; count4 <= 10; count4++) {
			System.out.print(count4 * count4 + " ");
		}
		System.out.println();

		// 題目5
		// 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
//		4.14.24.34.40.41.42.43.44.45.46.47.48.49

		int sum5 = 0;
		for (int lottery = 1; lottery <= 49; lottery++) {
			if (lottery % 10 == 4) { // 4.14.24.34.44/40.41.42.43.45.46.47.48.49
			} else if (lottery >= 40) {
			} else {
				System.out.print(lottery + " ");
				sum5++;
			}
		}
		System.out.println();
		System.out.println("共" + sum5 + "個號碼");

		// 題目6
		// 請設計一支Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		for (int i = 11; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// 題目7
//		請設計一隻Java程式，輸出結果為以下：
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		char letter = 'A';
		for (int x = 1; x <= 6; x++) {
			for (int y = 1; y <= x; y++) { //第一輪僅計算一次，x=1=y即跳出小迴圈，輸出"A"，且letter遞增1為'B'，換B輸出2次
				System.out.print(letter);
			}
			letter++; //字元'A'遞增1= 'B'
			System.out.println();
		}
	}
}
