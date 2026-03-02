import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import j..util.Objects;
import java.util.function.Supplier;

final class fxia extends fxhy {
    final fxif e;

    public fxia(fxif fxif0, long v) {
        Objects.requireNonNull(fxif0);
        this.e = fxif0;
        super(fxif0, 3, v, huqb.i());
    }

    @Override  // fxhy
    public final void a(EAlertUxArgs eAlertUxArgs0) {
        this.e.a.c(eAlertUxArgs0);
        fxif.e(eAlertUxArgs0);
    }

    @Override  // fxhy
    protected final boolean b(Supplier supplier0) {
        fxkw fxkw0 = (fxkw)supplier0.get();
        return fxkw0 == null ? false : fxkw0.b();
    }

    @Override  // fxhy
    public final boolean c(fxhv fxhv0, gxes gxes0) {
        return fxif.d(gxes0) && (fxhv0.c.d && fxhv0.c.b);
    }
}

