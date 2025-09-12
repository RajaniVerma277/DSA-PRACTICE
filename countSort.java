public class countSort {
    public static void sort(int arr[]){
        //finding largest value
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<arr.length ; i++){
            largest = Math.max(largest,arr[i]);
        }
        //making an array
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }
        //tranfer indexing into array
        int j=0;
        for(int i=0; i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
            
            
        }
        for(int num : arr){
                System.out.print(num);
            }

    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,3,7};
        sort(arr);
    }
    
}
