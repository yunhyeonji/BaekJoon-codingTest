package time3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MapProblem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine());
		
		String[] arr = br.readLine().split(" ");
		
		int t = Integer.parseInt(br.readLine());
		String[] arr2 = br.readLine().split(" ");
		for(int i=0;i<t;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr2[i].equals(arr[j])) {
					arr2[i] = "ok";
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<t;i++) {
			if(arr2[i].equals("ok")) {
				sb.append("1 ");
			}else {
				sb.append("0 ");
			}
		}
		System.out.print(sb);
	}

}
