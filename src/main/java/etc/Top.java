package etc;
class Top {
  public int[] solution(int[] heights) {
    int len = heights.length;
    int[] answer = new int[len];

    for(int i = len-1; i > 0; i--){
      for(int j = i-1; j > 0; j--){
        if(heights[j] < heights[i]){
          answer[i] = j+1;
          break;
        }
      }
    }
    answer[0] = 0;

    return answer;
  }
}
