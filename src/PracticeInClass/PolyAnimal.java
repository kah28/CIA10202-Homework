package PracticeInClass;

public class PolyAnimal extends AnimalTest {

	public static void main(String[] args) {
		Animal[] objs = new Animal[3]; //Animal 是Animal跟Elephant的共同父類別，建立一個陣列物件

		objs[0] = new Elephant(10, 2000.0f, "David");
		objs[1] = new Animal(2, 5.0f);
		objs[2] = new Elephant(5, 1000.0f, "James");

		for (int i = 0; i < objs.length; i++) {
			objs[i].speak(); //原speak方法內已經有使用println的功能，故直接呼叫該功能即可
			System.out.println("====================");
		}
	}
}
