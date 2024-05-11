
public class oddNo {
    
    public static void main(String[] args) {
        int l=2,h=7;
        int total;
        if(h%2==0){
            h--;
        }
        if(l%2==0){
            l++;
        }
        total=(h-l)/2+1;
        System.out.println(total);
        
    }
    
}