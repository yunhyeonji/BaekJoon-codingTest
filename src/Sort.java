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
		Arrays.sort(arr,Collections.reverseOrder()); // 내림차순으로 정렬 -> int형 배열은 안됨, Integer형으로 바꾸기!!
		System.out.println(arr[t_c]);
*/
/*
		int N = Integer.parseInt(br.readLine());
		
		// 입력값의 범위 : -4000 ~ 4000
		int[] arr = new int[8001];
		
//		sum = 총 합계 
//		max = 최댓값
//		min = 최솟값 
//		median = 중앙값
//		mode = 최빈값 
		 
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		// median 과 mode 는 -4000~4000 을 제외한 수로 초기화하면 된다.
		int median = 10000;
		int mode = 10000;
		
		for(int i = 0; i < N; i++) {
			int value = Integer.parseInt(br.readLine());
			sum += value;
			arr[value + 4000]++; // -4000은 인덱스0에 있을테니, 기준점 4000을 더해주기!
		
			if(max < value) {
				max = value;
			}
			if(min > value) {
				min = value;
			}
		}
		
		
		// 순회 
		int count = 0;	// 중앙값 빈도 누적 수 
		int mode_max = 0; 	// 최빈값의 최댓값  
		
		// 이전의 동일한 최빈값이 1번만 등장했을경우 true, 아닐경우 false
		boolean flag = false;	 
		
		for(int i = min + 4000; i <= max + 4000; i++) {
			
			if(arr[i] > 0) {
				
				
//				 <중앙값 찾기>
//				 누적횟수가 전체 전체 길이의 절반에 못 미친다면 
				 
				if(count < (N + 1) / 2) {
					count += arr[i];	// i값의 빈도수를 count 에 누적
					median = i - 4000;
				}
				
				
//				 <최빈값 찾기>
//				 이전 최빈값보다 현재 값의 빈도수가 더 높을 경우 
				 
				if(mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true;	// 첫 등장이므로 true 로 변경 
				}
				// 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우 
				else if(mode_max == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;					
				}
			}
		}
		
		sb = new StringBuilder();
		sb.append((int)Math.round((double)sum / N) +"\n"); //산술평균
		sb.append(median +"\n"); //중앙값
		sb.append(mode +"\n"); //최빈값
		sb.append(max-min +"\n"); //범위
		
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

			@Override //두 수를 비교해서 나타낼 수 있다!!..
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
			if(e1[1] == e2[1]) { //y를 비교한다
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
		
		int[] origin = new int[N];	// 원본 배열
		int[] sorted = new int[N];	// 정렬 할 배열
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();	// rank를 매길 HashMap
 
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			// 정렬할 배열과 원본 배열에 값을 넣어준다.
			sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
		}
		
		// 정렬 할 배열에 대해 정렬을 수행해준다.
		Arrays.sort(sorted);
		
		
		// 정렬 된 배열을 순회하면서 map에 넣어준다.
		int rank = 0;
		for(int v : sorted) {
			
			//이 때 만약 앞선 원소가 이미 순위가 매겨졌다면
			//중복되면 안되므로, 원소가 중복되지 않을 때만
			//map에 원소와 그에 대응되는 순위를 넣어준다.
			//제일 작으면 순위는 0, 보다 작은 수도 0개!!
			 
			if(!rankingMap.containsKey(v)) {
				rankingMap.put(v, rank);
				rank++;		// map에 넣고나면 다음 순위를 가리킬 수 있도록 1을 더해준다.
			}
		}
		
		System.out.println(rankingMap);
		
		sb = new StringBuilder();
		for(int key : origin) {
			int ranking = rankingMap.get(key);	// 원본 배열 원소(key)에 대한 value(순위)를 갖고온다.
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);

	}	
}
