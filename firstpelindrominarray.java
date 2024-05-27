
public class firstpelindrominarray {
    
    public static boolean ispeli(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(s.equals(sb.toString())) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String[] word = {"abc","car","ada","racecar","cool"};
        for(String a:word){
            boolean isp = ispeli(a);
            if(isp) {
                System.out.println(a);
               break; 
            }
        }
    }
    
}