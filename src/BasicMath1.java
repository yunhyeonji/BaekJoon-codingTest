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
		// ����Ʈ ����
		for (int i = 0; i < 15; i++) {
			APT[i][1] = 1; // i�� 1ȣ
			APT[0][i] = i; // 0�� iȣ
		}
 
		for (int i = 1; i < 15; i++) { // 1������ 14������
			for (int j = 2; j < 15; j++) { // 2ȣ���� 14ȣ����
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
/* �������...
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
			// ���� �밢�� ������ + �ش� �밢�� ���� �̿��� ���� �Ǻ�
			if (X <= prev_count_sum + cross_count) {	
				
				if (cross_count % 2 == 1) {	// �밢���� ������ Ȧ����� 
					// ���ڰ� ū ������ ����
					// ���ڴ� �밢���� ���� ���� - (X ��° - ���� �밢�������� �� ���� - 1) 
					// �и�� X ��° - ���� �밢�������� �� ����
					System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
					break;
				} 
				
				else {	// �밢���� ������ ¦����� 
					// Ȧ���� ���� ����� �ݴ�� 
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
			st.nextToken(); //W�� ������ -> ����
			int N = Integer.parseInt(st.nextToken());
			
			if (N % H == 0) {
				sb.append((H * 100) + (N / H)).append('\n');
						//����� ���Ҵ��� Ȯ�� -> ȣ�� ���ϱ�
			} else {
				sb.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
						//�������� ������ ���ʷ� 1������ �ֱ� -> ��� ���Ҵ��� Ȯ�� -> ȣ�� ���ϱ�
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
		
		//�� ���� �� �� ������ ���Ͻ�Ű��
		int max_length = Math.max(str_A.length(), str_B.length());
		int[] A = new int[max_length + 1]; //���������� �ø��� ���ɼ� ����α�
		int[] B = new int[max_length + 1]; //���������� �ø��� ���ɼ� ����α�
		
		// A �ʱ�ȭ
		for(int i = str_A.length() - 1, idx = 0; i >= 0; i--, idx++) {
			A[idx] = str_A.charAt(i) - '0';	// �� �� ���ں��� �������� �ϳ��� ����
		}
		
		// B �ʱ�ȭ
		for(int i = str_B.length() - 1, idx = 0; i >= 0; i--, idx++) {
			B[idx] = str_B.charAt(i) - '0';	// �� �� ���ں��� �������� �ϳ��� ����
		}
		
		// ����
		for(int i = 0; i < max_length; i++) {
			int value = A[i] + B[i];
			A[i] = value % 10;		// ���� ���� 10���� ���� �������� �ڸ����� ��
			A[i + 1] += (value / 10);	// ���� ���� 10���� ���� ���� �ø����� ��
		}
		
		// A�迭 ���� ���
		// ���� ���� �ڸ����� 0�� ���� �ֱ� ������ 0�� �ƴ� ��쿡�� ���
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
