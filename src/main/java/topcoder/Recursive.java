package topcoder;

import java.util.LinkedList;
import java.util.Queue;

public class Recursive {
  int fib(int a){
    if(a <= 1) return 1;
    return fib(a - 1)+fib(a -2);
  }
//  int dfs(int now){
////    if(현재 상태가 now가 끝나는 조건){
////      return 현재 상태 now의 값;
////    }
////    int ret = -1;
////    for(int i = 0; i< 다음 상태 개수; i++){
////      int next = i번째 다음 상태;
////      if(next가 조건을 만족하는 경우) ret = Math.max(dfs(next), ret);
////    }
////    return net;
//  }

  public static void main(String[] args) {
    /*
    Queue<T> q = new LinkedList();
    q.add('초기상태');
    while(!q.isEmpty()){
      T now = q.poll();
      현재상태를 처리합니다.
      for(int i = 0; i < 다음 상태 개수; i++){
        T next = i번째 다음 상태;
        if(next를 방문했었는지 판정)
          q.add(next);
      }
    }
     */

  }
}
