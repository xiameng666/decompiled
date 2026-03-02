import j..util.Objects;
import java.io.File;
import java.util.concurrent.CountDownLatch;

final class bwbp implements gmbg {
    final String a;
    final bwbr b;
    final CountDownLatch c;

    public bwbp(bwbs bwbs0, String s, bwbr bwbr0, CountDownLatch countDownLatch0) {
        this.a = s;
        this.b = bwbr0;
        this.c = countDownLatch0;
        Objects.requireNonNull(bwbs0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ((ggtj)((ggtj)bwbs.a.j()).s(throwable0)).B("Failed to download image: %s", this.a);
        this.b.a(bvwh.b);
        this.c.countDown();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        File file0 = (File)object0;
        this.b.a(bvwh.a);
        this.c.countDown();
    }
}

