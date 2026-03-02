import j..util.Objects;
import java.util.Calendar;
import java.util.Map;

final class fvqq implements fvlt {
    final fvqr a;

    public fvqq(fvqr fvqr0) {
        Objects.requireNonNull(fvqr0);
        this.a = fvqr0;
        super();
    }

    @Override  // fvlt
    public final void b() {
    }

    @Override  // fvlt
    public final void c() {
    }

    @Override  // fvlt
    public final void d(String s) {
        fvqr.E(this.a);
    }

    @Override  // fvlt
    public final void e(int v, String s) {
    }

    @Override  // fvlt
    public final void f(int v, String s, String s1) {
    }

    @Override  // fvlt
    public final void g(gwvi gwvi0) {
        fvqr fvqr0 = this.a;
        if(fvqr0.u()) {
            if(fvqr0.c.b() - fvqr0.m + 1000L >= 10000L && gwvi0 != null && gwvi0.f.size() > 0) {
                Calendar calendar0 = Calendar.getInstance();
                fvqr0.n.c.m().execute(new fvqs(fvqr0.n, calendar0, gwvi0));
            }
            fvqr.E(fvqr0);
        }
    }

    @Override  // fvlt
    public final void h(int v, gwvi gwvi0) {
    }

    @Override  // fvlt
    public final void i() {
    }

    @Override  // fvlt
    public final void j(fvob fvob0) {
    }

    @Override  // fvlt
    public final void k(Map map0) {
    }
}

