public class plusOut {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));

    }
    public static String plusOut(String str, String word) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() - word.length() &&
                    str.substring(i, i + word.length()).equals(word)) {

                result += word;
                i += word.length() - 1;
            } else {
                result += "+";
            }
        }

        return result;

    }
}
