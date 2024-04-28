package HW5;

public class HW5_5_GenAuthCode {

	public static void main(String[] args) {
		HW5_5_GenAuthCode r1 = new HW5_5_GenAuthCode();

		r1.genAuthCode();
	}

	private void genAuthCode() {
		String code = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; //列出所有密碼選項
		
		char charArray[] = code.toCharArray(); //將字串轉成陣列

		System.out.println("本次隨機產生驗證碼為:");
		
		for (int i = 0; i < 8; i++) {
			System.out.print(charArray[(int) (Math.random() * 62)]);//從字串中隨機抽取一個密碼，重複8次
		}
	}
}