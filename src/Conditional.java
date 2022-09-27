import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Conditional {

	public static void main(StringProblem[] args) throws IOException {
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] array = new int[st.countTokens()];
		int count = 0;
		while(st.hasMoreElements()) {
			array[count] = Integer.parseInt(st.nextToken());
			count++;
		}
		
		if(array[0] > array[1]) {
			System.out.println(">");
		}else if(array[0] < array[1]) {
			System.out.println("<");
		}else if(array[0] == array[1]) {
			System.out.println("==");
		}
*/
/*
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
*/		
/*		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		if((year %4 == 0 && year%100 != 0) || year%400 == 0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
*/
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if(x > 0) {
			if(y > 0) {
				System.out.println("1");
			}else {
				System.out.println("4");
			}
		}else {
			if(y > 0) {
				System.out.println("2");
			}else {
				System.out.println("3");
			}
		}
*/
/*		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] array = new int[st.countTokens()];
		int count=0;
		while(st.hasMoreElements()) {
			array[count] = Integer.parseInt(st.nextToken());
			count++;
		}
		br.close();
		
		int hour = array[0];
		int min = array[1];
		
		if(min - 45 < 0) {
			hour -= 1;
			if(hour < 0) {
				hour = 24 + (hour);
			}
			min = 60 + (min - 45);
		}else {
			min -= 45;
		}
		System.out.println(hour + " " + min);
*/
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Time = br.readLine();
		int timer = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(Time);
		int[] array = new int[st.countTokens()];
		int count = 0;
		while(st.hasMoreElements()){
			array[count] = Integer.parseInt(st.nextToken());
			count++;
		}
		br.close();
		
		int hour = array[0];
		int min = array[1];
		
		// 시간 문제는 분이 60이 넘거나 시간이 24를 넘는 상황을 따져줘야 한다.
		hour += (timer/60);
		min += (timer%60);
		if(min >= 60) {
			hour += 1;
			if(hour >= 24) {
				hour -= 24;
			}
			min -= 60;
		}
		
		System.out.println(hour +" "+min);
*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] array = new int[st.countTokens()];
		int count=0;
		while(st.hasMoreElements()) {
			array[count] = Integer.parseInt(st.nextToken());
			count++;
		}
		br.close();
		
		int a = array[0];
		int b = array[1];
		int c = array[2];
		int score = 0;
		if(a == b && b == c) {
			score = 10000 + a*1000;
		}else if(a == b || a == c || b == c) {
			if(a == b || a == c) {
				score = 1000 + a*100;
			}else {
				score = 1000 + b*100;
			}
			
		}else {
			int max = a;
			if(b>max) {
				max = b;
				if(c>max) {
					max = c;
				}
			}else if(c>max) {
				max = c;
			}
			score = max*100;
		}
		
		System.out.println(score);
		

	}

}
