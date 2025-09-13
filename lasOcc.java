public class lasOcc {
    public static int last(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }
        
        int isFound = last(arr,i+1,key);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,2,5,3};
        System.out.print(last(arr,0,5));
    }
    
}
