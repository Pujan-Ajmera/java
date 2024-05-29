import java.util.*;
public class SingleNumber3 {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        HashMap<Integer,Integer> h = new HashMap<>();
        int[] nums = {2,2,3,1,5,1};
        int c=0;
        int[] ar = new int[2];
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
               c=h.get(nums[i]);
                c++;
                h.put(nums[i],c);
            }
            else{
                c=0;
                c++;
                h.put(nums[i],c);
            }
        }
        int l=0;
        for(Map.Entry<Integer,Integer> v : h.entrySet()){
            int a = v.getKey();
            int b = v.getValue();
            if(b==1){
                //System.out.println(a);
                ar[l]=a;
                if(l>0)break;
                l++;
            }
        }
        
        System.out.println(ar[0]+"  "+ar[1]);
    }
}