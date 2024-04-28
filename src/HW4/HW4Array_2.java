package HW4;

import java.util.Scanner;

public class HW4Array_2 {
	public static void main(String[] args) {

		// 題目4
		/*阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5個,其員工編號與身上現金如表，
		請設計一個程式,可以讓阿文輸入欲借的金額後,便會顯示哪些員工編號的同事錢可借他;
		並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的員工編號: 25 19 27 共3 人!」*/

		Scanner sc = new Scanner(System.in);

		System.out.println("阿文，你要借多少錢?");
		int bm = sc.nextInt();

		int count = 0;

		int m[][] = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		System.out.println("以下員工編號的人可以借你錢:");
		for (int i = 0; i < m[1].length; i++) {
			if (bm <= m[1][i]) {
				count += 1;
				System.out.print(m[0][i] + ", ");
			}
		}
		System.out.println("總共有" + count + "位");
		System.out.println("===========================");
		
		sc.close();
	}
}
