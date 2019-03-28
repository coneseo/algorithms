package basicAlgorithms.programmers;

public class Ddangddamuk {
//    int solution(int[][] land) {
//        int answer = 0;
//        int point = -1;
//        int apoint = -1;
//        for(int i=0; i<land.length; i++) {
//            int max = 0;
//            for (int j = 0; j < land[i].length; j++) {
//                if(apoint == j){
//                    continue;
//                } else if(apoint != j){
//                    if(max < land[i][j]) {
//                        max = land[i][j];
//                        point = j;
//                    }
//                }
//            }
//            apoint = point;
//            answer += max;
//        }
//        return answer;
//    }


        int hopscotch(int[][] board, int size) {
            return hopscotch(board, size, 0, -1);
        }

        private int hopscotch(int[][] board, int size, int y, int idx) {
            if (y >= size) return 0;
            int answer = Integer.MIN_VALUE;
            for (int i = 0; i < 4; i++) {
                if (i != idx) {
                    answer = Math.max(hopscotch(board, size, y + 1, i) + board[y][i], answer);
                }
            }
            return answer;
        }

    public static void main(String[] args) {
        Ddangddamuk d = new Ddangddamuk();
        int[][] land = {{1,2,3,5},{9,6,7,8},{10,3,2,1}};
        System.out.println(d.hopscotch(land,3));

    }
}
