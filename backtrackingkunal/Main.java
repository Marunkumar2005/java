//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;

        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));

        } else {
            skip(p + ch, up.substring(1));
        }
    }
    //skip a character by returning

    static String skip2(String up) {
        if (up.isEmpty()) {

            return " ";

        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip2(up.substring(1));

        } else {
            return ch + skip2(up.substring(1));
        }
    }
    //skip apple string

    static String skipstr(String up) {
        if (up.isEmpty()) {

            return " ";

        }

        if (up.startsWith("apple")) {
            return skipstr(up.substring(5));

        } else {
            return up.charAt(0) + skipstr(up.substring(1));
        }
    }
//skip app string not apple
    
    static String skipAppleNotApple(String up) {
        if (up.isEmpty()) {

            return " ";

        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppleNotApple(up.substring(3));

        } else {
            return up.charAt(0) + skipAppleNotApple(up.substring(1));
        }
    }


    public static void main(String[] args) {

        System.out.println(skipAppleNotApple("bacapplccdah"));
    }
}