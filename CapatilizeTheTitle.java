
public class CapatilizeTheTitle {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String title ="capAtAlize thE TitLE tO";
        
        String[] s = title.split(" ");
        String ans="";
        for(int i=0;i<s.length;i++){
            if(s[i].length()>=3){
                String n = s[i].substring(0,1).toUpperCase()+s[i].substring(1).toLowerCase();
                ans+=(n+" ");
            }
            else{
                String n = s[i].toLowerCase();
                ans+=(n+" ");
            }
        }
        
    }
    
}