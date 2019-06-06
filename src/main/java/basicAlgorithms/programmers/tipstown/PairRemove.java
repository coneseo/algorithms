package basicAlgorithms.programmers.tipstown;


import java.util.*;

public class PairRemove {
    public static void main(String[] args) {
        String s = "baabaa";
        System.out.println(solution(s));
    }


    public static int solution(String s){
        Stack<Character> stack = new Stack<>();
        char[] arr = null;
        arr = s.toCharArray();
        int answer = 0;
        for(int i =0; i< arr.length; i++) {
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }else if(stack.peek().equals(arr[i])){
                stack.pop();
            }else{
                stack.push(arr[i]);
            }
        }

        if(stack.size() == 0){
            answer = 1;
        }

        return answer;
    }
}
