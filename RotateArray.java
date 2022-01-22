public class RotateArray{
   public static void main(String[] args){
      int[] nums = new int[]{1,2,3,4,5,6,7};
      int[] nums1 = new int[]{-1,-100,3,99};
      //rotate(nums,3);
      //rotate(nums1,2);
    //   rotateExtraArray(nums, 3);
    //   rotateExtraArray(nums1, 2);
    rotateUsingReverse(nums, 2);
   }
   public static void rotate(int[] nums, int k) {
        int n = nums.length;
        for (int i = 1; i<= k ; i++){
            int temp = nums[n-1];
            for(int j= n-1 ; j > 0; j--){
                    nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
}

     public static void rotateUsingReverse(int[] nums,int k){
            reverse(nums, 0, nums.length -1);
            reverse(nums, 0, k-1);
            reverse(nums, k, nums.length-1);
            printArray(nums);
     }
  
     public static void reverse(int[] nums, int start, int end){
          while(start<end){
              int temp = nums[start];
              nums[start]  = nums[end];
              nums[end] = temp;
              start++;
              end --;

          }
     }
//This method utilizess extra array for the shifts
public static void rotateExtraArray(int[] nums, int k){
        int n = nums.length;
        int[] rotatedArray = new int[n];
        for(int i = 0; i<n; i++){
            rotatedArray[(i+k)%n] = nums[i];
        }
        for(int i = 0;i< n ; i++){
            nums[i] = rotatedArray[i];
        }
    }
    
     public static void printArray(int[] nums){
        System.out.println();
         for(int a: nums){
             System.out.print(a+ " ");
         }
     }
}