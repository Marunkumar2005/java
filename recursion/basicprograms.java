

public class Main {

    public static void printdec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;

        }
        System.out.print(n + " ");
        printdec(n - 1);
    }


  
    //printig factorial of n
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return n;
    }

  
    //sum of n natural numbers
    public static int calsum(int n) {
        if (n == 1) {
            return 1;

        }
        int snm1 = calsum(n - 1);
        int sn = snm1 + n;
        return sn;
    }


  
    //calcate fibbonaccci series
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fbnm1 = fib(n - 1);
        int fbnm2 = fib(n - 2);
        int fb = fbnm1 + fbnm2;
        return fb;

    }

    //sorted or not
    public static Boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }



  
    //returning first occurance of a value int the array
    public static int firstOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;

        }
        return firstOccurance(arr, key, i + 1);
    }


  //main function
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 4, 5};
        System.out.println(firstOccurance(arr, 5, 0));

    }
}
