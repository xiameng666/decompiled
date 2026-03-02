import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class gxuk implements gxue {
    public static final long a;
    public static final long b;
    public final gxuj c;
    public final bboh d;
    public volatile boolean e;

    static {
        gxuk.a = TimeUnit.SECONDS.toMillis(5L);
        gxuk.b = TimeUnit.SECONDS.toMillis(2L);
    }

    public gxuk(String s, Looper looper0) {
        this.e = false;
        this.d = cune.a(s);
        this.c = new gxuj(this, looper0);
        looper0.getThread();
        looper0.getThread();
    }

    public final void a(gxum gxum0, boolean z) {
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        gxui gxui0 = new gxui(this, gxum0.m, gxum0, countDownLatch0);
        if(!this.c.b(gxui0, 0L, z)) {
            countDownLatch0.countDown();
        }
        countDownLatch0.await();
    }
}

