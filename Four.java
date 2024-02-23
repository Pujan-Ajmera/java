	import java.util.Scanner;
	public class Four{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int n;
			System.out.println("Enter array size");
			n =sc.nextInt();
			int[] arr = new int[n]; 
			System.out.println("Enter array elements:");
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}

			System.out.println(" array elements in real order:");
			for(int i=0;i<n;i++){
				System.out.printf(arr[i]+" ");
			}
			System.out.println(" ");
			System.out.println("array elements in reverse order :");
			for(int i=n-1;i>=0;i--){
				System.out.printf(arr[i]+" ");
			}

		}
	}