public class RemoveDup {
    public static void remove(String str, boolean map[], StringBuilder newstr, int i){
        if(i==str.length()){
            System.err.println("new string" + newstr);
            return;
        }
        char currChar = str.charAt(i);
        if(map[currChar - 'a']== true){
            remove(str,map,newstr,i+1);
        }
        else{
            map[currChar-'a'] = true;
            remove(str,map,newstr.append(currChar),i+1);
        }
    }
    public static void main(String[] args) {
        String str = "apnacollege";
        remove(str,new boolean[26], new StringBuilder(" "),0);
    }
    
}
