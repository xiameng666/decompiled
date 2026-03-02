import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dckq implements evqc {
    public final dcks a;
    public final ShareTarget b;
    public final int c;

    public dckq(dcks dcks0, ShareTarget shareTarget0, int v) {
        this.a = dcks0;
        this.b = shareTarget0;
        this.c = v;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        dcvz.a.e().f(exception0).p("Failed to get actions.", new Object[0]);
        this.a.a.l(this.b, ggna.a, this.c);
    }
}

