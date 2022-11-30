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

		//nCk = n!/((n-k)!k!)
		int fact = fac(N) / (fac(N-k)*fac(k));
		System.out.println(fact);
*/
/*		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
        // 케이스 수
        int T = Integer.parseInt(reader.readLine());
        
        for (int i = 0; i < T; i++)
        {
            String[] temp = reader.readLine().split(" ");
            
            int N = Integer.parseInt(temp[0]);
            int M = Integer.parseInt(temp[1]);
            // N <= M
            sb.append(combination(M,N)).append("\n");
        }
        
        reader.close();
		System.out.println(sb);
*/
		
		
	}
	//factorial
	public static int fac(int n) {
		int j = n;
		for(int i=n-1;i>0;i--) {
			j = j*i;
		}
		return j;
	}
	//또 다른 방법 
	private static final int[][] dp = new int[31][31];
	private static int combination(int n, int r)
    {
        // 이미 계산된 값일 경우
        if (dp[n][r] > 0)
        {
            return dp[n][r];
        }
        
        // 원소의 갯수가 조합의 갯수와 동일하거나 0일 경우
        else if (n == r || r == 0)
        {
            return dp[n][r] = 1;
        }
        
        // 일반적인 경우 -> 재귀
        else
        {
            return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
        }
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
