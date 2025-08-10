class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for(int [] row:image){
            //reverse the array
            for(int i=0;i<image[0].length;i++){
            //swap
                int temp=row[i];
                row[i]=row[image[0].length-i-1]^1;//performing xor to change the value from 0 too 1 and 1 to 0

                row[image[0].length-i-1]=temp;

            }


        }
        return image;

    }
}
