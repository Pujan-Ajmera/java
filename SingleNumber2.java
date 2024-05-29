import java.util.*;
public class SingleNumber2 {
    
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        HashMap<Integer,Integer> h = new HashMap<>();
        int[] nums = {2,5,6,6,8,8,8,2,2,5,4,5,6};
        int c=0;
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
        for(Map.Entry<Integer,Integer> v : h.entrySet()){
            int a = v.getKey();
            int b = v.getValue();
            if(b==1){
                System.out.println(a);
            }
        }
    }
}