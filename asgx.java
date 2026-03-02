import j..util.Objects;
import java.util.concurrent.CountDownLatch;

final class asgx implements aqzm {
    final CountDownLatch a;
    final asgy b;

    public asgx(asgy asgy0, CountDownLatch countDownLatch0) {
        this.a = countDownLatch0;
        Objects.requireNonNull(asgy0);
        this.b = asgy0;
        super();
    }

    @Override  // aqzm
    public final void a(Throwable throwable0) {
        this.b.b.set(true);
        this.a.countDown();
    }

    @Override  // aqzm
    public final void b(Object object0) {
        synchronized(this.b.a) {
            this.b.c = (gged_interceptors)object0;
        }
        this.a.countDown();
    }
}

