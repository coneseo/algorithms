package topcoder;

public class KiwiJuiceEasy {
    public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] told) {
        for (int i = 0; i < fromId.length; i++) {
            int f = fromId[i];
            int t = told[i];

            int vol = Math.min(bottles[f], capacities[t] - bottles[t]);

            bottles[f] -= vol;
            bottles[t] += vol;
        }
        return bottles;
    }

    public int[] thePouring2(int[] capacities, int[] bottles, int[] fromId, int[] told){
        for(int i=0; i<fromId.length; i++){
            int sum = bottles[fromId[i] + bottles[told[i]]];
            bottles[told[i]]  = Math.min(sum, capacities[told[i]]);
            bottles[fromId[i]] = sum - bottles[told[i]];
        }

        return bottles;
        
    }
}
