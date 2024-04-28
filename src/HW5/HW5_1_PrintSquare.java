package HW5;

import java.util.Scanner;

public class HW5_1_PrintSquare {
	// 題目1
	/*
	 * 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如 圖
	 */
	public static void main(String[] args) {

		System.out.println("請輸入寬度與高度:");

		PrintSquare ps = new PrintSquare();

		ps.starSquare(); //呼叫方法
	}

public static class PrintSquare {

	public PrintSquare() {

		}

		public void starSquare() {

			Scanner sc = new Scanner(System.in);

			int width = sc.nextInt();
			int height = sc.nextInt();

			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
}