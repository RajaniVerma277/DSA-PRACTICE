public class printDesc{
    public static void desc(int n){
        if(n==1){
            System.out.print(n);
            return ;
        }
        System.out.print(n);
        desc(n-1);
    }
    public static void main(String args[]){
        int n =10;
        desc(n);

    }
}