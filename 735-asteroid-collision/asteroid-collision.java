import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int a : asteroids) {
            if (a > 0) {
                stack.offerLast(a);
            } else {
                while (!stack.isEmpty() && stack.peekLast() > 0 && stack.peekLast() < -a) {
                    stack.pollLast();
                }
                if (!stack.isEmpty() && stack.peekLast() == -a) {
                    stack.pollLast();
                } else if (stack.isEmpty() || stack.peekLast() < 0) {
                    stack.offerLast(a);
                }
            }
        }
        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pollLast();
        }
        return res;
    }
}
