import java.util.Scanner;

public class Strlen{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		System.out.println(" ");
		String str = sc.nextLine();
		int c =0;
		System.out.println(str.length());
		for(int i = 0;i<str.length();i++){
			c++;
			if(str.charAt(i) == ' '){
				c--;
		}
	}
		System.out.println(" ");
		System.out.println("THE SRING LENGTH IS : "+c);


	}
}