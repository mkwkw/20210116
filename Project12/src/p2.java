//���� 1080
//���
//�׸���
//���� ��Ȳ���� ���� ���� ���� �� ����
//���̵��: [0][0]�� ���� ��ǥ���� �ٸ��� ��ȯ, [0][1]�� ���� ��ǥ���� �ٸ��� ��ȯ ---
//�ʿ�: ���� �迭 ������ �迭, ��ǥ �迭 ������ �迭, ��ȯ Ƚ�� ������ ����, ���� �迭�� ��ǥ �迭 ��
import java.io.*;
public class p2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		String a[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(a[0]);
		int m = Integer.parseInt(a[1]);
			
		int arr1[][] = new int [n][m];//���� �迭
		int arr2[][] = new int [n][m];//��ǥ �迭
		
		for(int i=0; i<n; i++) {
			String b[] = br.readLine().split("");
			for(int j=0; j<m; j++) {
				arr1[i][j]=Integer.parseInt(b[j]);
			}
		}
		
		for(int i=0; i<n; i++) {
			String b[] = br.readLine().split("");
			for(int j=0; j<m; j++) {
				arr2[i][j]=Integer.parseInt(b[j]);
			}
		}
		
		for(int i=0; i<n-2; i++) {
			for(int j=0; j<m-2; j++) {
				if(arr1[i][j] != arr2[i][j]) {
					
						if(arr1[i][j]==0)
							arr1[i][j]=1;
						else
							arr1[i][j]=0;
						
						if(arr1[i+1][j]==0)
							arr1[i+1][j]=1;
						else
							arr1[i+1][j]=0;
					
						if(arr1[i][j+1]==0)
							arr1[i][j+1]=1;
						else
							arr1[i][j+1]=0;
						
						if(arr1[i+1][j+1]==0)
							arr1[i+1][j+1]=1;
						else
							arr1[i+1][j+1]=0;
						
						if(arr1[i+2][j]==0)
							arr1[i+2][j]=1;
						else
							arr1[i+2][j]=0;
						
						if(arr1[i][j+2]==0)
							arr1[i][j+2]=1;
						else
							arr1[i][j+2]=0;
						
						if(arr1[i+1][j+2]==0)
							arr1[i+1][j+2]=1;
						else
							arr1[i+1][j+2]=0;
						
						if(arr1[i+2][j+1]==0)
							arr1[i+2][j+1]=1;
						else
							arr1[i+2][j+1]=0;
						
						if(arr1[i+2][j+2]==0)
							arr1[i+2][j+2]=1;
						else
							arr1[i+2][j+2]=0;
					
					count++;
					
				}
				else
					continue;
				
				/*for(int c=0; c<n; c++) {
					for(int d=0; d<m; d++) {
						System.out.print(arr1[c][d]);
					}
					System.out.println();
				}*/
			}
		}
		if(arr1[n-3][m-3]!=arr2[n-3][m-3]) {
			System.out.println(arr1[n-3][m-3]+" "+arr2[n-3][m-3]);
			count=-1;
		}
		System.out.println(count);
		br.close();
	}

}
