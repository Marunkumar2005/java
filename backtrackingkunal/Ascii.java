import java.util.ArrayList;

public class Ascii {
    static void subseqAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;

        }
        char ch=up.charAt(0);
        subseqAscii(p+ch,up.substring(1));
        subseqAscii(p,up.substring(1));
        subseqAscii(p+(ch+0),up.substring(1));
    }
    //ascii in ARRAYS
    static ArrayList<String> asciiArrays(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch=up.charAt(0);
        ArrayList<String> first=asciiArrays(p+ch,up.substring(1));
        ArrayList<String> second=asciiArrays(p,up.substring(1));
        ArrayList<String> third=asciiArrays(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;

    }


    public static void main(String[] args) {
        System.out.println(asciiArrays("","abc"));
    }
}
