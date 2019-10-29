package topcoder;

public class MazeMaker {
  public int longestPath(String[] maze, int startRow, int startCol,
      int[] moveRow, int[] moveCol){
    int max = 0;
    int width = maze[0].length(),
        height = maze.length;
    int[][] board = new int[height][width];

    for(int i = 0; i < height; i++)
      for(int j = 0; j < width; j++)
        board[i][j] = -1;
  }
}
