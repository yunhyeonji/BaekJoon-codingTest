import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Arrangement_1D {

	public static void main(String[] args) throws IOException {
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] array = new int[st.countTokens()];
		int max = 0,min = 0;
		br.close();
		for(int i=0;i<num;i++) {
			array[i] =Integer.parseInt(st.nextToken());
			if(array[i] > max) {
				max = array[i];
			}
			if(array[i] <= 1000000) {
				min = array[i];
			}
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(min+" "+max);
		bw.flush();
		bw.close();
*/
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] array = new int[9];
		for(int i=0;i<array.length;i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		int max = 0;
		int count = 0;
		for(int j=0;j<array.length;j++) {
			max = Math.max(max, array[j]);
			count = j;
		}
		bw.write(max+"\n"+count);
		bw.flush();
		bw.close();
*/
/*	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<10;i++) {
			hs.add((Integer.parseInt(br.readLine()))%42);
		}
		br.close();
		
		System.out.println(hs.size());
*/
/*
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		double arr[] = new double[Integer.parseInt(br.readLine())];
        
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		double sum = 0;
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / arr[arr.length - 1]) * 100);
		}
		System.out.print(sum / arr.length);
*/
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int test_case = Integer.parseInt(br.readLine());
		String arr[] = new String[test_case];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = br.readLine();
		}
		
		for(int i=0;i<test_case;i++) {
			int cnt = 0; //연속횟수
			int sum = 0; //누적합산
			
			for(int j=0;j<arr[i].length();j++) {
				if(arr[i].charAt(j) == 'O') {
					cnt++;
				}else {
					cnt = 0;
				}
				sum += cnt;
			}
			bw.write(sum+"\n");			
		}
		br.close();
		bw.flush();
		bw.close();
*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr;
		
		int testcase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0 ; i < testcase ; i++) {
 
			st = new StringTokenizer(br.readLine()," "); // 학생 수 및 성적 입력
			
			
			int N = Integer.parseInt(st.nextToken());	//학생 수 
			arr = new int[N];
			
			double sum = 0;	// 성적 누적 합 변수 
			
			// 성적 입력부분 
			for(int j = 0 ; j < N ; j++) {
				int val = Integer.parseInt(st.nextToken());	// 성적 저장
				arr[j] = val;
				sum += val;	// 성적 누적 합 
			}
			
			double mean = (sum / N) ;
			double count = 0; // 평균 넘는 학생 수 변수 
			
			// 평균 넘는 학생 비율 찾기 
			for(int j = 0 ; j < N ; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
		
		
		
	}

}
