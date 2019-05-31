package basicAlgorithms.programmers.hash;

public interface Hahahah {
     int number = 1;

    public default void laugh(){
        System.out.println("sdfsdf");
        System.out.println(number);
    }

    public static void main(String[] args) {
        Hahahah hahahah =new Hahahah() {
            @Override
            public void laugh() {

            }
        };
    }

}
