package PracticeInClass;

public class Elephant extends Animal {
	private String name;

	public Elephant(int age, float weight, String name) {  //建構子
		super(age, weight);  //	繼承了這兩個實體變數:private int age; private float weight;
		this.name = name;
	}
		
	public void speak() {
		super.speak();
		System.out.println("Name is "+ name);
	}	
	
	
//	public void setName(String name) { 
//		this.name = name;
//	}

	public static void main(String[] args) {
		Animal a1 = new Animal(3, 8.0f);
		Elephant e1 = new Elephant(8,1200.0f,"大象");
		
		a1.speak();
		e1.speak();
	}
}
