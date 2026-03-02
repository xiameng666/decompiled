import android.content.Context;
import java.util.concurrent.Executor;

public final class bpav {
    public final Context a;
    public final bopi b;
    private final fqxe c;
    private final Executor d;

    public bpav(Context context0, fqxe fqxe0, bopi bopi0, Executor executor0) {
        this.a = context0;
        this.c = fqxe0;
        this.b = bopi0;
        this.d = executor0;
    }

    public final gmcd a() {
        Context context0 = this.a;
        Boolean boolean0 = Boolean.valueOf(false);
        if(!bpya.a(context0)) {
            return gmbu.i(boolean0);
        }
        return !bpsq.h(context0) ? gmbu.i(boolean0) : gdta.g(this.c.f()).i(new bpat(this), this.d);
    }
}

