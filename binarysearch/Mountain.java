public class Mountain {
    public static void main(String[] args) {
    int[] arr={1,2,3,6,5,3,2};
      peakIndexInMountainArray();
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] > arr[mid + 1]) {
                //you are in decreasing part of arr this may be the answer but look at left
                //that is why end!=mid-1
                end = mid;

            } else {
                //you are in the ascending part of array
               start = mid + 1;//because we know that mid+1 is always greater than mid value

            }
        }
        //in the end start==end and pointing to the largest number because of the 2
        //start and end are  always trying ro find max element int the above 2 checks

    return start;

    }
}
