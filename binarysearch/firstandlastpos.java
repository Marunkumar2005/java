

public class firstandlastpos {


    public static void main(String[] args) {

    }


    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        //check for the first occurance if the target first
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;

    }

    //TO FIND THE LAST POSITION IN THE ARRAY
    int search(int[] nums, int target, boolean findstartindex) {
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {


//check for first occurance of target


            //find the middle element
            // int mid=(start +end)/2;//might exceede the int range value in java
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;

            } else if (target > nums[mid]) {
                start = mid + 1;

            } else {
                //potential ans found
                ans = mid;
                if (findstartindex) {
                    end = mid - 1;

                } else {
                    start = mid + 1;

                }


            }
        }
        return ans;

    }
}
