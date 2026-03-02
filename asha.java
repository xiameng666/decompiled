import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public final class asha implements aqzm {
    final AtomicReference a;
    final CountDownLatch b;

    public asha(AtomicReference atomicReference0, CountDownLatch countDownLatch0) {
        this.a = atomicReference0;
        this.b = countDownLatch0;
        super();
    }

    @Override  // aqzm
    public final void a(Throwable throwable0) {
        ashb.a.g("Error getting disabled flavors", throwable0, new Object[0]);
        this.a.set(null);
        this.b.countDown();
    }

    @Override  // aqzm
    public final void b(Object object0) {
        ashb.a.h("Received disabled flavors: %s", new Object[]{this.a});
        this.a.set(((gged_interceptors)object0));
        this.b.countDown();
    }
}

