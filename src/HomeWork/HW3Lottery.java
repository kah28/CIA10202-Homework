package HomeWork;

import java.util.Scanner;

public class HW3Lottery {
	/*
	 * 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
	 * 厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇 的號碼與總數
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("阿文...請輸入你討厭的數字(1~9)");
		int hatenum = sc.nextInt();

		int sum = 0;
		for (int lottery = 1; lottery <= 49; lottery++) {
			if (lottery % 10 == hatenum || lottery / 10 == hatenum) {
				continue;
			} else {
				System.out.print(lottery + " ");
				sum++;
			}
		}
		System.out.println();
		System.out.println("共" + sum + "個號碼可以選擇");
		sc.close(); // 關閉Scanner
	}
}
