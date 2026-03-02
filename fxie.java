import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import j..util.Objects;

final class fxie extends fxhy {
    final fxif e;

    public fxie(fxif fxif0, long v) {
        Objects.requireNonNull(fxif0);
        this.e = fxif0;
        super(fxif0, 5, v, huqb.n());
    }

    @Override  // fxhy
    public final void a(EAlertUxArgs eAlertUxArgs0) {
        this.e.a.f(eAlertUxArgs0);
        fxif.e(eAlertUxArgs0);
    }

    @Override  // fxhy
    public final boolean c(fxhv fxhv0, gxes gxes0) {
        return fxif.d(gxes0) && (fxhv0.c.c && !fxhv0.c.b);
    }
}

