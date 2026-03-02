import android.content.Context;
import android.os.Looper;

public final class cjgf extends lqd implements cjep {
    private static cjgf a;
    private final cjer_LocationSettings h;

    private cjgf(Context context0) {
        this.h = cjer_LocationSettings.b(context0);
    }

    @Override  // cjep
    public final void a(boolean z) {
        this.l(Boolean.valueOf(z));
    }

    @Override  // cjep
    public final void b(boolean z) {
        this.l(Boolean.valueOf(z));
    }

    @Override  // lqd
    protected final void c() {
        bbre bbre0 = new bbre(Looper.getMainLooper());
        this.h.g(this, bbre0);
    }

    @Override  // lqd
    protected final void d() {
        this.h.k(this);
    }

    public static cjgf o(Context context0) {
        if(cjgf.a == null) {
            cjgf.a = new cjgf(context0.getApplicationContext());
        }
        return cjgf.a;
    }
}

