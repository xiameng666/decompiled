import dagger.Lazy;
import j..util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

@ibnh
final class foyn extends foyi implements fotm {
    public final gmch a;
    public final Lazy b;
    public final fotj c;
    public final foyu d;
    private final foli e;
    private final boolean f;
    private final foyg g;

    public foyn(fotk fotk0, foyg foyg0, gmch gmch0, Lazy lazy0, foyu foyu0, foli foli0, ibnf ibnf0, Executor executor0, gfsx gfsx0) {
        new AtomicReference(foxz.a);
        new ConcurrentHashMap();
        this.g = foyg0;
        this.e = foli0;
        this.c = fotk0.a(executor0, lazy0, ibnf0);
        this.a = gmch0;
        this.b = lazy0;
        this.d = foyu0;
        this.f = ((Boolean)gfsx0.f(Boolean.valueOf(false))).booleanValue();
    }

    @Override  // foyi
    public final void a() {
        foyk foyk0 = (int v, String s1) -> {
            if(this.e.a) {
                gmbu.g();
                return;
            }
            gmbu.n(new foyj(this, v, null, s1), this.a);
        };
        foyg foyg0 = this.g;
        foyg0.d = foyk0;
        if(foyg0.c.getAndSet(true)) {
            return;
        }
        gmbu.n(new foyb(foyg0), foyg0.b);
    }

    @Override  // foyi
    public final void b(fokg fokg0) {
        this.d(fokg0.a, 1, null);
    }

    public static final boolean c(int v) {
        return v != 1;
    }

    // Detected as a lambda impl.
    public final void d(String s, int v, String s1) {
        if(this.e.a) {
            gmbu.g();
            return;
        }
        gmbu.n(new foyj(this, v, s, s1), this.a);
    }

    @Override  // fotm
    public final void k() {
        if(this.f) {
            this.a();
        }
    }
}

