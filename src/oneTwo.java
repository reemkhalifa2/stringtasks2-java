public class oneTwo {
    public static void main(String[] args) {
        System.out.println(oneTwo("tca"));

    }
    public static String oneTwo(String str){
        String result = "";
        for(int i=0;i<str.length()-2;i+=3){
            result = result + str.charAt(i+1)+ str.charAt(i+2);
            result = result + str.charAt(i);

        }
        return result;
    }
}
