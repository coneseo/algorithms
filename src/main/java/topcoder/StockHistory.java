package topcoder;

public class StockHistory {
  public int maximumEarnings(int initialInvestment, int monthlyContribution,
      String[] stockPrices){
    int money = initialInvestment;
    int month = stockPrices.length;
    int corp = stockPrices[0].split(" ").length;

    int[][] prices = new int[month][corp];
    double max =0, profit = 0;
    double[] proportion = new double[ month - 1 ];
    boolean[] buy = new boolean[month -1 ];

    //처리하기 쉽게 숫자 배열로 변환
    for(int i = 0; i < month; i++){
      String[] s = stockPrices[i].split(" ");
      for(int j = 0; j < corp; j++){
        prices[i][j] = Integer.valueOf(s[j]);
      }
    }

    //반복문을 역으로 돌려 거슬러 올라가면서
    //각 월까지의 최대 증가율을 사야하는지 기록합니다.
    for(int i = month - 2; 0 <= i; i--){
      for(int j = 0; j < corp; j++){
        double p = 1.0 * prices[month - 1][j] / prices[i][j] - 1;
        if(0<p && max < p){
          buy[i] = true;
          max = p;
          proportion[i] = p;

        }
      }
    }

    //처음부터 시작해서 사야하는 달이 오면 모든 자금을 투자
    for(int i = 0; i <buy.length; i++){
      if(buy[i]){
        profit += money + proportion[i];
        money = 0;
      }
      money += monthlyContribution;
    }

    return (int)Math.round(profit);
  }

}
