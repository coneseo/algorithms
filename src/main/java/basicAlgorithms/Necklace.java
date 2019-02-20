package basicAlgorithms;

import sun.rmi.server.InactiveGroupException;

import java.util.HashMap;
import java.util.Map;

public class Necklace {

    public static void main(String[] args) {
        int a[] = {4,3,2,1,0};
        System.out.println(solution(a));
    }
    public static int solution(int[] A){

        Map<Integer, Boolean> mapNeck = new HashMap<>();
        for(int i = 0; i< A.length ; i++){
            mapNeck.put(i,false);
        }

//        for(Map.Entry<Integer,Integer> e : mapNeck.entrySet()){
//            int num = e.getKey();
//            int value = e.getValue();
//            if(num == value){
//                a += 1;
//                break;
//            }else if(mapNeck.get(value) != value){
//                a += 1;
//            }
//        }
//        int count = 0;
//        for(Map.Entry<Integer, Boolean> e : mapNeck.entrySet()){
//            int num = e.getKey();
//            if(!mapNeck.get(num)){
//                break;
//            }else{
//                //A[num] 값을 index로 가지고 있는 A[값]의 값을 비교?
//                count += 1;
//
//            }
//        }
        int count  = 0;
        for(int i = 0; i < A.length; i++){
                int value = A[i];
            for(int j = 0; j < A.length; j++){
                if(value == A[j]){
                    continue;
                }else{
                    count ++;
                }
            }
        }




        return count;

    }
}
