import java.util.concurrent.atomic.AtomicReference;

public final class aimq implements glzn {
    public final aink a;
    public final AtomicReference b;
    public final long c;
    public final byte[] d;

    public aimq(aink aink0, AtomicReference atomicReference0, long v, byte[] arr_b) {
        this.a = aink0;
        this.b = atomicReference0;
        this.c = v;
        this.d = arr_b;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Void void0 = (Void)object0;
        ((ggtj)aink.a.h()).z("SetBlockstoreData succeeded! number of packages transferred: %d", ((ajam)this.b.get()).a);
        int v = ((ajam)this.b.get()).a;
        return glzd.g(gmbt.h(this.a.h(2, this.c, this.d.length, v)), new aimz(this.d), gmap.a);
    }
}

