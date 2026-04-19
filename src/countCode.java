public class countCode {
    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb"));

    }
    public static Integer countCode(String str){
        Integer count =0;
        for(int i=0; i<str.length()-3;i++){
            if(str.substring(i,i+2).equals("co")&&str.charAt(i+3)=='e'){
                count++;
            }

        }
        return count;
    }

}
