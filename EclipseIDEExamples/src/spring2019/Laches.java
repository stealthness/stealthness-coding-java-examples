package spring2019;

public class Laches {

    public static void main(String[] args) {
        double d = 3.65f;
        float f = 1.99f;

        int i = (int) d + (int) f;

        System.out.println(i);

        d = -3.65f;
        f = -1.99f;

        i = (int) d + (int) f;

        System.out.println(i);
    }
}
