package HW5;

public class HW5_2_RandAvg {
	//題目2
	//請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	public static void main(String[] args) {
		
		PrintRandomNum pn = new PrintRandomNum();
		pn.randAvg();
	}

	public static class PrintRandomNum{
		
		public void randAvg() {
			
		int num[] =  new int[10];
		int sum = 0;
			
		for(int i = 0; i < 10; i++) {
			int r1 = (int) (Math.random() * 101); //隨機產生0~0.9的浮點數，故要*101進位，取0~100的整數。
			sum += r1;
			num[i] = r1;
		}
		
		System.out.println("共有此10個亂數: ");
		
		for(int i = 0; i < 10;i++) {
			System.out.print(num[i]+", ");
		}
		System.out.println("平均值為: "+ sum/10);
		
		}
		
	}	
	
}

