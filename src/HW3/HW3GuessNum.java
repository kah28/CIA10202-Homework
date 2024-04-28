package HW3;

import java.util.Scanner;

public class HW3GuessNum {
	public static void main(String[] args) {
		int ans;
		ans = (int) (Math.random() * 10) + 1;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("開始猜數字吧!");
		System.out.println("請輸入1~10的數字: ");
		int guess = sc.nextInt();
		
		while (guess != ans) {
			System.out.println("猜錯囉");
			guess = sc.nextInt();
		}
		System.out.println("答對了!答案就是" + ans);

		sc.close(); // 關閉Scanner
	}
}
