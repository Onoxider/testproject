package sngltn;

public class Singleton {

    public static int x;

    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

    public String getState() {
        return "hi there";
    }
}
