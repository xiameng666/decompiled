import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import j..util.Objects;
import java.util.function.Supplier;

abstract class fxhy {
    protected final int a;
    public final long b;
    public final long c;
    final fxif d;

    public fxhy(fxif fxif0, int v, long v1, long v2) {
        Objects.requireNonNull(fxif0);
        this.d = fxif0;
        super();
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    public abstract void a(EAlertUxArgs arg1);

    protected boolean b(Supplier supplier0) {
        return false;
    }

    public abstract boolean c(fxhv arg1, gxes arg2);
}

