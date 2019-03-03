package basicAlgorithms.recursives;

/*
    Pseudo code
 Algorithm for countCells(x, y)
 if the pixel(x, y) is outside the grid
    the result is 0;
  else if pixel(x, y) is not an image pixel or already counted
    the result is 0;
  else
    set the colour of the pixel (x, y) to a red colour;
    the result is 1 plus the number of cells in each piece of
    the blob that includes a nearest neightbor;
 */
public class CountCellsInBlob {
    private static int n = 8;
    private static int [][] grid = {
            {1,0,0,0,0,0,0,1},
            {0,1,1,0,0,1,0,0},
            {1,1,0,0,1,0,1,0},
            {0,0,0,0,0,1,0,0},
            {0,1,0,1,0,1,0,0},
            {0,1,0,1,0,1,0,0},
            {1,0,0,0,1,0,0,1},
            {0,1,1,0,0,1,1,1}
    };
    private static int BACKGROUND_COLOR = 0;
    private static int IMAGE_COLOR = 1;
    private static int ALREADY_COUNTED = 2;

    public static int countCells(int x, int y){
        if(x<0 || x>=n || y<0 || y>=n)
            return 0;
        else if(grid[x][y] != IMAGE_COLOR)
            return 0;
        else {
            grid[x][y] = ALREADY_COUNTED;
            return 1 + countCells(x-1, y+1) + countCells(x, y+1)
                    + countCells(x+1, y+1) + countCells(x-1, y)
                    + countCells(x, y-1) + countCells(x+1, y-1);
        }
    }

    public static void main(String[] args) {
        printGrid();
        int result = countCells(6,4);
        System.out.println(result);
    }

    private static void printGrid() {
        System.out.println();
        for(int i=0; i< grid.length; i++){
            for(int j=0; j<grid[i].length; j++)
                System.out.print(grid[i][j]);
            System.out.println();
        }
        System.out.println();
    }
}
