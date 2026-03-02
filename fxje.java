import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import j..util.Objects;

abstract class fxje {
    protected final int a;
    public final long b;
    public final long c;
    final fxjk d;

    public fxje(fxjk fxjk0, int v, long v1, long v2) {
        Objects.requireNonNull(fxjk0);
        this.d = fxjk0;
        super();
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    public abstract void a(EAlertUxArgs arg1);

    public abstract boolean b(gxeo arg1);
}

