import java.util.Scanner;
public class StrLenOne{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		System.out.println(" ");
		String str = sc.nextLine();
		int c =0;
		for(int i=0;i<str.length();i++){

		if(str.charAt(i) !=' '){
			c++;
		}
		else{
			break;
		}

	}
		System.out.println(c);


	}
}