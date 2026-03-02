import java.util.concurrent.CountDownLatch;

public final class bwbn implements qlb {
    public final bwbr a;
    public final CountDownLatch b;

    public bwbn(bwbr bwbr0, CountDownLatch countDownLatch0) {
        this.a = bwbr0;
        this.b = countDownLatch0;
    }

    @Override  // qlb
    public final void a(Object object0) {
        qkb qkb0 = (qkb)object0;
        this.a.a(bvwh.a);
        this.b.countDown();
    }
}

