import java.util.concurrent.CountDownLatch;

public final class czre implements Runnable {
    public final czrf a;
    public final CountDownLatch b;

    public czre(czrf czrf0, CountDownLatch countDownLatch0) {
        this.a = czrf0;
        this.b = countDownLatch0;
    }

    @Override
    public final void run() {
        czrf czrf0 = this.a;
        cupv cupv0 = czrf0.a;
        if(cupv0 != null) {
            cupv0.d(czrf0.d);
            this.b.countDown();
        }
    }
}

