package HomeWork;

public class HW1 {
	public static void main(String[] args) {
		// 題目1
		int num1 = 12, num2 = 6;
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);

		// 題目2
		int alleggs = 200;
		int dozen = alleggs / 12;
		int egg = alleggs % 12;
		System.out.println("200顆蛋總共是" + dozen + "打" + egg + "顆");

		// 題目3
		int totalSec = 256559; // 秒數
		int days = totalSec / 60 / 60 / 24; // 一天有86400秒
		int hrs = ((totalSec - (days * 60 * 60 * 24)) / 60 / 60); // 一小時有3600秒
		int min = ((totalSec - (days * 24 * 60 * 60) - (hrs * 60 * 60)) / 60); // 一分鐘有60秒
		int sec = (totalSec - (days * 86400) - (hrs * 3600) - (min * 60));
		System.out.println("256559總共是" + days + "天又" + hrs + "小時又" + min + "分" + sec + "秒");

		// 題目4
		final double PI = 3.1415;
		double r = 5;
		System.out.println("此圓的面積為：" + r * r * PI);
		System.out.println("此圓的周長為：" + r * 2 * PI);

		// 題目5 本利和公式:本利和 = 本金 × (1 + 年利率)^期間
		double saving = 1500000;
		System.out.println(saving * Math.pow(1.02, 10));// Math.pow計算1.02的10次方

		// 題目5 寫法二(用for迴圈)

		// 題目6
		System.out.println(5 + 5); // 兩整數計算: 5+5=10
		System.out.println(5 + '5');// 整數的5加上字元5(unicode代碼為53)，故等於5+53=58
		System.out.println(5 + "5");// 整數5，串接字串"5"，故匯出結果為55

	}
}
