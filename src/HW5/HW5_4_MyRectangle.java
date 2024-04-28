package HW5;

public class HW5_4_MyRectangle {
	/*
	請設計一個類別MyRectangle：
	(1) 有兩個double型態的屬性為width, depth
	(2) 有三個方法：
	void setWidth(double width): 將收到的引數指定給width屬性
	void setDepth(double depth): 將收到的引數指定給depth屬性
	double getArea(): 能計算該長方形的面積
	(3) 有兩個建構子：
	public MyRectangle(): 不帶參數也無內容的建構子
	public MyRectangle(double width, double depth): 傳入的兩個引數會指定給對應的屬性
    */
	double width;
	double depth;
	
	//設定寬度
	void setWidth(double width) {
		if(width <= 0) {
			System.out.println("寬度必須大於0");
		}else {
			this.width = width;
		}
	}
	
	//設定長度
	void setDepth(double depth) {
		if(depth <= 0) {
			System.out.println("長度必須大於0");
		}else {
			this.depth = depth;
		}
	}
	
	//計算該長方形的面積
	double getArea(){
		double area;
		area = width * depth;
		return area;
	}
	
	public HW5_4_MyRectangle() {
	}
	
	public HW5_4_MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
		
	}
}
