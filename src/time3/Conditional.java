package time3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Conditional {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*		
		String s = br.readLine();
		String[] i = s.split(" ");
		
		if(i[0].compareTo(i[1]) == 1) {
			System.out.println(">");
		}else if(i[0].compareTo(i[1]) == -1) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
*/
/* 
		int score = Integer.parseInt(br.readLine());
		
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else{
			System.out.println("F");
		}
*/
/*		#14681
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if(x>0 && y>0) {
			System.out.println("1");
		}else if(x>0 && y<0) {
			System.out.println("4");
		}else if(x<0 && y>0) {
			System.out.println("2");
		}else if(x<0 && y<0) {
			System.out.println("3");
		}
*/
/*
		String[] time = br.readLine().split(" ");
		int hour = Integer.parseInt(time[0]);
		int min = Integer.parseInt(time[1]);
		
		if(min <= 45) {
			if(hour >= 1) {
				hour -= 1;
			}else {
				hour = 23;
			}
			min = min + 60 - 45;
		}else {
			min = min - 45;
		}
		System.out.println(hour + " " + min);
*/
/*
		String[] time = br.readLine().split(" ");
		int timer = Integer.parseInt(br.readLine());
		int hour = Integer.parseInt(time[0]);
		int min = Integer.parseInt(time[1]);
		
		min += timer;
		while(min >= 60) {
			min -= 60;
			hour += 1;
			if(hour >= 24) {
				hour = 0;
			}
		}
		System.out.println(hour + " " + min);
*/
		
		String[] num = br.readLine().split(" ");

		Arrays.sort(num);
		if(!num[0].equals(num[1]) && !num[2].equals(num[1])) {
			//�� ���ڰ� ��� �ٸ� ��
			System.out.println(Integer.parseInt(num[2]) * 100);
		}else {
			//���� ���ڰ� �����Ѵ�. -> 2��° ���ڴ� ��� �� ���ڿ� ������ ��
			if(!num[0].equals(num[1]) || !num[2].equals(num[1])) {
				System.out.println(Integer.parseInt(num[1]) * 100 + 1000);
			}else {
				//�� ���ڰ� ��� ������ �� 
				System.out.println(Integer.parseInt(num[2]) * 1000 + 10000);
			}
		}
	}

}
