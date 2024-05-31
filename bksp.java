//""
public class bksp {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String s="a#c";
        String t="#c";
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(t);
        StringBuilder val1 = new StringBuilder();
        StringBuilder val2 = new StringBuilder();
    
        int hashcount=0;
        for(int i=sb.length()-1;i>=0;i--){
            if(sb.charAt(i)=='#'){
                hashcount++;
            }
            else if(hashcount!=0){
                hashcount--;
            }
            else if(hashcount==0){
                val1.insert(0,sb.charAt(i));
            }
        }
        hashcount=0;
        for(int i=sb2.length()-1;i>=0;i--){
            if(sb2.charAt(i)=='#'){
                hashcount++;
            }
            else if(hashcount!=0){
                hashcount--;
            }
            else if(hashcount==0){
                val2.insert(0,sb2.charAt(i));
            }
        }
        
        String ans1 = val1.toString();
        String ans2 = val2.toString();
        
        if(ans1.equals(ans2)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        
  }
}
    
    
