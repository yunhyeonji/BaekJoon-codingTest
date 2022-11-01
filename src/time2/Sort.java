package time2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Sort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*		
		double sum = 0;
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			int a =  Integer.parseInt(br.readLine());
			arr[i] = a;
			sum += a;
		}
		int avg = (int)(sum / arr.length);
		
		Arrays.sort(arr);
		System.out.println(avg + "\n" + arr[2]);
*/
/*
		int time = Integer.parseInt(br.readLine());
		
		int arr[] = new int[time];
		for(int i=0;i<time;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		StringBuilder sb = new StringBuilder();
		Arrays.sort(arr);
		for(int i=0;i<time;i++) {
			sb.append(arr[i]+"\n");
		}
		System.out.println(sb);
*/
/*		
		//카운팅정렬
		int time = Integer.parseInt(br.readLine());
			// 0 ~ 10000 까지의 수.
		int arr[] = new int[10001];
		for(int i=0;i<time;i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<arr.length;i++) {
			while(arr[i] > 0) {
				sb.append(i + "\n");
				arr[i]--; // 중복되는 숫자가 있으므로 카운트를 하나씩 줄여가며 실행
			}
		}
		System.out.println(sb);
*/
		
		int time = Integer.parseInt(br.readLine());
		int[][] arr = new int[time][2];
		
		for(int i=0;i<time;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<2;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}
				return o1[0] - o2[0];
			}
			
		});
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<time;i++) {
			for(int j=0;j<2;j++) {
				sb.append(arr[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
