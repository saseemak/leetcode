public class DuplicateZeros {
   public static void main(String[] args){
       int[] nums = new int[]{1,0,2,3,0,4,5,0};
     duplicateZeros2(nums);
     printArray(nums);
   }
   public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i] == 0 ){
                int j = n -1;
                while(j != i){
                    arr[j] = arr[j-1];
                    j--;
                }
                i = i+1;
            }
        }
}
public static void duplicateZeros2(int[] arr){
    int n = arr.length;
    int pd = 0;
    for(int i =0;i< n-pd-1 ; i++){
        if(arr[i] == 0){
            pd++;
        }
    }
    int last = n-1-pd;
    for(int i = last; i>0;i--){
        if(arr[i] == 0){
            arr[i+pd] = arr[i];
             pd--;
             arr[i+pd] = arr[i];
        }
        else{
            arr[i+pd] = arr[i];
        }
    }
}
public static void printArray(int[] nums){
    for(int a : nums){
        System.out.print(a+ " ");
    }
}
    
}
