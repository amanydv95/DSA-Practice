class Solution {
public void rotate(int[] nums, int k) {
int n = nums.length;
int rotations = k % n;
int[] copy = Arrays.copyOf(nums, n);
    for (int i = 0; i < n; i++) {
        int j = i >= rotations
        ? i - rotations
        : n - rotations + i;
        nums[i] = copy[j];
         }
     }
}