//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    //printing sum of digits

    static int sumOfDigits(int n) {
        //base
        if (n == 0) {
            return 0;

        }
        int rem = n % 10;
        n = n / 10;
        return rem + sumOfDigits(n);

    }

    //passing parameters
    static void Concept(int n) {
        if (n == 0) {
            return;

        }
        System.out.println(n);
        Concept(--n);
    }

    //reverse a number
    static void reverseNum(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        n = n / 10;
        System.out.print(rem);
        reverseNum(n);

    }

    //reverse a number
    static int sum = 0;

    static void rev1(int n) {
        if (n == 0) {
            return;

        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n / 10);

    }

    //reverse 2nd method
    static int rev2(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);

    }
    //helper function for reverse without sum value

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;

        }
        int rem = n % 10;

        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);

    }

    public static void main(String[] args) {
        System.out.println(rev2(1345));

    }
}
