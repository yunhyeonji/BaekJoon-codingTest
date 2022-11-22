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
//���� Ŭ����
class Stack{
	private int top; // ������ ��ġ�� ���� �� top ����.
	private int stackArr[]; // �迭�� �̿��� ����.
	
	public Stack(int size) { // size�� ������ Stack ��ü ����
		this.top = -1; // �ʱ⿡�� ���� �����Ƿ� -1�� ����.
		this.stackArr = new int[size]; // n�� ����� ��� push�� ��� �ִ� ������� n.
	}
	
 // push �޼ҵ�
	public void push(int x) {
		this.stackArr[++top] = x; // -1�� top�� ��ġ�� ������Ų ��, ����.	
	}
	
 // pop �޼ҵ�
	public int pop() {
		if(top == -1) {return -1;} // ���ԵǾ� �ִ� ���Ұ� ������ -1.
		return this.stackArr[top--]; // ���Ұ� ������ ��ȯ ��, top���� ����.
	}
	
 // size �޼ҵ�
	public int size() {
		return this.top + 1; // top�� 0�� �� ���Ұ� 1���̱� ������ +1 �� ����.		 
	}
	
 // empty �޼ҵ�
	public int empty() {
		if(top == -1) { return 1;} // ���Ұ� �������� ������ 1.
		return 0; // �����ϸ� 0.
	}
	
 // top �޼ҵ�
	public int top() {
		if(top == -1) {return -1;} // ���Ұ� �������� ������ -1.
		else {return this.stackArr[top];} // ���� ���������� ����Ű�� �ִ� ���� ��ȯ. top�� ��ȭ x
	}
}
*/
public class StackProblem { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
/*   
     // ��ɾ� ��.
		int n = Integer.parseInt(br.readLine());
		
     // ��ɾ� �� ũ���� Stack ��ü ����.
		Stack stack = new Stack(n);
		
     // ��ɾ� ����ŭ �ݺ�.
		for(int i = 0;i<n;i++) {
         // ��ɾ� �Է�.
			String cons = br.readLine();
			
			if(cons.contains("push")) { // push ��ɾ�
				String spt[] = cons.split(" "); // ���� ���� ����.
				stack.push(Integer.parseInt(spt[1])); // ���ҵ� ������ push.
			}else if(cons.contains("pop")) { // pop ��ɾ�
				bw.write(String.valueOf(stack.pop())+"\n"); 
			}else if(cons.contains("size")) { // size ��ɾ�
				bw.write(String.valueOf(stack.size())+"\n");
			}else if(cons.contains("empty")) { // empty ����
				bw.write(String.valueOf(stack.empty())+"\n"); 
			}else if(cons.contains("top")) { // top ��ɾ�
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
		
		//����ϱ�
		for(int i=0;i<stackArr.length;i++) {
			System.out.println(stackArr[i]);
		}
*/
/*
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		//.�� �ƴҵ��� �ݺ�
		while (!s.equals(".")) {
			//���� �����
			Stack<Character> st = new Stack<>(); 
			
			for (int i = 0; i < s.length(); i++) {
				// ( [ �� �׳� push�ϱ�
				if(s.charAt(i) == '(' || s.charAt(i) == '[') {
					st.push(s.charAt(i));
				}else {
					// ) �� ���
					if(s.charAt(i) == ')') {
						// �ֱ� ���� (�̰� ������ ������� �ʴٸ�, pop�ϱ�
						if(!st.isEmpty() && st.peek() == '(') {st.pop();}
						// �׷��� ������ �ϴ� �־�α� -> empty�� ������ ���ϰ� ��
						else {st.push(s.charAt(i));}
					} 
					// ] �� ���
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