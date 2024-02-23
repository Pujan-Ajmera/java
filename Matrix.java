import java.util.Scanner;
public class Matrix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m,n;
		System.out.print("Enter no of rows of matrix: ");
		m = sc.nextInt();
		System.out.print("Enter no of cols of matrix: ");
		n = sc.nextInt();
		int[][] arr = new int[m][n];
		System.out.println("Enter array elements: ");
		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("The array elements are: ");

		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++)
			{
				System.out.printf("%d\t",arr[i][j]);
			}
			System.out.printf("\n");
		}
	}
}