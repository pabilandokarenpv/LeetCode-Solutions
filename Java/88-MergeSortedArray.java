# Code
```java []
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i = m - 1;
       int j = n - 1;
       int k = m + n -1;

       while (i >=0 && j >=0) {
        if (nums1[i] > nums2[j]) {
            nums1[k] = nums1[i];
            i--;
        } else {
            nums1[k] = nums2[j];
            j--;
        }
        k--;
       }

       while (j >=0) {
        nums1[k] = nums2[j];
        j--;
        k--;
       }

    }
}
```


# Intuition
<!-- Describe your first thoughts on how to solve this problem. 

When merging two sorted arrays, it’s easier to start from the end because the largest elements are at the back.  

If we fill `nums1` from the end, we avoid overwriting values that we still need to compare.  

By using three pointers — one for each array and one for the final position — we can merge efficiently in-place.

-->

# Approach
<!-- Describe your approach to solving the problem. 

1. Initialize three pointers:
   - `i = m - 1` → last valid element in `nums1`
   - `j = n - 1` → last element in `nums2`
   - `k = m + n - 1` → last index in `nums1` (where merged elements go)
   
2. While both arrays have elements left:
   - Compare `nums1[i]` and `nums2[j]`.
   - Place the larger element at `nums1[k]`.
   - Move the corresponding pointer backward.
   
3. If any elements remain in `nums2`, copy them into `nums1` (since `nums1`'s remaining elements are already in place).

4. The array `nums1` will now be fully merged and sorted in non-decreasing order.

-->

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

  
