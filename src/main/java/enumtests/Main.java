package enumtests;

public class Main {
    public static void main(String[] args) {

        System.out.println(Values.A);
    }
}

enum Values{
    A(1), B(2), C(3);

    int i;

    Values(int i) {
        this.i = i;
        System.out.println(i);
    }

    static {
        System.out.println("static");
        System.out.println("testaccount");
    }
}
