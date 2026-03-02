import java.util.concurrent.CountDownLatch;

public final class bwbo implements qlb {
    public final String a;
    public final bwbr b;
    public final CountDownLatch c;

    public bwbo(String s, bwbr bwbr0, CountDownLatch countDownLatch0) {
        this.a = s;
        this.b = bwbr0;
        this.c = countDownLatch0;
    }

    @Override  // qlb
    public final void a(Object object0) {
        ((ggtj)((ggtj)bwbs.a.j()).s(((Throwable)object0))).B("Failed to download lottie: %s", this.a);
        this.b.a(bvwh.b);
        this.c.countDown();
    }
}

