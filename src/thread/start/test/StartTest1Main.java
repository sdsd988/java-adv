package thread.start.test;

public class StartTest1Main {

    public static void main(String[] args) {
        Thread thread = new CounterThread();
        thread.start();
    }
}
