import java.util.ArrayDeque;
import java.util.Queue;

public final class bwrt {
    public final String a;
    public final bwzn b;
    public final Queue c;
    public bwrs d;
    public int e;
    public final boolean f;
    public final int g;

    public bwrt(bwzn bwzn0, int v, String s, boolean z) {
        this.c = new ArrayDeque();
        this.d = null;
        this.e = 0;
        this.a = s;
        this.b = bwzn0;
        this.f = z;
        this.g = v;
    }

    public final void a(bwrs bwrs0) {
        boolean z = true;
        synchronized(this) {
            batl.l(this.d == bwrs0);
            int v1 = bwrs0.c;
            if(this.e < v1) {
                z = false;
            }
            batl.l(z);
            this.e -= v1;
        }
    }

    public final void b(bwrs bwrs0, long v) {
        synchronized(this) {
            batl.l(this.d == bwrs0);
            bwzp bwzp0 = bwrs0.b(4);
            this.b.f(bwzp0, v);
        }
    }
}

