import java.util.*;
public class Score{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[5];
		double percent =0,sum=0;
		System.out.println("Enter the marks of 5 subjects: ");
		for(int i=0;i<5;i++){
			arr[i]=sc.nextDouble();
			sum=sum+arr[i];
		}
		percent = sum/5.0;
		System.out.print(percent);
		if(percent>=60){
			System.out.println("1st division");
		}

		else if(percent>=50){
			System.out.println("1st division");
		}


		else if(percent>=40){
			System.out.println("1st division");
		}

		else{
						System.out.println("Fail");

		}
	}
}
