import android.content.Context;

@ibnh
public final class bpaz {
    public static final bboh a;
    public final Object b;
    public volatile long c;
    public gfsx d;
    public volatile boolean e;
    public final cmnh f;
    public final Context g;

    static {
        bpaz.a = bboh.b("LocationUpdateManager", bbcu.eD);
    }

    public bpaz(cmnh cmnh0, Context context0) {
        this.b = new Object();
        this.f = cmnh0;
        this.g = context0;
        this.c = 0L;
        this.d = gfqx.a;
        this.e = false;
    }

    public final void a() {
        synchronized(this.b) {
            this.e = false;
        }
    }

    final boolean b(long v) {
        return this.e && v - this.c < hsxv.o();
    }

    public final boolean c() {
        synchronized(this.b) {
        }
        return this.d.i();
    }
}

