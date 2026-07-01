/*
 * Problem: Left Rotation
 * Platform: HackerRank
 * Difficulty: Easy
 *
 * Approach:
 * 1. Create a new ArrayList to store the rotated elements.
 * 2. Copy elements from index d to n-1.
 * 3. Copy the remaining elements from index 0 to d-1.
 * 4. Return the resulting list.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.ArrayList;
import java.util.List;

public class LeftRotate {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

        List<Integer> rotated = new ArrayList<>();
        int n = arr.size();

        // Copy elements from index d to n-1
        for (int i = d; i < n; i++) {
            rotated.add(arr.get(i));
        }

        // Copy the remaining elements from index 0 to d-1
        for (int i = 0; i < d; i++) {
            rotated.add(arr.get(i));
        }

        return rotated;

    }
}