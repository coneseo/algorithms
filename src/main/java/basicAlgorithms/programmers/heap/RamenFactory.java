package basicAlgorithms.programmers.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class RamenFactory {
    public static void main(String[] args) {
        int stock = 4;
        int[] dates = {4,10,15};
        int[] supplies = {20,5,10};
        int k = 30;
        int result = solution(stock, dates, supplies,k);
        System.out.println(result);
    }
    public  static int solution(int stock, int[] dates, int[] supplies, int k){
        int answer = 0;
        int index = 0;
        int index2 = 0;
        int st = stock;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        while(st < k){
            for(int i = index; i < dates.length; i++){
                if(dates[i] <= st){
                    pq.offer(supplies[i]);
                    index2 = i;
                }
            }
            index = index2 + 1;
            st += pq.poll();
            answer++;
        }

        return  answer;
    }
}
