class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int arr[] = new int[m+n];
        int newlen = m+n;
        ArrayList<Integer> list = new ArrayList<>();
        for( int num: nums1){
            list.add(num);
        }
        for( int num:nums2){
            list.add(num);
        }
        for( int i =0;i<newlen ;i++){
            arr[i]=list.get(i);
        }
        Arrays.sort(arr);
      
           if (newlen % 2 != 0) {
            // Odd length: return the middle element
            return arr[newlen/ 2];
        } else {
            // Even length: return the average of the two middle elements
            return (arr[newlen / 2 - 1] + arr[newlen / 2]) / 2.0;
        }
    }
}