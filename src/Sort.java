import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Sort {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb;
	static StringTokenizer st;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
/*
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		for(int i=0;i<T;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		sb = new StringBuilder();
		for(int i=0;i<T;i++) {
			sb.append(arr[i] + "\n");
		}
		System.out.println(sb);
*/
/*
		String j = br.readLine();
		String num = br.readLine();
		br.close();
		
		st = new StringTokenizer(j);
		int t_j = Integer.parseInt(st.nextToken()), t_c = Integer.parseInt(st.nextToken())-1;
		st = new StringTokenizer(num);
		Integer[] arr = new Integer[t_j];
		for(int i=0;i<t_j;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr,Collections.reverseOrder()); // ������������ ���� -> int�� �迭�� �ȵ�, Integer������ �ٲٱ�!!
		System.out.println(arr[t_c]);
*/
/*
		int N = Integer.parseInt(br.readLine());
		
		// �Է°��� ���� : -4000 ~ 4000
		int[] arr = new int[8001];
		
//		sum = �� �հ� 
//		max = �ִ�
//		min = �ּڰ� 
//		median = �߾Ӱ�
//		mode = �ֺ� 
		 
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		// median �� mode �� -4000~4000 �� ������ ���� �ʱ�ȭ�ϸ� �ȴ�.
		int median = 10000;
		int mode = 10000;
		
		for(int i = 0; i < N; i++) {
			int value = Integer.parseInt(br.readLine());
			sum += value;
			arr[value + 4000]++; // -4000�� �ε���0�� �����״�, ������ 4000�� �����ֱ�!
		
			if(max < value) {
				max = value;
			}
			if(min > value) {
				min = value;
			}
		}
		
		
		// ��ȸ 
		int count = 0;	// �߾Ӱ� �� ���� �� 
		int mode_max = 0; 	// �ֺ��� �ִ�  
		
		// ������ ������ �ֺ��� 1���� ����������� true, �ƴҰ�� false
		boolean flag = false;	 
		
		for(int i = min + 4000; i <= max + 4000; i++) {
			
			if(arr[i] > 0) {
				
				
//				 <�߾Ӱ� ã��>
//				 ����Ƚ���� ��ü ��ü ������ ���ݿ� �� ��ģ�ٸ� 
				 
				if(count < (N + 1) / 2) {
					count += arr[i];	// i���� �󵵼��� count �� ����
					median = i - 4000;
				}
				
				
//				 <�ֺ� ã��>
//				 ���� �ֺ󰪺��� ���� ���� �󵵼��� �� ���� ��� 
				 
				if(mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true;	// ù �����̹Ƿ� true �� ���� 
				}
				// ���� �ֺ� �ִ񰪰� ������ ���鼭 �� ���� �ߺ��Ǵ� ��� 
				else if(mode_max == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;					
				}
			}
		}
		
		sb = new StringBuilder();
		sb.append((int)Math.round((double)sum / N) +"\n"); //������
		sb.append(median +"\n"); //�߾Ӱ�
		sb.append(mode +"\n"); //�ֺ�
		sb.append(max-min +"\n"); //����
		
		System.out.println(sb);
*/	
/*
		String num = br.readLine();
		Integer[] arr = new Integer[num.length()];
		for(int i=0;i<num.length();i++) {
			arr[i] = num.charAt(i) - '0';
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		sb = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]);
		}
		System.out.println(sb);
*/
/*	
		int T = Integer.parseInt(br.readLine());
		int[][] xy = new int[T][2];
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine());
			xy[i][0] = Integer.parseInt(st.nextToken());
			xy[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(xy, new Comparator<int[]>() {

			@Override //�� ���� ���ؼ� ��Ÿ�� �� �ִ�!!..
			public int compare(int[] e1, int[] e2) {
				if(e1[0] == e2[0]) {
					return e1[1]-e2[1];
				}else {
					return e1[0]-e2[0];
				}
			}
			
		});
		sb = new StringBuilder();
		for(int i=0;i<T;i++) {
			sb.append(xy[i][0]+" "+xy[i][1]+"\n");
		}
		System.out.println(sb);
*/		
/*	
		int T = Integer.parseInt(br.readLine());
		int[][] xy = new int[T][2];
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine());
			xy[i][0] = Integer.parseInt(st.nextToken());
			xy[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(xy, (e1, e2) -> {
			if(e1[1] == e2[1]) { //y�� ���Ѵ�
				return e1[0]-e2[0];
			}else {
				return e1[1]-e2[1];
			}
		});
		sb = new StringBuilder();
		for(int i=0;i<T;i++) {
			sb.append(xy[i][0]+" "+xy[i][1]+"\n");
		}
		System.out.println(sb);
*/	
/*
		int T = Integer.parseInt(br.readLine());
		String[] arr = new String[T];
		for(int i=0;i<T;i++) {
			arr[i] = br.readLine();
		}
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				if(arg0.length() == arg1.length()) {
					return arg0.compareTo(arg1);
				}else {
					return arg0.length() - arg1.length();
				}
			}
			
		});
		sb = new StringBuilder();
		sb.append(arr[0]+"\n");
		for(int i=1;i<T;i++) {
			if(!arr[i].equals(arr[i-1])){
				sb.append(arr[i]+"\n");
			}
		}
		System.out.println(sb);
*/
/*
		int T = Integer.parseInt(br.readLine());
		String[][] arr = new String[T][2];
		for(int i=T-1;i>=0;i--) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		Arrays.sort(arr, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				if(Integer.parseInt(o1[0]) > Integer.parseInt(o2[0])) {
					return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
				}
				return -1;
			}
			
		});
		sb = new StringBuilder();
		for(int i=0;i<T;i++) {
			sb.append(arr[i][0]+" "+arr[i][1]+"\n");
		}
		System.out.println(sb);
*/	
		int N = Integer.parseInt(br.readLine());
		
		int[] origin = new int[N];	// ���� �迭
		int[] sorted = new int[N];	// ���� �� �迭
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();	// rank�� �ű� HashMap
 
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			// ������ �迭�� ���� �迭�� ���� �־��ش�.
			sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
		}
		
		// ���� �� �迭�� ���� ������ �������ش�.
		Arrays.sort(sorted);
		
		
		// ���� �� �迭�� ��ȸ�ϸ鼭 map�� �־��ش�.
		int rank = 0;
		for(int v : sorted) {
			
			//�� �� ���� �ռ� ���Ұ� �̹� ������ �Ű����ٸ�
			//�ߺ��Ǹ� �ȵǹǷ�, ���Ұ� �ߺ����� ���� ����
			//map�� ���ҿ� �׿� �����Ǵ� ������ �־��ش�.
			//���� ������ ������ 0, ���� ���� ���� 0��!!
			 
			if(!rankingMap.containsKey(v)) {
				rankingMap.put(v, rank);
				rank++;		// map�� �ְ��� ���� ������ ����ų �� �ֵ��� 1�� �����ش�.
			}
		}
		
		System.out.println(rankingMap);
		
		sb = new StringBuilder();
		for(int key : origin) {
			int ranking = rankingMap.get(key);	// ���� �迭 ����(key)�� ���� value(����)�� ����´�.
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);

	}	
}
