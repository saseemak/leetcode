public class RemoveElement{
    public static void main(String[] args){
        int[] nums = new int[]{3,2,2,3};
        int[] nums1 = new int[]{0,1,2,2,3,0,4,2};
        int k =removeElementWithSwapping(nums,3);
        int k1 = removeElementWithSwapping(nums1, 2);
        System.out.println(k);
        System.out.println(k1);
    }
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n - count ; i++){
            if(nums[i] == val){
                
            for(int j = i+1; j< n- count; j++){
                nums[j-1] = nums[j];
            }
            count++;
             i = i-1;
        }
   }

        return n-count;
    }
    
   public static int removeElementWithTwoPointers(int[] nums,int val){
     int i = 0;
     for(int j = 0; j < nums.length ; j++){
         if(nums[j]!= val)
         {
             nums[i] = nums[j];
             i++;
         }
     }
    return i;
   }
   public static int removeElementWithSwapping(int[] nums, int val){
       int i = 0;
       int  count = 0;
       int n = nums.length;
       while(i< n-count){
          if(nums[i] == val)
          {
            nums[n-count-1] = nums[i];
              n--;
            continue;
          }
          i++;
       }
       return n-count;
   }
}