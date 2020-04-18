package tests;

public class VacumRobot {
    /*
    S사 사무실은 N x N 크기의 격자 형태로 이루어져 있습니다. 격자 칸에는 책상, 복사기, 책꽂이 등 다양한 물건들이 놓여있으며, 물건이 놓여있지 않은 격자 칸에는 먼지가 쌓여있습니다. 물건이 놓인 칸은 -1로 표시하며, 쌓여있는 먼지의 양은 0 이상의 정수를 이용해 나타냅니다.
    로봇청소기를 이용해 사무실에 쌓인 먼지를 청소하려고 합니다. 로봇 청소기는 사전에 입력된 명령어에 의해서 움직이며, 사용하는 명령어는 다음과 같습니다.

    go : 현재 바라보고 있는 방향으로 한 칸 전진합니다. 만약 이동해야 할 곳이 격자 칸을 벗어나거나, 물건이 놓여있는 칸이면 이동하지 않고 다음 명령을 수행합니다.
    left : 현재 바라보는 방향을 기준으로 왼쪽으로 회전합니다.
    right : 현재 바라보는 방향을 기준으로 오른쪽으로 회전합니다.
    로봇 청소기가 한번 방문한 칸은 모든 먼지가 청소되어 먼지의 양이 0이 됩니다. 이미 청소가 되었거나,
    먼지의 양이 0인 칸을 방문해도 로봇 청소기는 청소를 하지만, 이때 청소하게 되는 먼지의 양은 0입니다.

    현재 사무실의 상태를 나타내는 2차원 배열 office, 로봇 청소기가 놓여있는 칸의 좌표 r, c, 로봇청소기가 처리하는 명령어가 들어있는 배열 move가 매개변수로 주어질 때, 로봇청소기가 주어진 명령어를 모두 처리 후 청소한 먼지의 양을 return 하도록 solution 함수를 완성해주세요. 단, 로봇 청소기는 처음에 항상 북쪽을 바라본 상태로 시작한다고 가정합니다.

    제한사항
    office는 현재 사무실의 물건 배치와 각 칸의 먼지의 양이 들어있는 N x N 크기의 2차원 배열이며, N은 2 이상 20 이하입니다.
    office의 원소는 -1 또는 0 이상 100 이하의 정수입니다.
    -1은 물건이 놓여있어 지나갈 수 없는 칸을 나타냅니다.
    0 이상 100 이하의 정수는 로봇 청소기가 해당 칸에 도착했을 때 청소하게 되는 먼지의 양을 나타냅니다.
    r, c는 로봇 청소기가 처음 놓여있는 칸을 나타냅니다.
    r은 북 - 남 방향의 좌표를 나타냅니다.
    c는 서 - 동 방향의 좌표를 나타냅니다.
    로봇 청소기는 처음에 항상 0 이상의 정수가 적혀 있는 칸에만 놓여있습니다.
    move는 로봇청소기가 처리할 명령어가 순서대로 들어있는 배열입니다. 로봇 청소기는 move 배열에 있는 모든 명령어를 처음부터 순서대로 모두 수행합니다.
    move 배열의 길이는 1 이상 200 이하입니다.
    move 배열에는 go, left, right 단어만 들어있습니다.
     */
  public static int solution(int[][] office, int r, int c, String[] move) {
    int answer = office[r][c];
    office[r][c] = 0;
    char direction = 'n';
    for(int i = 0; i < move.length; i++){

      if("go".equals(move[i])){
        if('n' == direction){
          r--;
        }else if('e' == direction){
          c++;
        }else if('s' == direction){
          r++;
        }else{
          c--;
        }
      }else if("right".equals(move[i])){
        if('e' == direction){
          direction = 's';
        }else if('s' == direction){
          direction = 'w';
        }else if('w' == direction){
          direction = 'n';
        }else{
          direction = 'e';
        }
      }else if("left".equals(move[i])){
        if('e' == direction){
          direction = 'n';
        }else if('s' == direction){
          direction = 'e';
        }else if('w' == direction){
          direction = 's';
        }else{
          direction = 'w';
        }
      }
      if(r < 0) r=0;
      if(c < 0) c=0;
      if(office[r][c] == -1){
        if('n' == direction){
          r--;
        }else if('e' == direction){
          c--;
        }else if('s' == direction){
          r++;
        }else{
          c++;
        }
      }else{
        answer += office[r][c];
        office[r][c] = 0;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    int[][] a = {{5,-1,4},{6,3,-1},{2,-1,1}};
    int r = 1;
    int c = 0;
    String[] move = {"go","go","right","go","right","go","left","go"};
    int solution = solution(a, r, c, move);
    System.out.println(solution);
  }

}
