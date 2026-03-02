import java.util.Collections;

final class gpvl {
    public final gghp a;
    public final gfsi b;
    public long c;
    private final gpvp d;

    public gpvl(gfsi gfsi0) {
        this.d = new gpvp();
        this.a = new gfza();
        this.c = 0L;
        this.b = gfsi0;
    }

    final int a() {
        return this.d.size();
    }

    final long b() {
        gpvp gpvp0 = this.d;
        if(gpvp0.isEmpty()) {
            return -1L;
        }
        Object object0 = gpvp0.get(0);
        return (long)(((Long)this.b.apply(object0)));
    }

    final Object c(int v) {
        return this.d.get(v);
    }

    final Object d(long v, long v1) {
        for(long v2 = v / 1000000000L; v2 <= v1 / 1000000000L; ++v2) {
            for(Object object0: this.a.g(Long.valueOf(v2))) {
                if(((long)(((Long)this.b.apply(object0)))) >= v && ((long)(((Long)this.b.apply(object0)))) <= v1) {
                    return object0;
                }
            }
        }
        return null;
    }

    final void e(Object object0) {
        long v = (long)(((Long)this.b.apply(object0)));
        if(v > this.c) {
            this.c = v;
            this.d.addLast(object0);
        }
        else {
            gpvp gpvp0 = this.d;
            int v1 = Collections.binarySearch(gpvp0, object0, new gpvk(this));
            if(v1 < 0) {
                v1 = -(v1 + 1);
            }
            gpvp0.add(v1, object0);
        }
        this.a.v(Long.valueOf(v / 1000000000L), object0);
    }

    final void f(long v) {
        while(true) {
            gpvp gpvp0 = this.d;
            if(gpvp0.isEmpty()) {
                break;
            }
            Object object0 = gpvp0.get(0);
            long v1 = ((long)(((Long)this.b.apply(object0)))) / 1000000000L;
            if(v1 >= v / 1000000000L) {
                break;
            }
            gpvp0.removeFirst();
            this.a.h(Long.valueOf(v1));
        }
    }

    final boolean g() {
        return this.d.isEmpty();
    }
}

