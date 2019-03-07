package topcoder;

public class BestInvitation {
    public static void main(String[] args) {
        String[] first = {"a", "b", "c"};
        String[] second = {"k", "c", "l"};
        System.out.println( bestInvitation(first, second));

    }

    public static int bestInvitation(String[] first, String[] second){
        int i,j = 0;
        int ans = 0;

        for(i=0; i<first.length; i++){
            int f = 0;
            int s = 0;
            for(j=0; j<first.length; j++){
                if(first[i].equals(first[j])) f++;
                if(first[i].equals(second[j])) f++;
                if(second[i].equals(first[j])) s++;
                if(second[i].equals(second[j])) s++;
            }

            ans = Math.max(f, ans);
            ans = Math.max(s, ans);
        }

        return ans;
    }

}
