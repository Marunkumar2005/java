public class tilingProblem {


  //tiling problemm
  
    public static int tilingProblem(int n) {
        //kaam
        if (n == 0 || n == 1) {
            return 1;

        }
        //verticaltile
        int fnm1 = tilingProblem(n - 1);
        int fnm2 = tilingProblem(n - 2);
        int totalWays = fnm1 + fnm2;

        return totalWays;
    }


  
    //remove duplicates from an array
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }


  
    //friends pairing problem
    public static int friendsPairing(int n) {
        //choice
        if (n == 1 || n == 2) {
            return n;

        }
        //single
        int fnm1 = friendsPairing(n - 1);

        //pair
        int fnm2 = friendsPairing(n - 2);
        int pairs = (n - 1) * fnm2;
        int totalways = fnm1 + fnm2;
        return totalways;

    }


  
    //binaryString problem
    public static void printBinStrings(int n, int lastPlace, String str) {
        //base
        if (n == 0) {
            System.out.println(str);
            return;

        }

        //kaam
//        if(lastPlace==0){
//            printBinStrings(n-1,0,str.append("0"));
//        printBinStrings(n-1,1,str.append("1"));
//        }
//        else{
//            printBinStrings(n-1,0,str.append("0"));
//        }
//
        printBinStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }
    }


  //main funtion
  
    public static void main(String[] args) {
        int n = 4;
        String str = "appnnacollege";
//
//removeDuplicates(str,0,new StringBuilder(),new boolean[26]);
        printBinStrings(3, 0, " ");
    }
}
