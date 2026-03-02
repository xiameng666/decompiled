import java.util.ArrayList;
import java.util.Collections;

class gpvd {
    protected final long a;
    protected final long b;
    protected final long c;
    protected final long d;
    protected final long e;
    protected final boolean f;
    protected long g;
    protected long h;
    protected long i;
    protected final gpvl j;
    protected final gpvl k;
    protected float l;

    public gpvd(long v, long v1, long v2, long v3, long v4, boolean z) {
        this.i = -1L;
        this.j = new gpvl(new gpuz());
        this.k = new gpvl(new gpva());
        this.l = 0.0f;
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = z;
    }

    public long a() {
        return this.j.c;
    }

    public long b() {
        long v1;
        synchronized(this) {
            v1 = this.j.b();
        }
        return v1;
    }

    public Double c(long v) {
        gpvc gpvc0;
        synchronized(this) {
            long v2 = this.b / 2L;
            boolean z = v < this.a() - v2;
            gpvc0 = z ? this.h(v) : null;
            if(gpvc0 == null) {
                Double double0 = this.i(v - v2, v + v2);
                if(double0 == null) {
                    return null;
                }
                gpvc0 = new gpvc(v, ((double)double0));
                if(z) {
                    this.k.e(gpvc0);
                }
            }
        }
        return (double)gpvc0.b;
    }

    public void d(long v) {
        long v1 = v - this.a;
        this.j.f(v1);
        this.k.f(v1);
    }

    public boolean e(long v, float f) {
        long v1;
        if(Long.compare(v, this.a()) >= 0 && !Double.isNaN(f)) {
            if(((double)f) == 0.0) {
                return false;
            }
            if(((double)f) <= 1150.0 && ((double)f) >= 50.0) {
                float f1 = f - this.l;
                if(this.g(v, this.c, this.d)) {
                    return false;
                }
                gpvl gpvl0 = this.j;
                gpvl0.e(new gpvc(v, ((double)f1)));
                this.d(v);
                if(this.f) {
                    if(Long.compare(this.i, 0L) < 0) {
                        v1 = v - this.b / 2L;
                        this.i = v1;
                    }
                    while(true) {
                        long v2 = this.i;
                        long v3 = this.b / 2L;
                        if(v2 + v3 >= v) {
                            break;
                        }
                        this.c(v2);
                        long v4 = this.i + this.e;
                        this.i = v4;
                        gpvl0.f(v4 - v3);
                        v1 = Math.max(this.i, ((gpvc)gpvl0.c(0)).a - v3);
                        this.i = v1;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.j.g();
    }

    final boolean g(long v, long v1, long v2) {
        synchronized(this) {
            if(v - this.g > v1) {
                this.h = v2 + v;
            }
            this.g = v;
        }
        return Long.compare(v, this.h) < 0;
    }

    private final gpvc h(long v) {
        gpvc gpvc0;
        synchronized(this) {
            gpvc0 = (gpvc)this.k.d(v - this.e / 2L, v + this.e / 2L);
        }
        return gpvc0;
    }

    private final Double i(long v, long v1) {
        ArrayList arrayList1;
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList();
            for(long v3 = v / 1000000000L; v3 <= v1 / 1000000000L; ++v3) {
                gpvl gpvl0 = this.j;
                for(Object object0: gpvl0.a.g(Long.valueOf(v3))) {
                    if(((long)(((Long)gpvl0.b.apply(object0)))) >= v && ((long)(((Long)gpvl0.b.apply(object0)))) <= v1) {
                        arrayList0.add(object0);
                    }
                }
            }
            arrayList1 = ggia.b(gggq.j(arrayList0, new gpvb()));
            if(arrayList1.isEmpty()) {
                return null;
            }
            Collections.sort(arrayList1);
        }
        return (Double)arrayList1.get(arrayList1.size() / 2);
    }
}

