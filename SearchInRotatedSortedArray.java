public class SearchInRotatedSortedArray {
    public static void main(String[] args){
         int[] nums = new int[]{1,0,1,1,1};
         System.out.println(searchInRotatedArray2(nums,0));
    }
    public static Boolean searchInRotatedArray2(int[] nums,int target){
        int low = 0;
        int high = nums.length -1;
        while(low<= high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                 low++;
                 high--;
            }
            else if(nums[low]<= nums[mid]){
               if(target >= nums[low] && target < nums[mid]){
                   high = mid-1;
               }
               else{
                   low = mid+1;
               }

            }
            else{
                if(target > nums[mid] && target <= nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return false;
    }
     public static int getPivot(int[] nums){
        int low = 0;
        int high = nums.length -1 ;
            if(nums[low] < nums[high]){
                return 0;
            }
        while(low <= high){
            int mid = low+ (high -low)/2;
            if( nums[mid] > nums[mid+1]){
                return mid+1;
            }
             if(nums[low] <= nums[mid]){
                   low = mid + 1;
            }
             else{
                  high = mid-1;
             }

        }

        return 0;
        }
     public static int binarySearch(int[] nums, int low, int high, int target){
        while(low<=high){
            int mid = low+ (high - low) /2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else{
                 high = mid -1;
            }
            
        
        }
        return -1;
        
    }
    public static int search(int[] nums, int target) {
        if(nums.length == 1){
        if(nums[0] == target){
            return 0;
        }
        else{
            return -1;
        }
    }
        int pivotIndex = getPivot(nums);
        if(target ==  nums[pivotIndex])
        {
            return pivotIndex;
        }
        if(pivotIndex == 0){
            return binarySearch(nums, 0, nums.length -1,target);
        }
        if(target < nums[0]){
            return binarySearch(nums, pivotIndex, nums.length -1,target);
        }

       else{
           return binarySearch(nums, 0 , pivotIndex,target);
       }
        
    }
}
