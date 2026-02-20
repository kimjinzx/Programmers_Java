package level2.fatigue;

public class SolutionRunner {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int k = 80;
        int[][] dungeons = {
                                {80, 20},
                                {50, 40},
                                {30, 10}
                            };

        // 메서드 호출
        int result = sol.solution(k, dungeons);

        // 결과 출력
        System.out.println("result = " + result);
    }
}
