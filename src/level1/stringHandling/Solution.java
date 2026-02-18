package level1.stringHandling;

public class Solution {
    public boolean solution(String s) {
        boolean answer = false;

        /*
        if(4 == s.length() || 6 == s.length()){
            if(s.matches("[+-]?\\d*(\\.\\d+)?")){
                answer = true;
            }else {
                answer = false;
            }
        }
        */

        if(4 == s.length() || 6 == s.length()){
            try{
                int x = Integer.parseInt(s);
                answer = true;
            }catch (NumberFormatException e){
                answer = false;
            }
        }else {
            answer = false;
        }

        return answer;
    }
}
