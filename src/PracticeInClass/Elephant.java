package PracticeInClass;

public class Elephant extends Animal {
	private String name;
	
	public Elephant(){
		
	};
	

	public Elephant(int age, float weight, String name) { // 建構子
		super(age, weight); // 繼承了這兩個實體變數:private int age; private float weight;
		this.name = name;
	}

	public void speak() { 	//override複寫原speak方法
		super.speak();
		System.out.println("Name is " + name);
	}

//	public void setName(String name) { 
//		this.name = name;
//	}
	
	//JDK 5新增的功能: Annotation(標註)@:給Java相關工具或是框架看的資訊
	
	@Override  //讓編譯器對此方法是以override規則去檢查，只要一有違反規則，就會編譯失敗
	public void speak() {
		super.speak();
		System.out.println("Name is ") + name);
	}
}
