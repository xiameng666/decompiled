import java.util.Iterator;
import java.util.Map.Entry;

public final class flad {
    public final Object a;
    public final fgvt b;
    public final flak c;
    private final gfsi d;
    private boolean e;
    private final long f;
    private long g;
    private final flaq h;

    public flad(gfsi gfsi0, flaq flaq0, fgvt fgvt0, flak flak0) {
        this.a = new Object();
        this.e = false;
        this.d = gfsi0;
        this.h = flaq0;
        this.b = fgvt0;
        this.c = flak0;
        this.f = fgvt0.d().toEpochMilli();
    }

    public final flag a() {
        flaf flaf0;
        long v2;
        synchronized(this.a) {
            flaf0 = flag.a();
            this.f();
            flak flak0 = this.c;
            long v1 = this.g;
            gfsi gfsi0 = this.d;
            ggek ggek0 = new ggek();
            Iterator iterator0 = flal.g(flak0).entrySet().iterator();
            while(true) {
                v2 = 0L;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object1 = iterator0.next();
                Object object2 = gfsi0.apply(((Integer)((Map.Entry)object1).getKey()));
                Long long0 = (Long)((Map.Entry)object1).getValue();
                if(long0 != null) {
                    v2 = v1 - ((long)long0);
                }
                ggek0.i(object2, Long.valueOf(v2));
            }
            flaf0.b(ggkm.c(ggek0.b()));
            this.f();
            flaf0.e(this.g - this.f);
            this.f();
            flaf0.d(((flak0.b & 1) == 0 ? 0L : this.g - flak0.d));
            this.f();
            if((flak0.b & 2) != 0) {
                v2 = this.g - flak0.e;
            }
            flaf0.c(v2);
        }
        return flaf0.a();
    }

    public final ggfp b() {
        return ggog.b(gggq.j(flal.f(this.c), this.d));
    }

    public final gmcd c() {
        flaa flaa0;
        synchronized(this.a) {
            this.e();
            flaa0 = new flaa(this.g);
        }
        return this.h.a(flaa0);
    }

    public final gmcd d() {
        flab flab0;
        synchronized(this.a) {
            this.e();
            flab0 = new flab(this, this.g);
        }
        return this.h.a(flab0);
    }

    public final void e() {
        gftb.r(((boolean)(this.e ^ 1)), "Sync already completed!");
        this.g = this.b.d().toEpochMilli();
        this.e = true;
    }

    private final void f() {
        gftb.r(this.e, "Sync didn\'t complete yet!");
    }
}

