import com.google.android.libraries.messaging.lighter.model.AccountContext;
import j..util.Objects;

final class fljb implements gmbg {
    final AccountContext a;
    final gged_interceptors b;
    final fljc c;

    public fljb(fljc fljc0, AccountContext accountContext0, gged_interceptors gged0) {
        this.a = accountContext0;
        this.b = gged0;
        Objects.requireNonNull(fljc0);
        this.c = fljc0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        fmai fmai0 = fmaj.a();
        fmai0.g(210);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(this.b.toString());
        fmaj fmaj0 = fmai0.a();
        this.c.e.b(fmaj0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        fmai fmai0 = fmaj.a();
        fmai0.g(209);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(this.b.toString());
        fmaj fmaj0 = fmai0.a();
        this.c.e.b(fmaj0);
    }
}

