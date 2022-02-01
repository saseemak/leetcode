public class MergeSortedArray {
    public static void main(String[] args){
       int[] nums1 = new int[]  {1,2,3,0,0,0};
        int  m = 3;
        int[] nums2 = new int[]{1};
        int n = 1;
        mergeSpaceTradeOff(nums1,m,nums2,n);
         printArray(nums1);

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2= n-1;
        int p = m+n-1;
        while(p>=0  ){ 
            if(p2 < 0){
                 break; 
                }
            if(p1>=0&&nums1[p1]>nums2[p2]){
                nums1[p]= nums1[p1];
                p--;
                p1--;}
            else{  
                
                  nums1[p] = nums2[p2];
                  p--;
                  p2--; 
              
            }
        }

    }
    public static void mergeSpaceTradeOff(int[] nums1, int m, int[] nums2, int n){
        int[] sortedArray = new int[m+n];
        int i = 0, j = 0, k = 0;
       
        while(i< m && j< n){
            if(n-1 < 0){
                break;
            }
            if( nums1[i]< nums2[j]){
            sortedArray[k] = nums1[i];
            i++;
            k++;
        }
        else{
            if(nums1[i]> nums2[j]){
                sortedArray[k] = nums2[j];
                j++;
                k++;
            }
        }
    }
}


    
    public static void printArray(int[] nums){
        for(int a : nums)
        {
            System.out.print(a+" ");
        }
    }
}