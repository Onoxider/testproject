package sngltn;

public class Main {
    public static void main(String[] args) {

        String state = getStateimpl().getState();
        System.out.println(state);
    }


    public static State getStateimpl() {
 /*       return new State() {
            @Override
            public String getState() {
                return Singleton.getInstance().getState();
            }
        };*/

        return () -> Singleton.getInstance().getState();
    }
}
