
public class largestInArray {
    public static int LgArray(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
           
        }
         return largest;
    }
    public static void main(String args[]){
        int number[] = {10,3,20,60,40,30,90};
        System.out.println("The largest number is = "+LgArray(number));
    }
    
}
