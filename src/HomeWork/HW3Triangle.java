package HomeWork;

import java.util.Scanner;

public class HW3Triangle {

//題目1
//請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入邊長1: ");
		int a = sc.nextInt();
		
		System.out.println("請輸入邊長2: ");
		int b = sc.nextInt();
		
		System.out.println("請輸入邊長3: ");
		int c = sc.nextInt();
		
		if(a + b <= c || a + c <= b || b + c <= 1) {
			System.out.println("此三邊長不是三角形");
		}
		else if(a == b && a == c) {
			System.out.println("此為正三角形");
		}
		else if(a == b || a == c || b == c) {
			System.out.println("此為等腰三角形");
		}
		else {
			System.out.println("此為其它三角形");
		}
		
		sc.close(); //關閉Scanner
	}
	
}
