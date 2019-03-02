package basicAlgorithms.recursives;

public class FindMazePath {
    private static int n = 8;
    private static int [][] maze = {
            {0,0,0,0,0,0,0,1},
            {0,1,1,0,1,1,0,1},
            {0,0,0,1,0,0,0,1},
            {0,1,0,0,1,1,0,0},
            {0,1,1,1,0,0,1,1},
            {0,1,0,0,0,1,0,1},
            {0,0,0,1,0,0,0,1},
            {0,1,1,1,0,1,0,0}
    };
    //PATH_COLOUR : visited이며 아직 출구로 가는 경로가 될 가능성이 있는 cell
    //BLOCKED_COLOR : visited이며 출구까지의 경로상에 있지 않음이 밝혀진 cell
    private static final int PATHWAY_COLOUR = 0; //white
    private static final int WALL_COLOUR = 1; //blue
    private static final int BLOCKED_COLOUR = 2; //red
    private static final int PATH_COLOUR = 3; //green

    public static boolean findMazePath(int x, int y){
        //처음의 입력값이 범위를 벗어났는지 확인하는 if절
        if(x<0 || y<0 || x>=n || y>=n)
            return false;
        //재귀함수의 base line, PATHWARY_COLOUR가 0이 아니라면  false를 리턴
        else if(maze[x][y] != PATHWAY_COLOUR)
            return false;
        else if(x==n-1 && y==n-1){
            maze[x][y]= PATH_COLOUR;
            return true;
        }
        else{
            maze[x][y] = PATH_COLOUR;
            if (findMazePath(x-1,y) || findMazePath(x, y+1)
                    || findMazePath(x+1,y) || findMazePath(x, y-1)){
                return true;
            }
            maze[x][y] = BLOCKED_COLOUR;//dead end
            return false;
        }
    }

    public static void main(String[] args) {
        printMaze();
        findMazePath(0,0);
        printMaze();
    }

    private static void printMaze() {
        System.out.println();
        for(int i=0; i< maze.length; i++){
            for(int j=0; j<maze[i].length; j++)
                System.out.print(maze[i][j]);
            System.out.println();
        }
        System.out.println();
    }


}
