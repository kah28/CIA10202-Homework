package PracticeInClass;

public class Cube {
	
	private double length;

	public Cube() {
		
	}
	
	public Cube(double length) throws CubeException { //建構子
		setLength(length);
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) throws CubeException{
		if (length > 0)
			this.length = length;
		else
			throw new CubeException("正立方體邊常不得為0或是負數"); //丟出有問題的訊息給呼叫端
	}
	
	
	//取得體積結果
	public double getVolume() {
		return Math.pow(length, 3);
	}

}
