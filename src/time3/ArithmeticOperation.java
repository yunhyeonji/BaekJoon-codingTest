package time3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticOperation {

	public static void main(String[] args) throws IOException {
/*		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int s1 = Integer.parseInt(br.readLine());
		String s2 = br.readLine();
		
		//������ ���� �ϳ��� ������
		int[] num2 = new int[s2.length()];
		for(int i=0;i<s2.length();i++) {
			num2[s2.length()-1-i] = s2.charAt(i)-'0';
		}
		
		//����ϱ�
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<num2.length;i++) {
			sb.append(s1 * num2[i]).append("\n");
		}
		sb.append(s1 * Integer.parseInt(s2));
		System.out.println(sb);
*/		
		StringBuilder sb = new StringBuilder();
		sb.append("\\    /\\\r\n" + 
				" )  ( ')\n"+
				"(  /  )\n"+
				" \\(__)|");
		System.out.println(sb);
	}

}
