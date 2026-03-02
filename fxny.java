import android.content.Context;

public final class fxny extends fxov {
    private final Context a;
    private final cjeo b;

    public fxny(fxnw fxnw0, Context context0) {
        super(fxnw0);
        this.a = context0;
        this.b = new fxnx(this);
    }

    @Override  // fxov
    public final fxou b() {
        return cjer_LocationSettings.p(this.a) ? fxou.b : new fxou(2, 5);
    }

    @Override  // fxov
    public final void f() {
        synchronized(this) {
            cjer_LocationSettings.b(this.a).f(this.b, gmap.a);
        }
    }

    @Override  // fxov
    public final void g() {
        synchronized(this) {
            cjer_LocationSettings.b(this.a).j(this.b);
        }
    }
}

