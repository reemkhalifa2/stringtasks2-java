public class xyBalance {
    public static void main(String[] args) {
        System.out.println(xyBalance("yaaxbb"));
    }
    public static Boolean xyBalance(String str){
        if(str.isEmpty() || !str.contains("x")&& !str.contains("y"))
        {
            return true;
        }

        return str.lastIndexOf('x')< str.lastIndexOf('y');
    }
}
