package PracticeInClass;

public class AnimalTest {
	public static void main(String[] args) {
		Animal a1 = new Animal(2,5.0f);//建構子，只能設定一次，修改要用get or set修改/取用
		a1.speak();//呼叫speak方法
		
		System.out.println("=== 時光飛逝，歲月如梭...轉眼間三年過去了 ===");
		
//		a1.age = 5;
//		a1.weight = 25.0f;
		
//		a1.Animal(5,25.0f);
//		
//		a1 = new Animal(5, 25.0f);
//		a1.speak();
		
		a1.setAge(5);
		a1.setWeight(25.0f);
		a1.speak();
	}
}
