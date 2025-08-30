public class linearSearch {
    public static int lSearch(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,5,3,9};
        int key = 9;
         int result = lSearch(number, key);
        if(result == -1){
            System.out.println("key not found");
        }
        else{
            System.err.println("key found at index = "+ result);
        }
    }
    
}
