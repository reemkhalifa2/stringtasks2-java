public class endOther {
    public static void main(String[] args) {
        System.out.println(endOther("AbC", "HiaBc") );
    }
    public static Boolean endOther(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        return str1.endsWith(str2)||str2.endsWith(str1);


    }
}
