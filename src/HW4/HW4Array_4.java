package HW4;

public class HW4Array_4 {

	public static void main(String[] args) {
		// 題目6
		//班上有8位同學，他們進行了6次考試，請算出每位同學考最高分的次數
		
		int[][] test = { { 10, 35, 40, 100, 90, 85, 75, 70}, // 第1次小考分數
				{ 37, 75, 77, 89, 64, 75, 70, 95}, // 2...以此類推
				{ 100, 70, 79, 90, 75, 70, 79, 90}, 
				{ 77, 95, 70, 89, 60, 75, 85, 89},
				{ 98, 70, 89, 90, 75, 90, 89, 90}, 
				{ 90, 80, 100, 75, 50, 20, 99, 75} };

		int highScore[] = new int[6]; // 存放6次小考的最高分
		int studentScore[] = new int[6]; // 每次最高分同學的索引值

		for (int i = 0; i < test.length; i++) { // 6次小考
			for (int j = 0; j < test[i].length; j++) { // 每次8個分數
				if (test[i][j] > highScore[i]) {
					highScore[i] = test[i][j]; // 每次小考，所有分數逐次往後比較，最高分填入highScore陣列
					studentScore[i] = j; //填入最高分同學的索引值
				}
			}

		}

		int highScoreCount[] = new int[8];

		// 計算每位同學得最高分的次數
		for (int i = 0; i < studentScore.length; i++) {
			highScore[i] = highScoreCount[studentScore[i]]++;
		}

		// 輸出結果
		for (int i = 0; i < highScoreCount.length; i++) {
			System.out.println((i + 1) + "號同學總共考了" + highScoreCount[i] + "次最高分");
		}

	}
}
