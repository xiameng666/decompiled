import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import j..util.Objects;
import java.util.function.Supplier;

final class fxit extends fxis {
    final fxix e;

    public fxit(fxix fxix0, long v) {
        Objects.requireNonNull(fxix0);
        this.e = fxix0;
        super(fxix0, 4, v, huqb.h());
    }

    @Override  // fxis
    public final void a(EAlertUxArgs eAlertUxArgs0) {
        this.e.a.b(eAlertUxArgs0);
        fxix.g(eAlertUxArgs0);
    }

    @Override  // fxis
    protected final boolean b(Supplier supplier0) {
        fxkw fxkw0 = (fxkw)supplier0.get();
        return fxkw0 == null ? false : fxkw0.a();
    }

    @Override  // fxis
    public final boolean c(fxhv fxhv0) {
        return fxhv0.c.d && !fxhv0.c.c && !fxhv0.c.b;
    }
}

