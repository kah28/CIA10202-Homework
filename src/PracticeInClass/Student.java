package PracticeInClass;

public class Student {
	int score = 90; // 自己指定預設值

	// 每休息一個小時，score會就減1
	public void play(int hours) { // hours是參數
		score -= hours; // -= 等同 sum = sum - 1
	}

	// 每念書一個小時，score就會加1
	public void study(int hours) {
		score += hours;
	}

	// (使用new)創建兩個學生stu1, stu2的實體
	// 給定參數
	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();

		System.out.println(stu1.score);
		System.out.println(stu2.score);

		stu1.play(2); // 給stu1參數
		stu1.study(6);

		stu2.play(5); // 給stu2參數
		stu2.study(2);

		System.out.println("============");

		System.out.println(stu1.score);
		System.out.println(stu2.score);

	}
}
