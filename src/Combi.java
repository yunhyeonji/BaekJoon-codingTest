import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Combi {

	public static void main(String[] args) throws NumberFormatException, IOException {
/*		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		while(n1 != 0 && n2 != 0) {
			if(n1 % n2 == 0) {sb.append("multiple").append("\n");}
			else if(n2 % n1 == 0) {sb.append("factor").append("\n");}
			else {sb.append("neither").append("\n");}
			
			st = new StringTokenizer(br.readLine());
			n1 = Integer.parseInt(st.nextToken());
			n2 = Integer.parseInt(st.nextToken());
		}
		System.out.println(sb);
*/
/*		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		if(num % 2 == 0) {
			System.out.println(arr[(num/2)-1] * arr[num/2]);
		}else {
			System.out.println(arr[num/2] * arr[num/2]);
		}
*/
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int num1 = Integer.parseInt(st.nextToken()), num2 = Integer.parseInt(st.nextToken());

        long gcd = getGCD(Math.max(num1, num2), Math.min(num1, num2));
        long lcm = getLCM(num1, num2, gcd);
        
        System.out.println(gcd);
        System.out.println(lcm);
*/
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0;i<num;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int num1 = Integer.parseInt(st.nextToken()), num2 = Integer.parseInt(st.nextToken());
			
			long gcd = getGCD(Math.max(num1, num2),Math.min(num1, num2));
			long lcm = getLCM(num1,num2,gcd);
			bw.write(lcm+"\n");
		}
		bw.flush();
		bw.close();
*/
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int time = Integer.parseInt(br.readLine());
		int[] arr = new int[time];
		
		String s = br.readLine();
		br.close();
		StringTokenizer st = new StringTokenizer(s);
		
		for(int i=0;i<time;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for(int i=1;i<time;i++) {
			long gcd = getGCD(Math.max(arr[0], arr[i]), Math.min(arr[0], arr[i]));
			bw.write(arr[0]/gcd + "/" + arr[i]/gcd);
			bw.write("\n");
		}
		bw.flush();
		bw.close();
*/
/*		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String s = br.readLine();
		st = new StringTokenizer(s);
		
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int sum = 1,sumk = 1;
		for(int i=0;i<k;i++,N--) {
			sum = sum * N;
			sumk = sumk * (i+1);
		}
		System.out.println(sum/sumk);
*/

		
	}
	//유클리드 호제 법
	public static long getGCD(long a, long b) {
        while(b > 0) {
            long tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    }
    
    public static long getLCM(long a, long b, long gcd) {
        return (a*b)/gcd;
    }
}
