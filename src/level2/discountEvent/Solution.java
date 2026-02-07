package level2.discountEvent;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        System.out.println("want => "+ Arrays.toString(want));
        System.out.println("number => "+Arrays.toString(number));
        System.out.println("discount => "+Arrays.toString(discount));


//        1. discount를 n~n+9까지 10일 범위로 잡는다 (14개이니 최대 5번)
//        2. 그 10일 범위의 상품 개수를 센다 (Map)
//        3. want / number와 비교한다
//        4. 모두 충족되면 answer++


        for (int n = 0; n <= discount.length - 10; n++) { // 5번 루프

            Map<String, Integer> stuff_cnt = new HashMap<>();

            for (int i = n; i < n + 10; i++) { // 0~10, 1~11, 2~12 ...
                // key:상품명  value:개수(저장된 값이 없으면 0으로)
                stuff_cnt.put(discount[i],stuff_cnt.getOrDefault(discount[i],0) + 1);
            }
            
            boolean ok = true;
            for(int k=0; k<want.length; k++){
                // stuff_cnt(10일간 할인목록)의 상품의 각각 개수가 내가 원하는 상품 항목보다 적을 경우 아웃
                if(stuff_cnt.getOrDefault(want[k],0) < number[k]) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                answer++;
            }
            
        }

        return answer;
    }
}
