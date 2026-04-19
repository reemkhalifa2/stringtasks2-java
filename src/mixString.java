public class mixString {
    public static void main(String[] args) {
        System.out.println(mixString("Hi", "There"));
    }
    public static String mixString(String a, String b){
        String result = "";
        int alen = a.length();
        int blen = b.length();
        if(alen<=blen){
            for(int i=0; i<alen;i++){
                    result =result + a.charAt(i);
                    result =result + b.charAt(i);
                }
            result = result + b.substring(alen,blen);
            }else{
            for(int i=0; i<blen;i++){
                result =result + a.charAt(i);
                result =result + b.charAt(i);
            }
            result = result + a.substring(blen,alen);
        }
        return result;
        }


}
