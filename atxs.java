import java.util.concurrent.atomic.AtomicInteger;

public final class atxs {
    public final long a;
    public final atyb b;
    public final int[] c;
    private static long d;
    private final int e;
    private final AtomicInteger f;
    private int g;
    private boolean h;
    private boolean i;

    static {
        atxs.d = aurf.b();
    }

    public atxs(int v, atyb atyb0, boolean z, Integer integer0) {
        this.f = new AtomicInteger();
        this.e = v;
        this.b = atyb0;
        this.h = z;
        synchronized(atxs.class) {
            this.a = atxs.d;
            ++atxs.d;
        }
        if(integer0 != null) {
            int[] arr_v = new int[1];
            this.c = arr_v;
            arr_v[0] = (int)integer0;
            return;
        }
        this.c = new int[0];
    }

    public final int a() {
        int v1;
        synchronized(this) {
            v1 = this.f.incrementAndGet();
        }
        return v1;
    }

    public final int b() {
        synchronized(this) {
        }
        return this.g;
    }

    public final void c() {
        synchronized(this) {
            this.h = true;
            this.i = true;
        }
    }

    public final void d(int v) {
        synchronized(this) {
            this.g = v;
        }
    }

    public final boolean e() {
        synchronized(this) {
        }
        return this.i;
    }

    public final boolean f() {
        synchronized(this) {
        }
        return this.h;
    }

    public final boolean g() {
        return avjg.a(this.e);
    }
}

