public class lastoccurance {

    //last occurance using recursion

    public static int lastOccurance(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;

        }
        int isFound = lastOccurance(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;

        }
        return isFound;
    }



  
    //power of a number
    public static int powerOfNum(int x, int n) {
        if (n == 0) {
            return 1;

        }
//        int pnm1=powerOfNum(x,n-1);
//        int pn=x*pnm1;
//        return pn;
        return x * powerOfNum(x, n - 1);

    }


  //main function
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8, 3, 2, 55, 88, 23, 11};
        int key = 2;
        System.out.println(tilingProblem(7));
    }
}
