import android.os.SystemClock;

public final class fwxn implements gfsi {
    public final fwxq a;
    public final long b;
    public final String c;

    public fwxn(fwxq fwxq0, long v, String s) {
        this.a = fwxq0;
        this.b = v;
        this.c = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        long v = SystemClock.elapsedRealtime();
        this.a.a.b(iapk.b.t.name(), "kollektomat", this.c);
        this.a.a.f(((double)(v - this.b)), "kollektomat", this.c);
        return (gxmq)object0;
    }
}

