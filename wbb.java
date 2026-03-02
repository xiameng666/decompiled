import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

final class wbb implements Runnable {
    @Override
    public final void run() {
        CountDownLatch countDownLatch0;
        try {
            wbc.b = MessageDigest.getInstance("MD5");
            countDownLatch0 = wbc.c;
        }
        catch(NoSuchAlgorithmException unused_ex) {
            countDownLatch0 = wbc.c;
        }
        catch(Throwable throwable0) {
            wbc.c.countDown();
            throw throwable0;
        }
        countDownLatch0.countDown();
    }
}

