import java.util.ArrayList;
import java.util.Collections;

final class gpve extends gpvd {
    private final gpvn m;
    private final gpvn n;

    public gpve(long v, long v1, long v2, long v3, long v4, boolean z) {
        super(v, v1, v2, v3, v4, z);
        this.m = new gpvn();
        this.n = new gpvn();
    }

    @Override  // gpvd
    public final long a() {
        return this.m.c;
    }

    @Override  // gpvd
    public final long b() {
        long v1;
        synchronized(this) {
            gpvn gpvn0 = this.m;
            if(gpvn0.d()) {
                return -1L;
            }
            v1 = (long)gpvn0.e();
        }
        return v1;
    }

    @Override  // gpvd
    public final Double c(long v) {
        Float float0;
        synchronized(this) {
            long v2 = this.b;
            boolean z = v < this.a() - v2 / 2L;
            if(z) {
                gpvn gpvn0 = this.n;
                long v3 = this.e / 2L + v;
                long v4 = (v - this.e / 2L) / 1000000L;
                gpvn0.b(v4);
                int v5 = Collections.binarySearch(gpvn0.b, Long.valueOf(v4));
                if(v5 < 0) {
                    v5 = -v5 - 1;
                }
                float0 = v5 < gpvn0.b.size() && ((long)gpvn0.b.a(v5)) <= v3 / 1000000L ? gpvn0.a.a(v5) : null;
            }
            else {
                float0 = null;
            }
            if(float0 == null) {
                gpvn gpvn1 = this.m;
                long v6 = (v - v2 / 2L) / 1000000L;
                gpvn1.b(v6);
                int v7 = Collections.binarySearch(gpvn1.b, Long.valueOf(v6));
                if(v7 < 0) {
                    v7 = -v7 - 1;
                }
                ArrayList arrayList0 = new ArrayList();
                if(v7 < gpvn1.b.size()) {
                    while(v7 < gpvn1.b.size() && ((long)gpvn1.b.a(v7)) <= (v + v2 / 2L) / 1000000L) {
                        arrayList0.add(gpvn1.a.a(v7));
                        ++v7;
                    }
                }
                if(arrayList0.isEmpty()) {
                    float0 = null;
                }
                else {
                    Collections.sort(arrayList0);
                    float0 = (Float)arrayList0.get(arrayList0.size() / 2);
                }
                if(float0 == null) {
                    return null;
                }
                if(z) {
                    this.n.a(float0.floatValue(), v);
                }
            }
        }
        return float0.doubleValue();
    }

    @Override  // gpvd
    public final void d(long v) {
        long v1 = v - this.a;
        this.m.c(v1);
        this.n.c(v1);
    }

    @Override  // gpvd
    public final boolean e(long v, float f) {
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
                gpvn gpvn0 = this.m;
                gpvn0.a(f1, v);
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
                        gpvn0.c(v4 - v3);
                        if(gpvn0.d()) {
                            break;
                        }
                        v1 = Math.max(this.i, ((long)gpvn0.e()) - v3);
                        this.i = v1;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override  // gpvd
    public final boolean f() {
        return this.m.d();
    }
}

