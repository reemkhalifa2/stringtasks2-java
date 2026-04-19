public class repeatEnd {
    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 3) );

    }
    public static String repeatEnd(String str, Integer n){
        String result ="";
        int i=n;
        while(i>0){
            result = result +str.substring(str.length()-n,str.length());
            i--;
        };
        return result;
    }
}
