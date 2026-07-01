/*
Problem: 2D Array - DS
Platform: HackerRank
Difficulty: Easy

Approach:
1. Traverse all possible hourglass starting positions.
2. Calculate the sum of the current hourglass.
3. Keep track of the maximum hourglass sum.

Time Complexity: O(1)
Space Complexity: O(1)
*/


import java.util.List;

public class HourGlass {

    public static int hourglassSum(List<List<Integer>> arr) {

        int n = 4;
            int count = 0;
            int maxCount = Integer.MIN_VALUE;
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    
                    int sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) + arr.get(i+1).get(j+1) + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                    
                    count = sum;
                    if(count > maxCount){
                        maxCount = count;
                    }
                }
            } return maxCount; 

    }
}