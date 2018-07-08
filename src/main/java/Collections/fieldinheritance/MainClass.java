package Collections.fieldinheritance;

class A {
   private int i = 10;

}

class B extends A {


}

public class MainClass {
    public static void main(String[] args) {
        A a= new B();

        System.out.println();

        Integer[][] ints = { { 1, 2, 3 }, { null }, { 7, 8, 9 } };
        System.out.println("value = " + ints[2][1].intValue());
    }
}
