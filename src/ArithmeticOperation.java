import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) throws IOException {
//		System.out.println("Hello World!!");
/*		
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println((double)A/B);
		
		System.out.println(A/B);
		System.out.println(A%B);
*/		
/*
		Scanner s = new Scanner(System.in);
		String id = s.nextLine();
		String jh = "??!";
		System.out.println(id+jh);
*/		
/*
		Scanner sc = new Scanner(System.in);
		int k,q,l,b,n,p;
		k = sc.nextInt();
		q = sc.nextInt();
		l = sc.nextInt();
		b = sc.nextInt();
		n = sc.nextInt();
		p = sc.nextInt();
		
		System.out.println((1-k) + "\t" + (1-q) + "\t" + (2-l) + "\t" + (2-b) + "\t" + (2-n) + "\t" + (8-p));
		
		int [] targetArray = new int[6];
        StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
        for(int i = 0 ; i < 6; i++){
            targetArray[i] = Integer.parseInt(st.nextToken());
        }
        
        System.out.print((1-targetArray[0])+" ");
        System.out.print((1-targetArray[1])+" ");
        System.out.print((2-targetArray[2])+" ");
        System.out.print((2-targetArray[3])+" ");
        System.out.print((2-targetArray[4])+" ");
        System.out.print((8-targetArray[5])+" ");
*/
/*		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		
		//String s = br.readLine(); 
		//System.out.println("String : " + s);
		
		//int i = Integer.parseInt(br.readLine()); // readLine()���� ���� String ���� int�� ����ȯ
		//System.out.println("Int : " + i);
		
       	//���� ���� ������ �Է¹ޱ�
        //String s2[] = br.readLine().split(" "); //split�� �̿��� �ٷ��� ������ �Է� �ޱ�
        
		StringTokenizer st = new StringTokenizer(br.readLine()); //�⺻���� ������ �������� ����
		int arr[] = new int[st.countTokens()];
		int count=0;
		while(st.hasMoreTokens()) {
			arr[count] = Integer.parseInt(st.nextToken());
			System.out.println(arr[count++]);
			//countTokens() : �� ��ū�� ������ ����
			//hasMoreTokens() : ��ū�� �����ִٸ� true, ������ false ����
		}
*/
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[st.countTokens()];
		int count = 0;
		while(st.hasMoreElements()) {
			arr[count] = Integer.parseInt(st.nextToken());
			count++;
		}
		System.out.println((arr[0]+arr[1])%arr[2]);
		System.out.println(((arr[0]%arr[2])+(arr[1]%arr[2]))%arr[2]);
		System.out.println((arr[0]*arr[1])%arr[2]);
		System.out.println(((arr[0]%arr[2])*(arr[1]%arr[2]))%arr[2]);
*/		
/*		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		String B = sc.next();
		sc.close();
		
		System.out.println(A*(B.charAt(2)-'0'));
		System.out.println(A*(B.charAt(1)-'0'));
		System.out.println(A*(B.charAt(0)-'0'));
		System.out.println(A*Integer.parseInt(B));
*/
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		br.close();
        
		StringBuilder sb = new StringBuilder();
        
		sb.append(A * (B%10));
		sb.append('\n');
		
		sb.append(A * ((B%100)/10));
		sb.append('\n');
        
		sb.append(A * (B/100));
		sb.append('\n');
        
		sb.append(A * B);
 
		System.out.print(sb);
*/

	}

}
