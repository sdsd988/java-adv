package thread.control;

import static util.MyLogger.log;

public class ThreadMain {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
    }
}
