public class maxArraySum {
    public static void subArray(int number[]){
        int smax = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            int start =i;
            int currsum=0;
            for(int j=i; j<number.length;j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    currsum += number[k];
                }
                if(smax<currsum){
                    smax = currsum;

                }

            }
        }
        System.out.println(smax);
    }
    public static void main(String args[]){
        int number[] = {2,3,4,5,6,8,7};
        subArray(number);
    }
    
    
}
