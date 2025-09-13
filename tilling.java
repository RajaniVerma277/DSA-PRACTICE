public class tilling {
    public static int tile(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1 = tile(n-1);
        int fnm2 = tile(n-2); 
        int totalWays = fnm1 + fnm2;
        return totalWays;   
    }
    public static void main(String[] args) {
        int n=4;
        System.out.print(tile(n));
    }
    
}
