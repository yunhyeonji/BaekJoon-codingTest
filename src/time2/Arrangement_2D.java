package time2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Arrangement_2D {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
/*		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N][M];
		
		int[][] arr1 = new int[N*2][M];


		for(int i=0;i<N*2;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<M;j++) {			
				arr1[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				arr[i][j] = arr1[i][j] + arr1[i+3][j];
				sb.append(arr[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
*/
		
		int time = Integer.parseInt(br.readLine());
		StringTokenizer st;
		//도화지 
		int[][] arr = new int[100][100];
		
		for(int i=0;i<time;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			
			//색종이가 붙어있는 위치 = 1
			for(int x=X;x<X+10;x++) {
				for(int y=Y;y<Y+10;y++) {
					arr[x][y] = 1;
				}
			}
		}
		
		//넓이 구하기
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j] == 1) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
}
