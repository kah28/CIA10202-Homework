package PracticeInClass;

public class Test4Numbers {
	public static void main(String[] args) {
		// 寫法1
		for (int i = 0; i <= 100; i++) {
			if (i % 4 == 0)
				System.out.print(i + " ");
		}
		System.out.println(); // 換行功能
		System.out.print("/n");
		
		// 寫法2
		for (int i = 0; i <= 0; i += 4) {
			System.out.print(i + " "); //
		}
	}
}
