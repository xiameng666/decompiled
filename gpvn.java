import java.util.Collections;
import java.util.NoSuchElementException;

final class gpvn {
    public final gpvj a;
    public gpvo b;
    public long c;

    public gpvn() {
        this.a = new gpvj();
        this.c = -1L;
    }

    final void a(float f, long v) {
        this.b(v / 1000000L);
        if(v > this.c) {
            this.c = v;
            this.a.c();
            float[] arr_f = this.a.a;
            int v1 = this.a.c;
            this.a.c = v1 + 1;
            arr_f[v1] = f;
            this.a.c = (v1 + 1) % arr_f.length;
            gpvo gpvo0 = this.b;
            Long long0 = (long)(v / 1000000L);
            gpvo0.c();
            long0.getClass();
            gpvo0.d(v / 1000000L - gpvo0.a);
            long0.getClass();
            int[] arr_v = gpvo0.b;
            int v2 = gpvo0.d;
            gpvo0.d = v2 + 1;
            int v3 = (int)(v / 1000000L - gpvo0.a);
            arr_v[v2] = v3;
            gpvo0.d = (v2 + 1) % arr_v.length;
            gpvo0.d(((long)v3));
            return;
        }
        Long long1 = (long)(v / 1000000L);
        int v4 = Collections.binarySearch(this.b, long1);
        if(v4 < 0) {
            v4 = -(v4 + 1);
        }
        this.a.b(v4, Float.valueOf(f));
        this.b.b(v4, long1);
    }

    public final void b(long v) {
        if(this.b == null) {
            this.b = new gpvo(v);
        }
    }

    final void c(long v) {
        long v1 = v / 1000000000L * 1000000000L / 1000000L;
        this.b(v1);
        while(!this.b.isEmpty() && ((long)this.b.a(0)) < v1) {
            gpvj gpvj0 = this.a;
            if(gpvj0.isEmpty()) {
                throw new NoSuchElementException();
            }
            float[] arr_f = gpvj0.a;
            int v2 = gpvj0.b;
            float f = arr_f[v2];
            gpvj0.b = v2 + 1;
            gpvj0.b = (v2 + 1) % arr_f.length;
            gpvo gpvo0 = this.b;
            if(gpvo0.isEmpty()) {
                throw new NoSuchElementException();
            }
            int[] arr_v = gpvo0.b;
            int v3 = gpvo0.c;
            int v4 = arr_v[v3];
            gpvo0.c = v3 + 1;
            gpvo0.c = (v3 + 1) % arr_v.length;
            continue;
        }
    }

    final boolean d() {
        return this.a.isEmpty();
    }

    final Long e() {
        return (long)(((long)this.b.a(0)) * 1000000L);
    }
}

