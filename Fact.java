import java.util.*;
public class Fact{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter a number:");
		a=sc.nextInt();
		int mul=1;
		for(int i=2;i<=a;i++){

		mul = mul * i;	
		}
		System.out.println("THE FACTORIAL OF "+a+" is "+mul);
	}
}