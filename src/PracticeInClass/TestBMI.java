package PracticeInClass;

public class TestBMI {

//	請建立一個TestBMI.java,並計算自己的BMI值後輸出,另加入判
//	斷結果為過瘦、正常或是過重
//
//	• 提示一:BMI公式為體重(kg) / 身高2(m)
//
//	• 提示二:BMI<18.5為過瘦,18.5≦BMI<24為正常、BMI≧24為過胖
//
//	• 提示三:運算子 + if – else判斷	
	public static void main(String[] args) {
		double weight = 63, height = 1.67;
		double bmi = weight / (height * height);

		System.out.println("BMI = " + bmi);
		System.out.printf("BMI = %.2f%n", bmi);

//條件判斷第一版		
		if (bmi < 18.5) {
			System.out.println("過瘦");
		} else if (bmi >= 24) {
			System.out.println("過重");
		} else {
			System.out.println("正常");
		}

//條件判斷第二版	
		if (bmi < 18.5) {
			System.out.println("過瘦");
		} else if (bmi >= 18.5 && bmi < 24) {
			System.out.println("正常");
		} else {
			System.out.println("過胖");
		}

	}

}
