import java.util.concurrent.atomic.AtomicReferenceArray;

public final class fopw {
    public final int a;
    public final AtomicReferenceArray b;
    int c;
    public volatile int d;
    public final int e;

    public fopw(int v) {
        this.a = v;
        this.b = new AtomicReferenceArray(v);
        this.e = v <= 0 ? 0 : 0x7FFFFFFF % v + v + 1;
    }

    public final void a(fopi fopi0) {
        int v = this.a;
        if(v <= 0) {
            return;
        }
        int v1 = this.c;
        this.b.set(v1 % v, fopi0);
        int v2 = v1 == 0x7FFFFFFF ? this.e : v1 + 1;
        this.c = v2;
        this.d = v2;
    }
}

