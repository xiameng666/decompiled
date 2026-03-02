import android.content.Context;
import android.os.Looper;

public final class cjge extends lqd implements cjeo {
    public static cjge a;
    private final cjer_LocationSettings h;

    public cjge(Context context0) {
        this.h = cjer_LocationSettings.b(context0.getApplicationContext());
    }

    @Override  // lqd
    protected final void c() {
        bbre bbre0 = new bbre(Looper.getMainLooper());
        this.h.f(this, bbre0);
    }

    @Override  // lqd
    protected final void d() {
        this.h.j(this);
    }

    @Override  // cjeo
    public final void h(int v, int v1) {
        this.l(Integer.valueOf(v1));
    }

    @Override  // cjeo
    public final void i(int v) {
        this.l(Integer.valueOf(v));
    }
}

