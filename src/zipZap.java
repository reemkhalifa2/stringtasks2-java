public class zipZap {
    public static void main(String[] args) {

    }
    public static String zipZap(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.length()>2&&str.charAt(i) == 'z'&& str.charAt(i + 2) == 'p') {
                result += str.charAt(i);
                result += str.charAt(i + 2);
                i += 2;
            }else {
                result += str.charAt(i);
            }
        }

        return result;
    }
}
