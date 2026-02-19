package level2.cache;

import java.util.Arrays;

public class SolutionRunner {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};

        int result = sol.solution(10, cities);

        System.out.println(result);
    }
}
