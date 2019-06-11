package basicAlgorithms.programmers.stackQueue;

public class Top {
    public static void main(String[] args) {
        int[] answer = {6, 9, 5, 7, 4};
        int[] arr = solution2(answer);
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    public static int[] solution(int[] numbers) {
        int[] answer = {6, 9, 5, 7, 4};


        return answer;
    }

    public static int[] solution2(int[] heights) {
        int towerNum = heights.length;
        int[] answer = new int[towerNum];

//        for(int sender = towerNum-1; sender>0; sender--){
//            for(int receiver = 0; receiver < sender; receiver++){
//                if(heights[receiver] > heights[sender])
//                    answer[sender] = receiver+1;
//            }
//        }

        for (int sender = towerNum - 1; sender > 0; sender--) {
            for (int receiver = sender - 1; receiver > 0; receiver--) {
                if (heights[sender] < heights[receiver]) {
                    answer[sender] = receiver + 1;
                    break;
                }
            }
        }
        answer[0] = 0;

        return answer;
    }
}
