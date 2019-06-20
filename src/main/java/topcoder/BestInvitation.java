package topcoder;

import java.util.HashMap;

public class BestInvitation {
    public static void main(String[] args) {
        String[] first = {"fishing", "gardening", "swimming", "fishing"};
        String[] second = {"gardening", "coding", "gardening", "swimming"};
        BestInvitation bestInvitation = new BestInvitation();
        int result = bestInvitation.bestInvitationWithHashMap(first, second);
        System.out.println(result);

    }

    public int bestInvitation1(String[] first, String[] second){
        int i,j;
        int ans = 0;

        for(i=0; i < first.length; i++){
            int f = 0;
            int s = 0;
            for(j=0; j<first.length; j++){
                if(first[i].equals(first[j])) f++;
                if(first[i].equals(second[j])) f++;
                if(second[i].equals(second[j])) s++;
                if(second[i].equals(first[i])) s++;
            }
            ans = Math.max(f,ans);
            ans = Math.max(s, ans);
        }
        return ans;
    }
    public static int bestInvitation2(String[] first, String[] second) {
        int i, j = 0;
        int ans = 0;

        for (i = 0; i < first.length; i++) {
            int f = 0;
            int s = 0;
            for (j = 0; j < first.length; j++) {
                if (first[i].equals(first[j])) f++;
                if (first[i].equals(second[j])) f++;
                if (second[i].equals(first[j])) s++;
                if (second[i].equals(second[j])) s++;
            }

            ans = Math.max(f, ans);
            ans = Math.max(s, ans);
        }

        return ans;
    }

    public int bestInvitationWithHashMap(String[] first, String[] second){
        HashMap<String, Integer> dic = new HashMap<>();

        for(int i=0; i<first.length; i++){
            dic.put(first[i], 0);
            dic.put(second[i], 0);
        }
        for(int i=0; i<first.length; i++){
            dic.put(first[i], dic.get(first[i])+1);
            dic.put(second[i], dic.get(second[i])+1);
        }
        int ans = 0;
        for(String key : dic.keySet()){
            ans = Math.max(ans, dic.get(key));
        }
        return ans;
    }

}
