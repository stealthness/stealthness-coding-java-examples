package spring2019;

public class ThreadExample1 implements  Runnable{

    public static void main(String[] args) {

        Thread t = new Thread(new ThreadExample1());
        t.start();
        System.out.println("2");
        t.run();
        System.out.println("3");
    }

    @Override
    public void run() {
        System.out.println("1");
    }
}
