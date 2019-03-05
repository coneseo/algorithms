package basicAlgorithms.backjun;

public class ChickenHalf {
    public static int chicken(int A, int B, int C, int X, int Y){
        int result = 0;
        if(X == 0){
            result = B*Y;
        }else if(Y == 0){
            result = A*X;
        }
        else if((A+B)/2 > C){
            if(Math.abs(A-B) <= C){
                if(X > Y) {
                    result = (2 * Y * C) + 2 * (X-Y) * C;
                }else{
                    result = (2 * X * C ) + 2 * (Y-X) * C;
                }
            }
            else if(X > Y) {
                result = (2 * Y * C) + A * (X - Y);
            }else
            result = (2 *X * C) + B*(Y-X);
        }else{
            result = A*X + B*Y ;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(chicken(15, 20, 5, 900, 1000));
    }
}
