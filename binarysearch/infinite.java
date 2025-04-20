public class infiniteArray {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        //first find the range
        //first search for a box of size 2
        int start = 0;
        int end = 1;
        //condituon for the target to lie in the tange
        while (target > arr[end]) {
            int newstart = end + 1;
            //double the box value
            //end=previousend+sizeofbox*2;
            end = end + (end - start + 1) * 2;

        }
        return binarySearch(arr, target, start, end);

    }

//giving start and end index for searching in thr infinite array ,
    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            //find the middle element
            // int mid=(start +end)/2;//might exceede the int range value in java
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                return mid;

            }


        }
        return -1;

    }

}
