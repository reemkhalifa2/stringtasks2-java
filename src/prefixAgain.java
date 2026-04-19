public class prefixAgain {
    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 3));

    }
    public static Boolean prefixAgain(String str, Integer n){
        String prefix = str.substring(0,n);
        return str.substring(1,str.length()).contains(prefix);
    }
}
