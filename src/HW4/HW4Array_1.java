package HW4;

import java.util.Scanner;

public class HW4Array_1 {

	public static void main(String[] args) {
	    //題目1
		/*有個一維陣列如下：
		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素*/
		
		int[] x = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println("平均值為" + sum / 10);

		System.out.println("大於平均值的有: ");
		for (int i = 0; i < x.length; i++) {
			if (x[i] > (sum / 10)) {
				System.out.print(x[i] + " ");
			}
		}
		System.out.println();
		System.out.println("===========================");

		// 題目2
		/*請建立一個字串，經過程式執行後，輸入結果是反過來的
		例如String s = “Hello World”，執行結果即為dlroW olleH*/
		
		String[] s = { "H", "e", "l", "l", "o", " ", "W", "o", "r", "l", "d" };
		for (int i = (s.length) - 1; i >= 0; i--) {
			System.out.print(s[i]);
		}
		System.out.println();
		System.out.println("===========================");

		// 題目3
		/*有個字串陣列如下(八大行星)：
		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)*/
		
		String[] p8 = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int vowel = 0;
		for (int i = 0; i < p8.length; i++) {
			for (int j = 0; j < p8[i].length(); j++) {
				switch (p8[i].charAt(j)) {
				case 'a':
					vowel = vowel + 1;
					break;
				case 'e':
					vowel = vowel + 1;
					break;
				case 'i':
					vowel = vowel + 1;
					break;
				case 'o':
					vowel = vowel + 1;
					break;
				case 'u':
					vowel = vowel + 1;
					break;
				}
			}
		}
		System.out.println("此字串內總共有"+ vowel +"個母音");
		System.out.println("===========================");
		
		// 題目4
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("阿文...還是小華，你要借多少錢?");
		int bm = sc.nextInt();
		
		int count = 0;
		
		int m[][]  = {
			{25, 32, 8, 19, 27},
			{2500, 800, 500, 1000, 1200}};
		
		System.out.println("以下員工編號的人可以借你錢:");
		for(int i = 0; i < m[1].length; i++ ) {
			if( bm <= m[1][i]) {
				count += 1;
				System.out.print(m[0][i] + ", ");
			}
		}
		System.out.println("總共有"+ count + "位");
		System.out.println("===========================");
		
		sc.close();
	
	
	}
	
}
