package time3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop {

	public static void main(String[] args) throws NumberFormatException, IOException {
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int time = Integer.parseInt(br.readLine());
		for(int i=0;i<time;i++) {
			String[] arr = br.readLine().split(" ");
			int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
			sb.append(sum + "\n");
		}
		System.out.println(sb);
*/
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int time = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();

		for(int i=1;i<=time;i++) {
			int n=1;
			while(n<=i) {
				sb.append("*");
				n++;
			}
			sb.append("\n");
		}
		System.out.println(sb);
*/
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int time = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();

		for(int i=1;i<=time;i++) {
			//공백
			for(int j=time-i;j>0;j--) {
				sb.append(" ");
			}
			//별
			for(int p=1;p<=i;p++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
*/
/*		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int time = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();

		for(int i=0;i<time;i++) {
			for(int j=1;j<=i+1;j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);

	//별 거꾸로 나타내기
		for(int p=0;p<time;p++) {
			for(int i=time-1;i>p;i--) {
				sb.append(" ");
			}
			for(int j=1;j<=p+1;j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int cnt = 0;
		int copy = N;
        
		while (true) {
				//일의 자리숫자를 십의 자리로 , 각 자리 숫자를 더해서 일의 자리 숫자만 가져오기
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
 
			if (copy == N) {
				break;
			}
		}
		System.out.println(cnt);
		
	}

}
