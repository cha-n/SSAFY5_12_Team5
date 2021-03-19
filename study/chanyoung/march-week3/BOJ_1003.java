// 1003, 피보나치 함수
package BOJ;

import java.io.*;

public class BOJ_1003 {

	static int T, N;
	static int[][] dp = new int[41][2];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		T = Integer.parseInt(br.readLine());
//		makeDp();
		
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;

		// 점화식
		for (int i = 2; i <= 40; i++) {
			dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
			dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
		}
		
		for (int i=0;i<T;i++) {
			int temp = Integer.parseInt(br.readLine());
			System.out.println(dp[temp][0]+" "+dp[temp][1]);
//			sb.append(String.format("%d %d%n", dp[temp][0], dp[temp][1]));
		}
//		System.out.println(sb);
	}

	
	static void makeDp() {
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;

		for (int i = 2; i <= 40; i++) {
			dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
			dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
		}
	}

}
