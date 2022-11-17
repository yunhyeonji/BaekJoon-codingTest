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
 		// 배열을 사용하지 않음
		int time = Integer.parseInt(br.readLine());
		String arr = br.readLine();
		
		int sum = 0;
		for(int i=0;i<arr.length();i++) {
			sum += arr.charAt(i) - '0';
		}
		System.out.println(sum);

		//배열을 사용하여 해결
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
		
		//배열 초기화 하기
		for(int i=0;i<arr.length;i++) {
			arr[i] = -1;
		}
		//알파벳위치에 숫자 넣어주기
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i) - 'a'] = i;
		}
		//배열 출력하기
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
			
			//출력하시오			
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
				ch = (char)(i+'A'); // 현재 i는 0~25라는 배열숫자에 불과함 -> 알파벳을 다시 출력해야하므로 'A'를 다시 더해줘야 한다. 
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
				
				if(now != pre) { //그룹단어라고 생각할 수 있음
					if(arr[now - 'a'] == false) {
						arr[now - 'a'] = true; //now는 그룹단어라 여김
						pre = now;
					}
					else {
						//now라는 단어가 이미 그룹단어라고 여겨지고있지만 나중에 또 나옴 -> 그룹단어가 아님을 의미
						tep = false;
						break;
					}
				}
				else { //pre와 now가 같을때 -> 1번째 글자끼리 비교하는 상황일 수도 있음 true로 바꾸기.
					arr[now - 'a'] = true;
				}
			}
			if(tep) {count++;}
		}
		System.out.println(count);
	}

}
