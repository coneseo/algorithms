package basicAlgorithms.programmers.heap;

import java.util.*;
public class Scoville {
//    public int solution(int[] scoville, int K){
//        int answer = 0;
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        for(int a : scoville){
//            if(a < K){
//                priorityQueue.add(a);
//            }
//        }
//
//
//        return answer;
//    }

    public static void main(String[] args) {
        int[] citations = {2,1,3,4,5,6};
        System.out.println(solutionl(citations));
    }
    public static int solutionl(int[] citations){
        int answer = 0;
        Arrays.sort(citations);
        int max = citations[citations.length-1];

        for(int i = max; i > 0 ;i--){
            int overCount = 0;
            for(int j = citations.length  ; j > 0;j--){
                if(citations[j - 1] >= i){
                    overCount++;
                }
            }
            if(overCount >= i){
                answer = i;
                break;
            }
        }
        return answer;
    }
    public static int solution(int[] citations) {
        int answer = 0;
        int k = 1;
        int up = 0;
        int down = 0;
        while(k < citations.length){
            for(int a : citations){
                if(k == a){
                    up++;
                    down++;
                }else if(k >= a){
                    down++;
                }else{
                    up++;
                }
            }
            if(up == down){
                answer = up;
                break;
            }else{
                up = 0;
                down = 0;
                k++;
                continue;
            }
        }

        return answer;
    }
    }



