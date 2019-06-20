package topcoder;

public class KiwiJuiceEasy {

    public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] told){
        for(int i=0; i<fromId.length; i++){
            int f = fromId[i];
            int t = told[i];
            int space = capacities[t] - bottles[t];

            if(space >= bottles[f]){
                int vol = bottles[f];
                bottles[f] = 0;
                bottles[t] += vol;
            }else{
                int vol = space;
                bottles[f] -= space;
                bottles[t] += space;
            }
        }
        return bottles;

    }

    public int[] thePouring2(int[] capacities, int[] bottles, int[] fromId, int[] told) {
        for (int i = 0; i < fromId.length; i++) {
            int f = fromId[i];
            int t = told[i];
            //남은 공간과 옮길 주스의 양을 비교하면 둘 중 작은 것이 이동량이 된다.
            //위와 같이 조건문이 필요 이상으로 많으면 그만큼 코드의 양이 많아지고
            //입력에 따라 처리되지 않는 부분이 발생합니다.
            //이럴 때 아래와 같이 Math를 이용해서 하는 것도 괜찮습니다.
            int vol = Math.min(bottles[f], capacities[t] - bottles[t]);

            bottles[f] -= vol;
            bottles[t] += vol;
        }
        return bottles;
    }

    public int[] thePouring3(int[] capacities, int[] bottles, int[] fromId, int[] told){
        for(int i=0; i<fromId.length; i++){
            //총합 = 기존 주스 + 합칠 주스
            int sum = bottles[fromId[i]] + bottles[told[i]];
            //옮길 주스에는 총합이랑 합칠 주스 병의 용량 중 더 작은 것을 넣고
            bottles[told[i]] = Math.min(sum, capacities[told[i]]);
            //기존 주스에는 총합에서 합칠 주스의 양을 뺀다.
            bottles[fromId[i]] -= sum - bottles[told[i]];

        }

        return bottles;

    }


}
