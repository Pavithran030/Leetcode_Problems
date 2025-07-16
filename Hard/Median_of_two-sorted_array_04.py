class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        k=sorted(nums1+nums2)
        m=len(k)
        if m%2==0:
            l=m//2
            j=(k[l-1]+k[l])/2
            return j 
        else:
            l=m//2
            return k[l]
