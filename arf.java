import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class arf {
    public static final long a;
    public final int b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public final aow e;
    public final ayg f;
    public final boolean g;
    public long h;
    final List i;
    public final arg j;
    private static final long k;

    static {
        arf.k = TimeUnit.SECONDS.toNanos(1L);
        arf.a = TimeUnit.SECONDS.toNanos(5L);
    }

    public arf(int v, Executor executor0, ScheduledExecutorService scheduledExecutorService0, aow aow0, boolean z, ayg ayg0) {
        this.h = arf.k;
        this.i = new ArrayList();
        this.j = new ard(this);
        this.b = v;
        this.c = executor0;
        this.d = scheduledExecutorService0;
        this.e = aow0;
        this.g = z;
        this.f = ayg0;
    }

    public final gmcd a(int v) {
        gmcd gmcd0 = bpt.b(null);
        if(!this.i.isEmpty()) {
            return this.j.c() ? bpt.g(bpt.g(bpf.a(asf.b(this.e, null)), new aqz(this, v), this.c), new ara(this), this.c) : bpt.g(bpt.g(bpf.a(bpt.b(null)), new aqz(this, v), this.c), new ara(this), this.c);
        }
        return gmcd0;
    }

    final void b(arg arg0) {
        this.i.add(arg0);
    }

    public final void c() {
        this.j.b();
    }
}

