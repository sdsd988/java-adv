package thread.control.interrupt;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class ThreadStopMainV4 {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();
        sleep(100);
        log("작업 중단 지시 runFlag=False");
        thread.interrupt();
        log("work 스레드 인터럽트 상태 1 = " + thread.isInterrupted());

    }

    static class MyTask implements Runnable {

        //스레드의 인터럽트 예외가 발생하면, 스레드의 인터럽트 상태들 정상으로 돌리는 이유는?

        @Override
        public void run() {
            while (!Thread.interrupted()) { //스레드 인터럽트 상태 변경
                log("작업중");
            }

            log("work 작업 인터럽트 상태 2 = " + Thread.currentThread().isInterrupted());
            log("자원 정리");
            log("자원 종료");
        }
    }
}
