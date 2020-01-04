package leetcode;

public class ReserveInteger {

  public static void main(String[] args) {
    int q = 1534236469;
    int res = reserve(q);
    System.out.println(res);
  }
  public static int reserve(int x){
    int flag = 0;
    if(x == 0){
      return 0;
    }else if(x > 0){
      flag = 1;
    }else{
      x *= (-1);
    }
    String a = Integer.toString(x);
    String[] split = a.split("");
    String result = "";
    int length = split.length -1;
    int check = 0;
    for(int i = length; i >= 0; i--){
      if(split[i].equals("0") && check == 0){
        continue;
      }else{
        check = 1;
        result += split[i];
      }
    }
    if(flag == 0){
      result = "-"+result;
    }
    long res = Long.parseLong(result);
    return (int)res;
  }
}
