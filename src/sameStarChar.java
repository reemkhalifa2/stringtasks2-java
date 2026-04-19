public class sameStarChar {
    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz"));

    }
    public static Boolean sameStarChar(String str){
        Boolean found = true;
        for(int i=1; i<str.length()-1;i++){
            if(str.charAt(i) == '*' ){
                if(str.charAt(i+1) != str.charAt(i-1)){
                    found = false;
                }
            }
        }
        return found;

    }
}
