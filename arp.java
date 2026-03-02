import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class arp implements Runnable {
    public final ary a;
    public final AtomicReference b;
    public final jqt c;

    public arp(ary ary0, AtomicReference atomicReference0, jqt jqt0) {
        this.a = ary0;
        this.b = atomicReference0;
        this.c = jqt0;
    }

    @Override
    public final void run() {
        bcs.h("Camera2CapturePipeline");
        long v = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3L);
        bcd bcd0 = (bcd)this.b.get();
        this.a.d.a(v, bcd0);
        this.c.b(null);
    }
}

