import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class findKClosetElements {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,4,5};
        int k = 4;
        int x = 3;
          List<Integer> s = findClosestElementsB(arr, k, x);
          for(int i : s ){
              System.out.println(i);
          }
    }  
    public static List<Integer> findClosestElementsB(int[] arr, int k, int x){
      List<Integer> sortedList = new ArrayList<Integer>();
      int len = arr.length;
      int low = 0;
      int high = len - 1;
      while(low < high){
          int mid = low + (high - low)/2;
          if(arr[mid] >= x){
             high = mid;
          }
          else{
              low = mid+1;
          }
      }
      int index = high;
    
      int left = Math.max(0,index-k);
      int right = Math.min(index+k,len-1);
      while((right- left)+1 > k){
          int absL = Math.abs(arr[left]-x);
          int absR = Math.abs(arr[right]-x);
          if(absL<= absR){
              right--;
          }
          else{
              left++;
          }
      }
        for(int j = left; j <= right ; j++){
            sortedList.add(arr[j]);
            
        }
        return sortedList;
    }
          
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> sortedArr = new ArrayList<Integer>();
        for(int i : arr){
            sortedArr.add(i);
        }
        DistanceCheckers d = new DistanceCheckers(x);
        Collections.sort(sortedArr,d);
        sortedArr = sortedArr.subList(0, k);
        Collections.sort(sortedArr);
        return sortedArr;

    }
}
class DistanceCheckers implements Comparator<Integer>{
    int x;
    public DistanceCheckers(Integer x){
        this.x = x;
    }
    public int compare(Integer i1, Integer i2 ){
        Integer  num1 = Math.abs(i1-x);
        Integer num2 = Math.abs(i2-x);
        if(num1 < num2){
            return -1;
        }
        else if(num1 > num2){
            return 1;
        }
        else{
            return num1.compareTo(num2);
        }


    }
    
}
