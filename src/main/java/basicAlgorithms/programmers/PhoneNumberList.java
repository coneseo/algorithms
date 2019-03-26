package basicAlgorithms.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneNumberList {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int inx = 0; inx < phone_book.length; inx++) {
            for(int jnx = 1; jnx < phone_book[inx].length(); jnx++) {
                map.put(phone_book[inx].substring(0, jnx), 1);
            }
        }
        for(int inx = 0; inx < phone_book.length; inx++) {
            if(map.containsKey(phone_book[inx])) {
                answer = false;
                break;
            } else {
                map.put(phone_book[inx], 1);
            }
        }
        return answer;
    }
}
