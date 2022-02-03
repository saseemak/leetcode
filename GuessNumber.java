public class GuessNumber {
    public static void main(String[] args){
        System.out.println(guessNumber(1000));
    }
    public static int guess(int num){
       int pick = 50;
       if(num > pick){
           return -1;
       }
        else if(num == pick){
           return 0;
       }
       return 1;
    }
    public static int guessNumber(int n) {
        int low = 1;
        int high = n;
        while(low<= high){
            int mid = low + (high - low)/2;
            int go = guess(mid);
            if(go == 0){
                return mid;
            }
            else if(go == -1){
                high = mid -1;
            }
            else if(go == 1){
                low = mid+1;
            }
        }
        return -1;
    }
    
}
