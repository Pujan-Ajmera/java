import java.util.Scanner;
public class ArrSto{
	public static void main(String[] args){
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		int i,j=1;
		System.out.println("Enter array elements:");
		Scanner sc = new Scanner(System.in);
		for(i=0;i<arr1.length;i++){
			arr1[i] = sc.nextInt();

		}
	 	arr2[arr2.length-1]=arr1[0];
	    for(i=0;i<arr1.length;i++){
			arr2[i] = arr1[j];
			j++;
			if(j>arr1.length-1){
				break;
			}
		}

		for(i=0;i<arr1.length;i++){
			System.out.print(arr2[i]+" ");
		}


	


	}
}