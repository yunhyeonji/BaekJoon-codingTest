package time2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Combi {

	private static int[][] dp = new int[31][31];
	private static int combination(int n, int k) {
		// dp[][] �� ���� �ϸ� ���� 0���� Ŭ ����
		if(dp[n][k] > 0) {
			return dp[n][k];
		}
		else if(n == k || k == 0) {
			return dp[n][k] = 1;
		}
		// �Ϲ����� ��Ȳ
		else {
			return dp[n][k] = combination(n-1,k-1) + combination(n-1,k);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1010 �ٸ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int time = Integer.parseInt(br.readLine());
		for(int i=0;i<time;i++) {
			String[] s = br.readLine().split(" ");
			int N = Integer.parseInt(s[0]);
			int M = Integer.parseInt(s[1]);
			
			sb.append(combination(M,N)).append("\n");
		}
		
		br.close();
		System.out.println(sb);
	}

}
