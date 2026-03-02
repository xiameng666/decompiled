import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import j..util.Objects;

final class fxiw extends fxis {
    final fxix e;

    public fxiw(fxix fxix0, long v) {
        Objects.requireNonNull(fxix0);
        this.e = fxix0;
        super(fxix0, 5, v, huqb.n());
    }

    @Override  // fxis
    public final void a(EAlertUxArgs eAlertUxArgs0) {
        this.e.a.f(eAlertUxArgs0);
        fxix.g(eAlertUxArgs0);
    }

    @Override  // fxis
    public final boolean c(fxhv fxhv0) {
        return fxhv0.c.c && !fxhv0.c.b;
    }
}

