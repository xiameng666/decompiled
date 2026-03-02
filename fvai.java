import android.os.SystemClock;

public final class fvai implements gfsi {
    public final fvao a;
    public final long b;
    public final String c;

    public fvai(fvao fvao0, long v, String s) {
        this.a = fvao0;
        this.b = v;
        this.c = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        long v = this.b;
        if(Long.compare(v, -1L) != 0) {
            long v1 = SystemClock.elapsedRealtime() - v;
            this.a.b.b(iapk.b.t.name(), "voilatile", this.c);
            this.a.b.f(((double)v1), "voilatile", this.c);
        }
        return (gxsx)object0;
    }
}

