public class RemoveDuplicates {
    public static void main(String[] args){
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int k  = removeDuplicates(nums);
        System.out.println(k);

    }
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i =1 ; i< nums.length; i++){
            if(nums[i-1] != nums[i]){
                j++;
                nums[j]= nums[i];
            }
        }
        return j+1;
    }
   
    
}
