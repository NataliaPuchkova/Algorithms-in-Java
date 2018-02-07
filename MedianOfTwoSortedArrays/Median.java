class Median{
/* Median of two sorted arrays

This problem can be converted to the problem of finding kth element, k is (A's length + B' Length)/2.

If any of the two arrays is empty, then the kth element is the non-empty array's kth element. If k == 0, the kth element is the first element of A or B.

For normal cases(all other cases), we need to move the pointer at the pace of half of the array size to get log(n) time. 
*/
  public int findKth(int k, int[] nums1, int[] nums2, int s1, int s2){
                if(s1>=nums1.length)
                        return nums2[s2+k-1];

                if(s2>=nums2.length)
                        return nums1[s1+k-1];

                if(k==1)
                        return Math.min(nums1[s1], nums2[s2]);

                int m1 = s1+k/2-1;
                int m2 = s2+k/2-1;

                int mid1 = m1<nums1.length?nums1[m1]:Integer.MAX_VALUE;
                int mid2 = m2<nums2.length?nums2[m2]:Integer.MAX_VALUE;

                if(mid1<mid2){
                        return findKth(k-k/2, nums1, nums2, m1+1, s2);
                 }else{
                        return findKth(k-k/2, nums1, nums2, s1, m2+1);
                }
        }   
}
