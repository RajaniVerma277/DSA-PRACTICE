public class friendPair {
    public static int friend(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1 = friend(n-1);
        int fnm2 = (n-1)*friend(n-2);
        int total = fnm1+fnm2;
        return total;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.print(friend(n));
    }
    
}
