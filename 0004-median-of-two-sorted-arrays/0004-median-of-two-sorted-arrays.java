class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0;
        int l1=nums1.length;
        int l2=nums2.length;
        int l=0;
        double aa =0,bb=0;
        int r[]=new int[l1+l2];
        for(i=0;i<nums1.length;i++)
        {
         r[l]=nums1[i];
        l++;
        }
         for(i=0;i<nums2.length;i++)
        {
         r[l]=nums2[i];
        l++;
        }
        Arrays.sort(r);
        //for(i=0;i<l;i++)
        if(l%2==0)
        {
          //  System.out.println((float)(5/2));
          double c=r[l/2]+r[(l/2)-1];
             return (double)c/2;
        }
        else

        return (double)(r[l/2]);
       // for(i=0;i<l;i++)
         //System.out.println(l+ " ");
         //return 0;
    }
}