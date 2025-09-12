public class InsertionSort {
    public static void sort(int number[]){
        for(int i=0; i<number.length; i++){
        int curr = number[i];
        int pre = i-1;
        while(pre>= 0 && number[pre]> curr){
            number[pre+1] = number[pre];
            pre --;
            
    }
    number[pre+1] = curr;
    }
    for(int num : number){
        System.out.println(num);
    }
    }
    public static void main(String[] args) {
        int number[] = {5,4,1,2,3};
        sort(number);
    }
    
}
