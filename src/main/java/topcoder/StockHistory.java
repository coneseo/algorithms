package topcoder;

public class StockHistory {
  public int maximumEarnings(int initialInvestment, int monthlyContribution,
      String[] stockPrices){
    int money = initialInvestment;
    int month = stockPrices.length;
    int corp = stockPrices[0].split(" ").length;

    int[][] prices = new int[month][corp];
    double max =0, profit = 0;
    double[] promotion = new double[ month - 1 ];
    boolean[] buy = new boolean[month -1 ];

    //처리하기 쉽게 숫자 배열로 변환
    for(int i = 0; i < month; i++){
      String[] s = stockPrices[i].split(" ");
      for(int j = 0; j < corp; j++){
        prices[i][j] = Integer.valueOf(s[j]);
      }
    }
  }
}
