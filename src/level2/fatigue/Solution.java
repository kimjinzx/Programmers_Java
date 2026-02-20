package level2.fatigue;

import java.util.Arrays;

public class Solution {

    public int solution(int k, int[][] dungeons) {

        // java dfs 사용 (깊이 우선 탐색)

        boolean[] visited = new boolean[dungeons.length]; // 방문한 던전은 재방문 X

        int[] answer = {0}; // 내부에서 변경 가능하게 배열 사용

        class DFS {
            void run(int x, int count) { // x:남은 피로도, count: 방문한 던전 수

                answer[0] = Math.max(answer[0], count);

                for(int i = 0; i < dungeons.length; i++) {

                    int a = dungeons[i][0];
                    int b = dungeons[i][1];

                    if(visited[i]) continue; // 방문했으면 패스

                    if(x >= a) {
                        visited[i] = true;

                        run(x - b, count + 1);

                        visited[i] = false;
                    }
                }
            }
        }

        new DFS().run(k, 0);

        return answer[0];
    }
}