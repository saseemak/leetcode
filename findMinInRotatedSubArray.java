public class findMinInRotatedSubArray {
    public static void main(String[] args){
        int[] nums = new int[]{1,1};
        System.out.println(findMin(nums));

    }
    public static int findMin(int[] nums){
        int n = nums.length;
      if(n == 1){
          return nums[0];
      }
      if(nums[0] < nums[n-1]) {
          return nums[0];
      }
      else{
            int low = 0;
            int high = n-1;
            while(low < high){
                int mid = low + (high -low) / 2;
                if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                    low++;
                    high--;
                }
                if((mid != n-1 || mid == 0 ) && nums[mid] > nums[mid + 1] )
                {
                    return nums[mid+1];
                }
                if( mid > 0 && nums[mid] < nums[mid - 1] )
                {
                    return nums[mid];
                }
                if(nums[low] <= nums[mid]){
                    low = mid;
                }
                else{
                    high = mid -1;
                }

            }
            return nums[high];
      }
    }
   
    
    
}
