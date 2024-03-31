package PracticeInClass;

public class Animal {
	private int age;
	private float weight;

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
