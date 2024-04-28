package HW6;

import java.lang.Math;

public class Calculator {

	private int x;
	private int y;

	public Calculator() { // 無參數的建構子

	}

	public void powerXY(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義!"); //x與y同時為0
		} else if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數!");//y為負值，而導致x的y次方結果不為整數
		} else {
			System.out.println((int) Math.pow(x, y));//x與y皆正確情況下，會顯示運算後結果
		}
	}
}
