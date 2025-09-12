public class selectSort {
    public static void sort(int number[]){
        for(int i=0; i<number.length; i++){
            int minPos = i;
            for(int j=i+1; j<number.length; j++){
                if(number[minPos]> number[j]){
                    minPos = j;
                }
            }
            int temp = number[i];
            number[i] = number[minPos];
            number[minPos] = temp;
        }
        for(int num : number){
        System.out.println(num);
    }
    
    }
    public static void main(String[] args) {
        int number[] = {5,4,1,3,2};
        sort(number);
    }
    
    
}
