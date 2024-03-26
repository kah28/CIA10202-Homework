package PracticeInClass;

public class TestNineNine {

	public static void main(String[] args) {
		// 先試做最基本的九九乘法表
//		int i, j;
//		for (i = 1; i <= 9; i++) {
//			for (j = 1; j <= 9; j++) {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//			}
//			System.out.println();

		// 題目一 用for + while迴圈
		int i, j;
		for (i = 1; i <= 9; i++) {
			j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();

			// 題目二 用for + do while迴圈
			for (i = 1; i <= 9; i++) {
				j = 1;
				do {
					System.out.print(i + "*" + j + "=" + i * j + "\t");
					j++;
				} while (j <= 9);
				System.out.println();
			}
//			
//			System.out.println("==========================");
//			
//			// 題目三 用while + do while迴圈， 待解決
//			i = 1;
//			while (i <= 9) {
//				j = 1; // j要放在小迴圈內，這樣1*9迴圈結束時，下一輪i=2才會重新從j=1開始
//				do {
//					System.out.print(i + "*" + j + "=" + i * j + "\t");
//					j++;
//				} while (j <= 9);
//				System.out.println();
//				i++;
				
//			}
		}
	}
}
