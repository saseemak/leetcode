import java.util.HashSet;
import java.util.Set;
public class ContainDuplicates {
    public static void main(String[] args){
      int[] nums = new int[]{1,2,3,4};
      Boolean cd =  containsDuplicate(nums);   
      System.out.println(cd);
     
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int num : nums){
            if(s.contains(num)){
                return true;
            }
            else{
                s.add(num);
            }
        }
         return false;
    }
}
