package topcoder;

public class KiwiJuiceEasy {
    public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] told){
        for(int i=0; i< fromId.length; i++){
            int f = fromId[i];
            int t = told[i];

            int vol = Math.min(bottles[f], capacities[t] - bottles[t]);

            bottles[f] -= vol;
            bottles[t] += vol;
        }
        return  bottles;
    }
}
