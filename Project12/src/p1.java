//백준 4796
//캠핑
//연속하는 P일 중, L일동안만 사용할 수 있다. 총 휴가 일수는 V, 최대 사용일수 구하기
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
			
			int result = 0;
			
			if(v%p <=l)
				result = (v/p)*l+v%p;
			else
				result = (v/p)*l +l;
			
			
			arr[i]= result;
			i++;
			
			
			
		}
		for(int j=0; j<i; j++) {
			System.out.println("Case "+(j+1)+": "+arr[j]);
		}
		sc.close();
		
			
		
	}

}
