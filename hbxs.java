import android.os.SystemClock;

public final class hbxs extends havz {
    static boolean d = true;
    public static final hbtu e;
    public final hbwm f;
    private static final haww g;
    private final hbxm h;
    private final hbqy i;
    private final hbra j;

    static {
        hbxs.e = hbtu.a;
        hbxs.g = new haww();
    }

    public hbxs(hbqy hbqy0, hbxm hbxm0, hbwm hbwm0) {
        haww haww0;
        switch(hbwm0.b()) {
            case 7: 
            case 8: {
                haww0 = new haww();
                break;
            }
            default: {
                haww0 = hbxs.g;
            }
        }
        super(haww0);
        this.i = hbqy0;
        this.h = hbxm0;
        this.j = new hbra(hawd.b().a());
        this.f = hbwm0;
    }

    @Override  // havz
    public final Object a(hbtp hbtp0) {
        return this.e(hbtp0);
    }

    @Override  // hawl
    public final void c() {
        synchronized(this) {
            this.h.b();
        }
    }

    @Override  // hawl
    public final void d() {
        synchronized(this) {
            hbxs.d = true;
            this.h.c();
        }
    }

    public final hbwk e(hbtp hbtp0) {
        hbwk hbwk0;
        synchronized(this) {
            long v1 = SystemClock.elapsedRealtime();
            try {
                hbwk0 = this.h.a(hbtp0);
                this.f(hbkn.a, v1, hbtp0);
                hbxs.d = false;
            }
            catch(havd havd0) {
                this.f((havd0.a == 14 ? hbkn.k : hbkn.aG), v1, hbtp0);
                throw havd0;
            }
        }
        return hbwk0;
    }

    private final void f(hbkn hbkn0, long v, hbtp hbtp0) {
        long v1 = SystemClock.elapsedRealtime() - v;
        hbxq hbxq0 = new hbxq(this, v1, hbkn0, hbtp0);
        this.i.c(hbxq0, hbko.f);
        hayp hayp0 = new hayp();
        hayp0.a = hbkn0;
        hayp0.b = Boolean.valueOf(hbxs.d);
        hbnz hbnz0 = new hbnz();
        hbnz0.a = hbxj.a(this.f.b());
        hayp0.c = new hbob(hbnz0);
        hayq hayq0 = new hayq(hayp0);
        hbxr hbxr0 = new hbxr(this);
        this.i.d(hayq0, v1, hbko.bi, hbxr0);
        long v2 = System.currentTimeMillis();
        int v3 = this.f.a();
        this.j.a(v3, hbkn0.aH, v2 - v1, v2);
    }
}

