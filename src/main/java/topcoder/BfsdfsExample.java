package topcoder;

public class BfsdfsExample {
  //재귀함수
  int fib(int a) {
    if (a <= 1)
      return 1;
    return fib(a - 1) + fib(a - 2);
  }

  //깊이 우선 탐색
  int dfs(int now){
    if(현재 상태 now 가 끝나는 조건) return 현재 상태 now의 값;
    int ret = -1;
    for(int i = 0; i < 다음 상태 개수; i++){
      int next = i번째 다음 상태;
      if(next가 조건을 만족하는 경우) ret = Math.max(dfx(next), ret);
    }
    return ret;
  }
}
