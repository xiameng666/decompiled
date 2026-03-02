import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import j..util.Objects;
import java.util.function.Supplier;

final class fxhz extends fxhy {
    final fxif e;

    public fxhz(fxif fxif0, long v) {
        Objects.requireNonNull(fxif0);
        this.e = fxif0;
        super(fxif0, 4, v, huqb.h());
    }

    @Override  // fxhy
    public final void a(EAlertUxArgs eAlertUxArgs0) {
        this.e.a.b(eAlertUxArgs0);
        fxif.e(eAlertUxArgs0);
    }

    @Override  // fxhy
    protected final boolean b(Supplier supplier0) {
        fxkw fxkw0 = (fxkw)supplier0.get();
        return fxkw0 == null ? false : fxkw0.a();
    }

    @Override  // fxhy
    public final boolean c(fxhv fxhv0, gxes gxes0) {
        return fxif.d(gxes0) && (fxhv0.c.d && !fxhv0.c.c && !fxhv0.c.b);
    }
}

