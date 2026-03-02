import com.google.android.libraries.messaging.lighter.model.AccountContext;
import j..util.Objects;

final class flea implements gmbg {
    final AccountContext a;
    final long b;
    final fleb c;

    public flea(fleb fleb0, AccountContext accountContext0, long v) {
        this.a = accountContext0;
        this.b = v;
        Objects.requireNonNull(fleb0);
        this.c = fleb0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.c.e(this.a);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        this.c.e(this.a);
        fmai fmai0 = fmaj.a();
        fmai0.n(this.a.c().f());
        fmai0.g(10105);
        flba.a();
        fmai0.b(new fman(gfqx.a, gfsx.m(Integer.valueOf(((flth)object0).b)), gfsx.m(Long.valueOf(System.currentTimeMillis() - this.b))));
        fmaj fmaj0 = fmai0.a();
        this.c.c.b(fmaj0);
    }
}

