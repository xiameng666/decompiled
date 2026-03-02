import android.content.Context;

public final class auik implements evqc {
    public final auim a;
    public final Context b;
    public final bavt c;
    public final bavq d;
    public final int e;

    public auik(auim auim0, Context context0, bavt bavt0, bavq bavq0, int v) {
        this.a = auim0;
        this.b = context0;
        this.c = bavt0;
        this.d = bavq0;
        this.e = v;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        auim.a.e(exception0, "Usonia installation request failed", new Object[0]);
        this.a.c(this.b, this.c, this.d, this.e + 1);
    }
}

