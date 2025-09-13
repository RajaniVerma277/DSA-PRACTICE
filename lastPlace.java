public class lastPlace {
    public static void last(int n , int lastplace, String str){
        if(n==0){
            System.err.println(str);
            return;
        }
        //kaam
        last(n-1, 0,str+"0");
        if(lastplace==0){
            last(n-1,1,str+"1");

        }
    }
    public static void main(String[] args) {
        int n=3;
        last(n,0," ");
    }
    
}
