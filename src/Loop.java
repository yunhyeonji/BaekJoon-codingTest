import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Loop {

	public static void main(StringProblem[] args) throws IOException {
/*
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i=1;i<=9;i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
*/
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<count;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a+b);
			sb.append("\n");
		}
		br.close();
		System.out.println(sb);
*/		
/*
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int factorial = 0;
		for(int i=1;i<=num;i++) {
			factorial += i;
		}
		System.out.println(factorial);
*/
/*		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		int count = Integer.parseInt(br.readLine());
		int test = 0;
		for(int i=0; i<count;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int price = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			test += price*num;
		}
		br.close();
		if(total == test) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
*/
/*		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0; i<count;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(a+b+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
*/
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int count = Integer.parseInt(br.readLine());
		for(int i=1;i<=count;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append("Case #"+i+": " + (a+b) +"\n");
		}
		br.close();
		System.out.println(sb);
*/
/*		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int count = Integer.parseInt(br.readLine());
		for(int i=1;i<=count;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write("Case #"+i+": "+ a+" + "+b+" = "+(a+b)+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
*/	
/*	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
//		for(int i=1;i<=num;i++) {
//			for(int j=1;j<=i;j++) {
//				bw.write("*");
//			}
//			bw.write("\n");
//		}
		
		for(int i=1;i<=num;i++) {
			for(int j=num-i;j>=1;j--) {
				bw.write(" ");
			}for(int k=1;k<=i;k++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		br.close();
		bw.flush();
		bw.close();
*/
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int count = Integer.parseInt(st1.nextToken());
		int num = Integer.parseInt(st1.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int[] array = new int[count];
		int i=0;
		while(st2.hasMoreElements()) {
			array[i] = Integer.parseInt(st2.nextToken());
			i++;
		}
		for(int j=0;j<count;j++) {
			if(array[j] < num) {
				bw.write(array[j]+" ");
			}
		}
		br.close();
		bw.flush();
		bw.close();
*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int copy = N;
        
		do {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
		} while (copy != N);
		
		System.out.println(cnt);
		
	}
	
}
