public class pairArray {
    public static void pair(int number[]){
        for(int i=0 ; i<number.length; i++){
            for(int j=i+1 ; j<number.length ; j++){
                System.out.println(number[i]+","+number[j]);
            }
        }
    }
    public static void main(String[] args) {
        int number[] = {2,3,4,5,6,7};
        pair(number);
    }
    
}
