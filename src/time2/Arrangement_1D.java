package time2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Arrangement_1D {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*		
		int time = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		int count = 0;
		int[] array = new int[time];
		
		for(int i=0;i<time;i++) {
			array[i] = Integer.parseInt(st.nextToken());
			if(array[i] == num) {
				count++;
			}
		}

		System.out.println(count);
*/
/*		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int time = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");
		br.close();
		
		StringBuilder sb = new StringBuilder();
		int[] array = new int[time];
		for(int i=0;i<time;i++) {
			array[i] = Integer.parseInt(st.nextToken());
			if(array[i] < num) {
				sb.append(array[i]+" ");
			}
		}
		System.out.println(sb);
*/
/*
		int time = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int[] array = new int[time];
		for(int i=0;i<time;i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = -1000000;
		int min = 1000000;
		
		for(int i=0;i<time;i++) {
			if(array[i] > max) {
				max = array[i];
			}
			if(array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(min + " " + max);
*/
/*		
		int[] array = new int[30];
		for(int i=0;i<28;i++) {
			int num = Integer.parseInt(br.readLine());
			array[num-1] = 1;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<30;i++) {
			if(array[i] != 1) {
				sb.append(i+1 + "\n");
			}
		}
		System.out.println(sb);
*/

		int[] array;
		
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		int t_time = Integer.parseInt(br.readLine());
		for(int i=0;i<t_time;i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int time = Integer.parseInt(st.nextToken()); //학생 수 
			
			//배열 생성
			array = new int[time];
			
			double sum = 0;	// 성적 누적 합 변수 
			
			// 성적 입력부분 
			for(int j = 0 ; j < time ; j++) {
				int val = Integer.parseInt(st.nextToken());	// 성적 저장
				array[j] = val;
				sum += val;	// 성적 누적 합 
			}
			double mean = (sum / time) ;
			double count = 0; // 평균 넘는 학생 수 변수 
			
			//학생 수 구하기
			for(int o=0;o<time;o++) {
				if(array[o] > mean) {
					count++;
				}
			}
			sb.append((count/time)*100 + "%\n");
		}
		System.out.println(sb);
		

	}
	
}
