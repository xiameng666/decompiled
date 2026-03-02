import j..util.Optional;
import java.util.ArrayDeque;

public final class ehsr {
    public final ehtg a;
    public final ehss b;
    public final ehsx c;
    public final ehsk d;
    public final ehsl e;
    public final ehsl f;
    public final ehtf g;
    public final long[] h;
    public final long[] i;
    public int j;
    public final long k;
    public Optional l;
    public ehsq m;
    public boolean n;
    public long o;
    public long p;

    public ehsr(ehss ehss0, ehsx ehsx0, long v, ehtg ehtg0) {
        this.j = 0;
        this.l = Optional.empty();
        this.o = -1L;
        this.p = -1L;
        this.a = ehtg0;
        this.b = ehss0;
        this.h = new long[ehtg0.b];
        this.i = new long[ehtg0.b];
        this.d = new ehsk(ehtg0.b);
        this.e = new ehsl(((int)(ehtg0.a.toSeconds() * 300L)), 300);
        long v1 = ehtg0.a.toSeconds();
        this.f = new ehsl(((int)(((long)ehtg0.b) * v1 * 100L)), 100);
        this.c = ehsx0;
        this.k = v;
        this.g = ehss0.a;
    }

    public static double a(float f, float f1, float f2) {
        return Math.sqrt(f * f + f1 * f1 + f2 * f2);
    }

    public final void b() {
        this.o = -1L;
        this.l = Optional.empty();
    }

    public final void c() {
        this.n = false;
        this.c.f.clear();
        this.c.g.clear();
        this.c.d = 0x7FFFFFFFFFFFFFFFL;
        this.c.e = 0x7FFFFFFFFFFFFFFFL;
    }

    public final boolean d(long v) {
        for(int v1 = 0; v1 < this.a.b; ++v1) {
            if(this.f(this.h[v1], v)) {
                return true;
            }
            if(this.f(this.i[v1], v)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(long v) {
        ArrayDeque arrayDeque1;
        boolean z = false;
        ArrayDeque arrayDeque0 = this.c.f;
        for(Object object0: arrayDeque0) {
            gfsz gfsz0 = (gfsz)object0;
            if(((long)(((Long)gfsz0.a))) >= v && ((Boolean)gfsz0.b).booleanValue()) {
                z = true;
                break;
            }
        }
        ehsq ehsq0 = this.m;
        while(true) {
            arrayDeque1 = ((ehrp)ehsq0).r;
            if(arrayDeque1.size() <= 50) {
                break;
            }
            arrayDeque1.remove();
        }
        arrayDeque1.add(v + " " + arrayDeque0.toString());
        return z;
    }

    final boolean f(long v, long v1) {
        return v > 0L && v < v1 && v1 - v < this.k;
    }

    public final boolean g() {
        return this.o != -1L;
    }
}

