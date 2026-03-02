import com.google.android.libraries.messaging.lighter.model.AccountContext;
import j..util.Objects;

public final class fmjc implements gmbg {
    final AccountContext a;
    final fmga b;
    final fmjd c;

    public fmjc(fmjd fmjd0, AccountContext accountContext0, fmga fmga0) {
        this.a = accountContext0;
        this.b = fmga0;
        Objects.requireNonNull(fmjd0);
        this.c = fmjd0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        fmai fmai0 = fmaj.a();
        fmai0.g(30);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(this.b.a);
        fmai0.d(this.b.c);
        fmaj fmaj0 = fmai0.a();
        this.c.c.b(fmaj0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        fmiy fmiy0 = (fmiy)object0;
        fmai fmai0 = fmaj.a();
        fmai0.g(29);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(this.b.a);
        fmai0.d(this.b.c);
        fmaj fmaj0 = fmai0.a();
        this.c.c.b(fmaj0);
    }
}

