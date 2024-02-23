import java.util.*;
public class Age{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Enter age:");
		a=sc.nextInt();
		int days=a*365;
		System.out.println("Days of age entered is: "+days);
	}
}