package level2.cache;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        List<String> cache = new ArrayList<>();

        for (String city : cities) {
            city = city.toLowerCase(); // 대소문자 구분 X

            if(cache.contains(city)){ // 포함여부 확인
                answer += 1; // cache hit

                cache.remove(city);
                cache.add(0, city); // 0번 인덱스로 자리 이동
            }else {
                answer += 5; // cache miss
                cache.add(0, city); // 0번 인덱스에 새로 추가

                if (cache.size() > cacheSize) {
                    cache.remove(cache.size() - 1); // 마지막 값 제거
                }
            }
        }


        return answer;
    }
}
