public class powerN {
    public static int powern(int n, int x){
        if(x == 0){
            return 1;
        }
        return n*powern(n,x-1);
    }
    public static void main(String[] args) {
        int n=2;
        int x=3;
        System.err.println(powern(n,x));
    }
    
}
