package topcoder;

/**
 * 고장난 로봇이 평면 위에 있습니다. 그리고 n번 움직입니다. 로봇은 각 단계에서 한 방향(동, 서, 남, 북) 중에 한 방향을
 * 랜덤하게 선택해서 한 칸 움직입니다. 로봇이 동, 서, 남, 북을 선택할 확률은 north, south, east, west % 입니다.
 * 로봇이 임의로 이동하며 같은 지점을 통과하지 않으면 성공했다고 합니다.(참고로 로봇의 시작 지점은 항상 1번째 통과 지점이
 * 됩니다.) 로봇이 성공적으로 보행할 확률을 double 자료형으로 리턴해주세요
 * 예를 들어 "EENE" 또는 "ENW"는 성공이지만, "ENWS" 또는 "WWWWSNE"는 성공이 아닙니다.
 */
public class CrazyRobot {
  boolean[][] grid = new boolean[100][100];
  int vx[] = {1, -1, 0, 0};
  int vy[] = {0, 0, 1, -1};

  double[] prob = new double[4];

  public double getProbability(int n, int east, int west, int south, int north){
    prob[0] = east / 100.0;
    prob[1] = west / 100.0;
    prob[2] = south / 100.0;
    prob[3] = north / 100.0;

    return dfs(50, 50, n);

  }

  private double dfs(int x, int y, int n) {
    if(grid[x][y]) return 0;
    if(n == 0) return 1;

    grid[x][y] = true;
    double ret = 0;
    for(int i = 0; i < 4; i++){
      //east, west, south, north 순서로 로봇을 움직입니다.
      ret += dfs(x + vx[i], y + vy[i], n - 1)* prob[i];
    }
    grid[x][y] = false;

    return ret;
  }
}
