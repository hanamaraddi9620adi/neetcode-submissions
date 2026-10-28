
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int[] deque = new int[n];

        int front = 0;
        int back = -1;
        int index = 0;

        for (int j = 0; j < n; j++) {
            while (front <= back && deque[front] <= j - k) {
                front++;
            }

            while (front <= back && nums[deque[back]] <= nums[j]) {
                back--;
            }

            deque[++back] = j;

            if (j >= k - 1) {
                result[index++] = nums[deque[front]];
            }
        }

        return result;
    }
}
