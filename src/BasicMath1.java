import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicMath1 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb;
	
	public static int[][] APT = new int[15][15];
	public static void make_APT() {
		// 아파트 생성
		for (int i = 0; i < 15; i++) {
			APT[i][1] = 1; // i층 1호
			APT[0][i] = i; // 0층 i호
		}
 
		for (int i = 1; i < 15; i++) { // 1층부터 14층까지
			for (int j = 2; j < 15; j++) { // 2호부터 14호까지
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
/*
		String num = br.readLine();
		st = new StringTokenizer(num);
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		System.out.println(A/(C-B) > 0?A/(C-B)+1:-1);
*/
/* 어려워요...
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		
		while((1+(count*(6+6*count)/2)) < num) {
			count++;
			}
		System.out.print(count+1);
*/
/*	
		int X = Integer.parseInt(br.readLine());
		int cross_count = 1, prev_count_sum = 0;
 
		while (true) {
			// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
			if (X <= prev_count_sum + cross_count) {	
				
				if (cross_count % 2 == 1) {	// 대각선의 개수가 홀수라면 
					// 분자가 큰 수부터 시작
					// 분자는 대각선상 블럭의 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1) 
					// 분모는 X 번째 - 직전 대각선까지의 블럭 개수
					System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
					break;
				} 
				
				else {	// 대각선의 개수가 짝수라면 
					// 홀수일 때의 출력을 반대로 
					System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;
				}
 
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}
		
*/
/*		
		String s = br.readLine();
		st = new StringTokenizer(s);
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		double day = (double)(H-up)/(up-down)+1;
		
		System.out.println(day%1>0?(int)(day+1):(int)day);
*/
/*
		int T = Integer.parseInt(br.readLine());
		sb = new StringBuilder();
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			int H = Integer.parseInt(st.nextToken());
			st.nextToken(); //W는 사용안함 -> 버림
			int N = Integer.parseInt(st.nextToken());
			
			if (N % H == 0) {
				sb.append((H * 100) + (N / H)).append('\n');
						//몇바퀴 돌았는지 확인 -> 호수 정하기
			} else {
				sb.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
						//나머지가 있으면 차례로 1층부터 주기 -> 몇번 돌았는지 확인 -> 호수 정하기
			}
		}
*/
/*
		make_APT();	
		int T = Integer.parseInt(br.readLine());
		sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(APT[k][n] + "\n");
		}
		System.out.println(sb);
*/	
/*
		int N = Integer.parseInt(br.readLine());
		if (N == 4 || N == 7) {
			System.out.println(-1);
		}
		else if (N % 5 == 0) {
			System.out.println(N / 5);
		}
		else if (N % 5 == 1 || N % 5 == 3) {
			System.out.println((N / 5) + 1);
		}
		else if (N % 5 == 2 || N % 5 == 4) {
			System.out.println((N / 5) + 2);
		}
*/

		st = new StringTokenizer(br.readLine()," ");
		String str_A = st.nextToken();
		String str_B = st.nextToken();
		
		//두 길이 중 긴 것으로 통일시키기
		int max_length = Math.max(str_A.length(), str_B.length());
		int[] A = new int[max_length + 1]; //마지막숫자 올림할 가능성 열어두기
		int[] B = new int[max_length + 1]; //마지막숫자 올림할 가능성 열어두기
		
		// A 초기화
		for(int i = str_A.length() - 1, idx = 0; i >= 0; i--, idx++) {
			A[idx] = str_A.charAt(i) - '0';	// 맨 뒤 문자부터 역순으로 하나씩 저장
		}
		
		// B 초기화
		for(int i = str_B.length() - 1, idx = 0; i >= 0; i--, idx++) {
			B[idx] = str_B.charAt(i) - '0';	// 맨 뒤 문자부터 역순으로 하나씩 저장
		}
		
		// 덧셈
		for(int i = 0; i < max_length; i++) {
			int value = A[i] + B[i];
			A[i] = value % 10;		// 더한 값의 10으로 나눈 나머지가 자리값이 됨
			A[i + 1] += (value / 10);	// 더한 값의 10으로 나눈 몫이 올림값이 됨
		}
		
		// A배열 역순 출력
		// 가장 높은 자리수가 0일 수도 있기 때문에 0이 아닐 경우에만 출력
		sb = new StringBuilder();
		if(A[max_length] != 0) {
			sb.append(A[max_length]);
		}
		for(int i = max_length - 1; i >= 0; i--) {
			sb.append(A[i]);
		}
		
		System.out.println(sb);
		
	}
	
}
