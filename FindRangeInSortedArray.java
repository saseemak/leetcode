public class FindRangeInSortedArray {
    public static void main(String[] args){
         int[] nums = new int[]{5,7,7,8,8,10};
         int[] output = searchRange(nums,8);
         System.out.println("[" + output[0] + ","+ output[1]+"]");
    }
    public static int[] searchRangeLinear(int[] nums, int target){
        int firstOccurence = -1;
        int secondOccurence = -1;
        int n = nums.length - 1;
        if(n == 0){
            return new int[]{-1,-1};
        }
        if(nums[0] == target && nums[n] == target){
            return new int[]{0,n};
        }
        for(int i = 0; i < n; i++){
            if(nums[i] == target){
                firstOccurence = i;
                break;
            }
        }
        
            for(int j= n;j> firstOccurence;j--){
               if(nums[j] == target){
                   secondOccurence = j;
               }
            }

            if(secondOccurence == -1 && firstOccurence!= -1){
                secondOccurence = firstOccurence;
            }
            if(firstOccurence == -1 && secondOccurence != -1){
                firstOccurence = secondOccurence;
            }
            
          return new int[]{firstOccurence,secondOccurence};
    }
    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length - 1;
        if(n+1 == 0){
            return new int[]{-1,-1};
        }
        if(nums[0] ==  target && nums[n] == target){
            return new int[]{-1,-1};
        }
         int firstOccurence = findRange(nums,target,true);
         if(firstOccurence == -1){
             return new int[]{-1,-1};
         }
        int secondOccurence = findRange(nums,target,false);
        return new int[]{firstOccurence,secondOccurence};
        
    }
    public static int findRange(int[] nums, int target, boolean isFirst){
        int low = 0;
        int high = nums.length -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                if(isFirst){
                    if(mid == 0 || nums[mid-1]!= target)
                    {
                        return mid;
                    }
                    else{
                        high = mid -1;
                    }
                }
                else{
                    if(mid == nums.length -1 || nums[mid+1] != target){
                        return mid;
                    }
                    else{
                        low = mid+1;
                    }
                }
            }
           else if(nums[mid]> target){
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }



}
