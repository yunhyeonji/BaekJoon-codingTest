package time3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Arrangement_1D {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*		
		int time = Integer.parseInt(br.readLine());	
		String[] num = br.readLine().split(" ");
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		for(int i=0;i<time;i++) {
			if(Integer.parseInt(num[i]) == n) {
				cnt++;
			}
		}
		System.out.println(cnt);
*/
/*	
		int time = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[time];
		for(int i=0;i<time;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[time-1]);
*/
/*		
		int[] b = new int[30];
		for(int i=0;i<28;i++) {
			int t = Integer.parseInt(br.readLine());
			b[t-1] = t;
		}
		
		for(int i=0;i<b.length;i++) {
			if(b[i] == 0) {
				System.out.println(i+1);
			}
		}
*/
		int time = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<time;i++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			
			int t = Integer.parseInt(st.nextToken());
			int[] arr = new int[t];
			double sum = 0;
			
			//평균을 구하세요
			for(int i1=0;i1<t;i1++) {
				arr[i1] = Integer.parseInt(st.nextToken());
				sum += arr[i1];
			}		
			double avg = (double)sum/t;
			
			double count = 0;		
			//평균보다 높은 사람을 구하시오
			for(int i2=0;i2<t;i2++) {
				if(arr[i2] > avg) {
					count++;
				}
			}
			sb.append((count/t)*100 + "%").append("\n");
		}
		System.out.println(sb);
		
	}
	
}
