public class firOcc {
    public static int first(int arr[], int i, int key){
        if(arr[i] == key){
            return i;
        }
        return first(arr,i+1,key);
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,2,5,3};
        System.out.print(first(arr,0,5));
    }
    
}
