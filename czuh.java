import java.util.concurrent.CountDownLatch;

public final class czuh implements Runnable {
    public final czun a;
    public final CountDownLatch b;

    public czuh(czun czun0, CountDownLatch countDownLatch0) {
        this.a = czun0;
        this.b = countDownLatch0;
    }

    @Override
    public final void run() {
        this.a.e.a();
        this.b.countDown();
    }
}

