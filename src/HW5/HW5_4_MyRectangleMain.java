package HW5;

public class HW5_4_MyRectangleMain {
	
	/*請另外建立一個MyRectangleMain類別，此類別只有main方法
	(1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
	(2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
	*/
	
	public static void main(String[] args) {

		HW5_4_MyRectangle m1 = new HW5_4_MyRectangle(); //無參數建構子
		m1.setWidth(10);
		m1.setDepth(20);
		System.out.println("此矩形面積為:" + m1.getArea());
		
		HW5_4_MyRectangle m2 = new HW5_4_MyRectangle(10, 20);
		System.out.println("此矩形面積為:" + m2.getArea());
		
	}

}
