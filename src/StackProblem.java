import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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

public class StackProblem { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
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
	     
	}

}