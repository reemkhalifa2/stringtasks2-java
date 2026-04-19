public class getSandwich {
    public static void main(String[] args) {

    }
    public static String getSandwich(String str){
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        if (first == last) return "";

        return str.substring(first + 5, last);
    }
}
