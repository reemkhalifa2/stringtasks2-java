public class repeatSeparator {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));
    }

    public static String repeatSeparator(String str, String separator, Integer n) {
        if (n == 0) {
            return "";
        }
        String result = str;
        while (n > 1) {
            result = result + separator + str;
            n--;
        }
        return result;
    }
}
