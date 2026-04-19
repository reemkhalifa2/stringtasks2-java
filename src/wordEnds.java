public class wordEnds {
    public static void main(String[] args) {

    }
    public static String wordEnds(String str, String word) {
        String result = "";
        Integer wordLength = word.length();
        Integer strLength = str.length();
        Integer i = str.indexOf(word);
        while(i>=0){
            if(i>0){
                result += str.charAt(i-1);
            }
            if(strLength > i +wordLength){
                result +=str.charAt(i + wordLength);
            }
            i = str.indexOf(word, i+1);
        }

        return result;



    }
}
