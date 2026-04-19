public class xyzMiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB") );
    }
    public static Boolean xyzMiddle(String str){
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                Integer right = str.length() - (i + 3);
                if (Math.abs(i - right) <= 1) {
                    return true;
                }
            }
        }

        return false;

    }
}
