//���� 4796
//ķ��
//�����ϴ� P�� ��, L�ϵ��ȸ� ����� �� �ִ�. �� �ް� �ϼ��� V, �ִ� ����ϼ� ���ϱ�
import java.util.*;
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100000];
		int i=0;
		while(true) {
			
			
			int l = sc.nextInt();
			int p = sc.nextInt();
			int v = sc.nextInt();
			
			if(l==0 && p==0 && v==0)
				break;
			
			int result = (v/p)*l;
			
			
			result= result + Math.min(v%p, l);
			arr[i]= result;
			i++;
			
			
			
		}
		for(int j=0; j<i; j++) {
			System.out.println(arr[j]);
		}
		sc.close();
		
			
		
	}

}
