package HW4;

import java.util.Scanner;

public class HW4Array_3 {
	public static void main(String[] args) {

		// 題目5
		//請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天

		Scanner sc = new Scanner(System.in);

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		System.out.println("天數計算器，請依序輸入以下內容...");

		System.out.println("請輸入西元年份:");
		int yy = sc.nextInt();

		System.out.println("請輸入月份:");
		int mm = sc.nextInt();

		int dd;

		if (mm != 2) {
			System.out.println("請輸入日期:");
			dd = sc.nextInt();
		} else {
			for (dd = 0; dd == 0;) {// 無窮迴圈
				System.out.println("請輸入日期:");
				dd = sc.nextInt();
				if (dd > 29) {
					dd = 0;
					System.out.println("2月份日期不得超過29日，請重新輸入!");
				} else
					break; // 停止迴圈
			}

		}
		
		sc.close();

		int ttd = 0;
		for (int i = 0; i < mm - 1; i++) {
			ttd += days[i];
		}
		ttd += dd; // 已過月份天數+本月天數

		if (mm > 2) {
			if (yy % 4 == 0 && yy % 100 != 0 || yy % 400 == 0) {
				ttd += 1;
			}
		}
		System.out.println("這是" + yy + "年的第" + ttd + "天");
		System.out.println("===========================");
	}
}
