
public class MooresAlgoforMejorityElement1 {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] nums ={7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        int cou=0,el=-1; 
        for(int i=0;i<nums.length;i++){
            if(cou==0){
                cou=1;
                el=nums[i];
            }
            else if(nums[i]==el){
                cou++;
            }
            else{
                cou--;
            }
        }
        if(cou==0){
            System.out.println("-1");
        }
        else{
            cou=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==el){
                    cou++;
                }
            }
            
            if(cou>nums.length/2){
                System.out.println(el);
            }
            else{
                System.out.println("-1");
            }
        }
        
    }
}