package time2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringProblem {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println(br.read());
/*		
 		// �迭�� ������� ����
		int time = Integer.parseInt(br.readLine());
		String arr = br.readLine();
		
		int sum = 0;
		for(int i=0;i<arr.length();i++) {
			sum += arr.charAt(i) - '0';
		}
		System.out.println(sum);

		//�迭�� ����Ͽ� �ذ�
		int time = Integer.parseInt(br.readLine());
		String arr = br.readLine();
		int[] a = new int[time];
		
		for(int i=0;i<time;i++) {
			a[i] = arr.charAt(i) - '0';
		}
		int sum = 0;
		for(int i=0;i<time;i++) {
			sum += a[i];
		}
		System.out.println(sum);
*/	
/*		//#10809
		String str = br.readLine();
		int[] arr = new int[26];
		
		//�迭 �ʱ�ȭ �ϱ�
		for(int i=0;i<arr.length;i++) {
			arr[i] = -1;
		}
		//���ĺ���ġ�� ���� �־��ֱ�
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i) - 'a'] = i;
		}
		//�迭 ����ϱ�
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i] + " ");
		}
		System.out.println(sb);
*/
/*		//#2675
		int time = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<time;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int loop = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			
			//����Ͻÿ�			
			for(int j=0;j<str.length();j++) {
				for(int k=0;k<loop;k++) {
					sb.append(str.charAt(j));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
*/
/*	
		String str = br.readLine();
		String U_str = str.toUpperCase();
		
		int[] arr = new int[26];
		for(int i=0;i<U_str.length();i++) {
			arr[U_str.charAt(i) - 'A']++;
		}
		
		int max = -1;
		char ch = '?';
 
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char)(i+'A'); // ���� i�� 0~25��� �迭���ڿ� �Ұ��� -> ���ĺ��� �ٽ� ����ؾ��ϹǷ� 'A'�� �ٽ� ������� �Ѵ�. 
			}
			else if (arr[i] == max) {
				ch = '?';
			}
		}
 
		System.out.print(ch);
*/

		int time = Integer.parseInt(br.readLine());	
		int count = 0;
		
		int pre = 0;
		for(int i=0;i<time;i++) {
			String str = br.readLine();
			boolean[] arr = new boolean[26];
			boolean tep = true;
			
			for(int j=0;j<str.length();j++) {
				int now = str.charAt(j);
				
				if(now != pre) { //�׷�ܾ��� ������ �� ����
					if(arr[now - 'a'] == false) {
						arr[now - 'a'] = true; //now�� �׷�ܾ�� ����
						pre = now;
					}
					else {
						//now��� �ܾ �̹� �׷�ܾ��� �������������� ���߿� �� ���� -> �׷�ܾ �ƴ��� �ǹ�
						tep = false;
						break;
					}
				}
				else { //pre�� now�� ������ -> 1��° ���ڳ��� ���ϴ� ��Ȳ�� ���� ���� true�� �ٲٱ�.
					arr[now - 'a'] = true;
				}
			}
			if(tep) {count++;}
		}
		System.out.println(count);
	}

}
