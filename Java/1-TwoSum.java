# Code
```java []
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i +1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j};
                }
            }
        }
         return new int[] {};
    }
}
```

/* Intuition
We need to find two numbers in an array that add up to a target.  
The simplest way is to check all pairs of numbers and see if they sum to the target.  
This brute-force approach is easy to understand and implement.
*/

/* Approach
1. Loop through each number `nums[i]` in the array.
2. For each `i`, loop through every number after it `nums[j]` (`j > i`).
3. If `nums[i] + nums[j] == target`, return `[i, j]`.
4. Since the problem guarantees exactly one solution, we don’t need extra checks.
*/

/* Complexity
- Time complexity: O(n^2)  
  We check all pairs of numbers in the array.
- Space complexity: O(1)  
  No extra space is used.
*/
