import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringProblem {

	public static void main(java.lang.String[] args) throws IOException {
/*
		Scanner sc = new Scanner(System.in);
		int ch = sc.next().charAt(0);
		System.out.println(ch);
*/
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String num = br.readLine();

		int total = 0;
		for(int i=0;i<count;i++) {
			total += (num.charAt(i) - '0');
		}
		System.out.println(total);
*/
/*	어려웠다!
		int[] arr = new int[26];
		for(int i=0;i<arr.length;i++) {
			arr[i] = -1;
		}
		
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		for(int i=0;i<S.length();i++) {
			char ch = S.charAt(i);
			
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
			
		}
		
		for(int val : arr) {
			System.out.print(val + " ");
		}
*/
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		for(int i=0;i<T;i++) {
			s = br.readLine();
			st = new StringTokenizer(s);
			int count = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			for(int k=0;k<S.length();k++) {
				for(int j=0;j<count;j++) {
					bw.write(S.charAt(k));
				}
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
*/
/*
		int[] arr = new int[26];
		for(int i=0;i<arr.length;i++) {
			arr[i] = 0;
		}
		
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		for(int i=0;i<S.length();i++) {
			arr[(S.toUpperCase().charAt(i) - 'A')] += 1;
		}
		
		int max = -1;
		char ch = '?';
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65);
			}else if(arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
*/
/*	
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		StringTokenizer st = new StringTokenizer(S);
		System.out.println(st.countTokens());
*/
/*
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		StringTokenizer st = new StringTokenizer(S);

		int[] arr = new int[st.countTokens()];
		for(int i=0;i<arr.length;i++) {
			String num = st.nextToken();
			arr[i] = (num.charAt(2)-'0')*100 + (num.charAt(1)-'0')*10 + (num.charAt(0)-'0');
		}
		
		if(arr[0] > arr[1]) {
			System.out.println(arr[0]);
		}else {
			System.out.println(arr[1]);
		}
*/
/*		
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int count = 0;
		for(int i=0;i<S.length();i++) {
			switch(S.charAt(i)) {
			case 'A' : case 'B': case 'C' :
				count += 3;
				break;
				
			case 'D' : case 'E': case 'F' : 
				count += 4; 
				break;
                
			case 'G' : case 'H': case 'I' : 
				count += 5; 
				break;
                
			case 'J' : case 'K': case 'L' : 
				count += 6; 
				break;
                
			case 'M' : case 'N': case 'O' : 
				count += 7; 
				break;
                
			case 'P' : case 'Q': case 'R' : case 'S' :
				count += 8; 
				break;
                
			case 'T' : case 'U': case 'V' : 
				count += 9; 
				break;
                
			case 'W' : case 'X': case 'Y' : case 'Z' : 
				count += 10; 
				break;
			}
		}
		System.out.println(count);
*/
/*		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == 'c') {
				if(s.charAt(i+1) == '-' || s.charAt(i+1) == '=') {
					i++;
				}
			}
			else if(s.charAt(i) == 'd') {
				if(s.charAt(i+1) == 'z' && s.charAt(i+2) == '=') {
					i += 2;
				}
				else if(s.charAt(i+1) == '-'){
					i++;
				}
			}
			else if(s.charAt(i) == 'l') {
				if(s.charAt(i+1) == 'j') {
					i++;
				}
			}else if(s.charAt(i) == 'n') {
				if(s.charAt(i+1) == 'j') {
					i++;
				}
			}else if(s.charAt(i) == 's') {
				if(s.charAt(i+1) == '=') {
					i++;
				}
			}else if(s.charAt(i) == 'z') {
				if(s.charAt(i+1) == '=') {
					i++;
				}
			}
			count++;
			
		}
		System.out.println(count);
*/		
		
		
		int time = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i=0;i<time;i++) {
			if(check() == true) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = br.readLine();
		
		for(int i=0;i<str.length();i++) {
			int now = str.charAt(i);
			//앞선 문자와 i번째 문자가 같지 않다면?
			if(prev != now) {
				//해당 문자가 처음 나온 경우 => false인 경우
				if(check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
				}
				//해당 문자가 이미 나온적이 있는 경우 = true인 경우
				else {
					return false;
				}
			}
			else {
				continue;
			}
		}
		return true;
	}

}
