public class RBS {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 1, 2, 3};
        System.out.println(pivot(arr));

    }


  //final searching happens here 
  
    static int search(int[] nums, int target) {
        int pivot = pivot(nums);
        //if you  didnt find the pivot element  it meansthe array is not rotated
        if (pivot == -1) {
            //just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);

        }

        //if pivot is found ,you have found 2 asc sorted arrays

        if (nums[pivot] == target) {
            return pivot;

        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);

        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);


    }

  //simple binary search
  
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

  //finding the pivot element by uding binary search
    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;

            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;

            }
            if(arr[mid]<=arr[start]){

                end=mid-1;

            }
            else{
                start=mid+1;

            }
        }
        return -1;

    }
}
