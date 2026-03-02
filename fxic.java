import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import j..util.Objects;

final class fxic extends fxhy {
    final fxif e;

    public fxic(fxif fxif0, long v) {
        Objects.requireNonNull(fxif0);
        this.e = fxif0;
        super(fxif0, 6, v, huqb.g());
    }

    @Override  // fxhy
    public final void a(EAlertUxArgs eAlertUxArgs0) {
        this.e.a.d(eAlertUxArgs0);
    }

    @Override  // fxhy
    public final boolean c(fxhv fxhv0, gxes gxes0) {
        return gxer.b(gxes0.k) == 5 ? gxep.a((gxes0.n == null ? gxeq.a : gxes0.n).b) == 4 : false;
    }
}

