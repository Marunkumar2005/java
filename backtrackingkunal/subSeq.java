import java.util.ArrayList;

public class subSeq {
    //printing subsets using recursion

    static void subSeq1(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;

        }
        char ch=up.charAt(0);
        subSeq1(p+ch,up.substring(1));
        subSeq1(p,up.substring(1));

    }



//returning in the form of array
    static ArrayList<String> subSeq(String p, String up) {
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {

            list.add(p);

            return list;

        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeq(p + ch, up.substring(1));

        ArrayList<String> right = subSeq(p, up.substring(1));
        left.addAll(right);
        return left;

    }

    public static void main(String[] args) {
        System.out.println(subSeq("","abc"));
    }

}
