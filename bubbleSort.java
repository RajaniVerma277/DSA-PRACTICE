public class bubbleSort {
    public static void sort(int number[]){
        //first loop 
        for(int i=0; i<number.length-1;i++){
            for(int j=0; j<number.length-1-i; j++){
                if(number[j]>number[j+1]){
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }
        for(int num : number){
            System.out.println(num +"");
        }
    }
    public static void main(String[] args) {
        int number[] = {5,4,1,3,2};
        sort(number);
    }
    
}
