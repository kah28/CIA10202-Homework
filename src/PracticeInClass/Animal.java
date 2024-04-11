package PracticeInClass;

public class Animal {
	private int age;
	private float weight;
	
	//再把無參數建構子宣告回來(習慣)
	public Animal() {
		//1.保留給子類別super呼叫的彈性
		//2.無參數建構子也是Java Bean的規範之一 (之後課程會介紹)
		//3.給日後搭配的框架呼叫使用(框架幫我們建立物件就是呼叫此建構子)
	}

	public Animal(int age, float weight) { // 不寫型別
		this.age = age; //this 指「這個物件(實體變數)」
		this.weight = weight;
	}

	public void speak() {
		System.out.println("Age is " + age);// 實體變數的age
		System.out.println("Weight is " + weight); // 實體變數的weight
	}
	
//	**********************************************************************
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public int getAge(){
		return age;
	}
	
	public float getWeight() {
		return weight;
	}
}
