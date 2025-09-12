public class fabo {
    public static int fabon(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1 = fabon(n-1);
        int fnm2 = fabon(n-2);
        int fn = fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n=5;
        System.err.println(fabon(n));
    }
    
}
