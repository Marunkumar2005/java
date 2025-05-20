public class printNumbers {

    //printing numbers from n to 1

    static void print(int n) {
        if (n == 3) {
            System.out.println(n);

            return;
        }
        System.out.println(n);
        print(n + 1);
    }

    //fibonacci series
    static int fibo(int n) {
        if (n < 2) {
            return n;

        }
        return fibo(n - 1) + fibo(n - 2);

    }
    //recursion for binary search

    static int BinarySearch(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;

        }
        if (target < arr[m]) {
            return BinarySearch(arr, target, s, m - 1);

        }
        return BinarySearch(arr, target, m + 1, e);

    }

    //print numbers from n to 1
    static int nto1(int n) {
        if (n == 1) {
            return 1;

        }
        System.out.println(n);
        return nto1(n - 1);
    }

    //printing from 1 to n
    static void OnetoN(int n) {
        if (n == 0) {
            return;

        }
        OnetoN(n - 1);
        System.out.println(n);

    }

    public static void main(String[] args) {
//
        OnetoN(5);
    }
}
