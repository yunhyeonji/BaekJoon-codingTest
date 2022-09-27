import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Function {
	
	public long sum(int[] a) {
		long sum = 0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}

	public static int d(int n) {
		int sum = n;
		while(n != 0) {
			sum += n%10;
			n = n/10;
		}
		return sum;
	}
	
	static HashSet<Integer> hs = new HashSet<>();
	public static int num(int N) {
		int cnt = 0;
		
		if(N<100) {
			return N;
		}else {
			cnt = 99;
			
			for(int i=100;i<= N;i++) {
				int hun = i/100;
				int ten = (i/10)%10;
				int one = i%10;
				
				if((hun-ten) == (ten-one)) {
					cnt++;
				}
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) throws IOException {
/*
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=10000;i++) {
			int n = d(i);
			if(n > 10000) {
				break;
			}
			sb.append(n+"\n");
		}
		System.out.println(sb);
*/
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();		
		System.out.println(num(N));
		
	}


}
