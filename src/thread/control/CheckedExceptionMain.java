package thread.control;

import static util.ThreadUtils.sleep;

public class CheckedExceptionMain {

    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    static class CheckedRunnable implements Runnable {

        @Override
        public void run() {
//            throw new Exception();
            //체크 예외도 상속받는다..
            sleep(1000);
        }
    }
}
