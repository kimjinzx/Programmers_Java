package level2.discountEvent;


public class SolutionRunner {
    public static void main(String[] args) {

        Solution sol = new Solution();

        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {
                "chicken", "apple", "apple", "banana", "rice",
                "apple", "pork", "banana", "pork", "rice",
                "pot", "banana", "apple", "banana"
        };

        int result = sol.solution(want, number, discount);
        System.out.println("result => "+result);

    }
}
