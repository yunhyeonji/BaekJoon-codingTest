import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;
/*
//스택 클래스
class Stack{
	private int top; // 원소의 위치를 관리 할 top 변수.
	private int stackArr[]; // 배열을 이용한 스택.
	
	public Stack(int size) { // size를 전달해 Stack 객체 생성
		this.top = -1; // 초기에는 값이 없으므로 -1로 시작.
		this.stackArr = new int[size]; // n의 명령이 모두 push일 경우 최대 사이즈는 n.
	}
	
 // push 메소드
	public void push(int x) {
		this.stackArr[++top] = x; // -1인 top의 위치를 증가시킨 후, 삽입.	
	}
	
 // pop 메소드
	public int pop() {
		if(top == -1) {return -1;} // 삽입되어 있는 원소가 없으면 -1.
		return this.stackArr[top--]; // 원소가 있으면 반환 후, top값을 감소.
	}
	
 // size 메소드
	public int size() {
		return this.top + 1; // top이 0일 때 원소가 1개이기 때문에 +1 후 리턴.		 
	}
	
 // empty 메소드
	public int empty() {
		if(top == -1) { return 1;} // 원소가 존재하지 않으면 1.
		return 0; // 존재하면 0.
	}
	
 // top 메소드
	public int top() {
		if(top == -1) {return -1;} // 원소가 존재하지 않으면 -1.
		else {return this.stackArr[top];} // 제일 마지막으로 가리키고 있는 원소 반환. top엔 변화 x
	}
}
*/
public class StackProblem { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
/*   
     // 명령어 수.
		int n = Integer.parseInt(br.readLine());
		
     // 명령어 수 크기의 Stack 객체 생성.
		Stack stack = new Stack(n);
		
     // 명령어 수만큼 반복.
		for(int i = 0;i<n;i++) {
         // 명령어 입력.
			String cons = br.readLine();
			
			if(cons.contains("push")) { // push 명령어
				String spt[] = cons.split(" "); // 공백 기준 분할.
				stack.push(Integer.parseInt(spt[1])); // 분할된 정수를 push.
			}else if(cons.contains("pop")) { // pop 명령어
				bw.write(String.valueOf(stack.pop())+"\n"); 
			}else if(cons.contains("size")) { // size 명령어
				bw.write(String.valueOf(stack.size())+"\n");
			}else if(cons.contains("empty")) { // empty 명렁어
				bw.write(String.valueOf(stack.empty())+"\n"); 
			}else if(cons.contains("top")) { // top 명령어
				bw.write(String.valueOf(stack.top())+"\n");
			}
		}
		
		bw.flush();
		bw.close();		
		br.close();
*/
/*
		int n = Integer.parseInt(br.readLine());
		int[] stackArr = new int[n];
		
		int count = -1;
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num != 0) {
				count++;
				stackArr[count] = num;		
			}else {
				stackArr[count] = 0;
				count--;
			}
		}

		int sum = 0;
		for(int i=0;i<stackArr.length;i++) {
			sum += stackArr[i];
		}
		System.out.println(sum);
*/
/*
		int n = Integer.parseInt(br.readLine());
		String[] stackArr = new String[n];  
		Stack<Character> stack;
		
		for(int i=0;i<n;i++) {
			stack = new Stack<>();
			String b = br.readLine();
			
			try {
				
				for(int j=0;j<b.length();j++) {
					if(b.charAt(j)-'(' == 0) {
						stack.push('(');
					}else {
						stack.pop();
					}
				}
				if(stack.empty()) {stackArr[i] = "YES";}
				else {stackArr[i] = "NO";}
				
			}catch(EmptyStackException e) {
				stackArr[i] = "no";
			}
			
		}
		
		//출력하기
		for(int i=0;i<stackArr.length;i++) {
			System.out.println(stackArr[i]);
		}
*/
/*
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		//.이 아닐동안 반복
		while (!s.equals(".")) {
			//스택 만들기
			Stack<Character> st = new Stack<>(); 
			
			for (int i = 0; i < s.length(); i++) {
				// ( [ 는 그냥 push하기
				if(s.charAt(i) == '(' || s.charAt(i) == '[') {
					st.push(s.charAt(i));
				}else {
					// ) 일 경우
					if(s.charAt(i) == ')') {
						// 최근 값이 (이고 스택이 비어있지 않다면, pop하기
						if(!st.isEmpty() && st.peek() == '(') {st.pop();}
						// 그렇지 않으면 일단 넣어두기 -> empty를 만들지 못하게 함
						else {st.push(s.charAt(i));}
					} 
					// ] 일 경우
					else if( s.charAt(i) == ']') {
						if(!st.isEmpty() &&st.peek() == '[') st.pop();
						else st.push(s.charAt(i));
					}
					
				}
			}
			if(st.isEmpty()) {sb.append("YES").append("\n");}
			else {sb.append("NO").append("\n");}
			s = br.readLine();
		}
		br.close();
		System.out.println(sb);
*/
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack();
		int value = 0;
		
		for(int i=0;i<num;i++) {
			int N = Integer.parseInt(br.readLine());
			
			if(N>value) {
				for(int j=value+1;j<=N;j++) {
					stack.push(j);
					sb.append("+").append("\n");
				}
				value = N;
			}else if(N != stack.peek()) {
				System.out.println("NO");
				return;
			}	
			stack.pop();
			sb.append("-").append("\n");
		}
		System.out.println(sb);
	}

}