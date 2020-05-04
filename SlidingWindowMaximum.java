import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String args[]) {
        Solution solution = new Solution();
        int a[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int ans[] = solution.maxSlidingWindow(a, 3);
        for (int x : ans) {
            System.out.println(x + " ");
        }
    }
}

class Solution {

    public  int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        if (n <= 1) return nums;
        Deque<Integer> dq = new LinkedList<>();
        int ans[] = new int[n - k + 1];
        int i = 0;
        for (; i < k; i++) {
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for (; i < n; i++) {
            ans[i - k] = nums[dq.peekFirst()];
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        ans[i - k] = nums[dq.peekFirst()];
        return ans;

    }
}