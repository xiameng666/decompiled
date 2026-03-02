import com.google.android.libraries.messaging.lighter.model.AccountContext;
import j..util.Objects;

final class flzy implements gmbg {
    final AccountContext a;
    final fmga b;
    final flzz c;

    public flzy(flzz flzz0, AccountContext accountContext0, fmga fmga0) {
        this.a = accountContext0;
        this.b = fmga0;
        Objects.requireNonNull(flzz0);
        this.c = flzz0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
    }

    @Override  // gmbg
    public final void b(Object object0) {
        fmfo fmfo0 = new fmfo();
        fmfo0.c("link_preview");
        fmfo0.b(flzv.d(((fmaa)object0).a));
        fmfm fmfm0 = new fmfm(this.b);
        fmfm0.n(((fmaa)object0).a.b);
        fmfm0.f(((fmaa)object0).a.b);
        fmfm0.q(fmfo0.a());
        gged_interceptors gged0 = gged_interceptors.l(fmfm0.a());
        this.c.b.b(this.a).aa(gged0);
    }
}

