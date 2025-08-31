public class prefixSum {
    public static void subArray(int number[]){
        int smax = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        for(int i=1; i<prefix.length ; i++){
            prefix[i] = prefix[i-1]+number[i];

        }
        
        for(int i=0; i<number.length; i++){
            int start =i;
            for(int j=i; j<number.length;j++){
                int end = j;
               int  currsum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];
        
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
