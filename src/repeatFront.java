public class repeatFront {
    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4));

    }
    public static String repeatFront(String str, int n){
        String result = "";
        while (n>-1){
            result = result + str.substring(0,n);
            n--;
        }
        return result;
    }
}
