import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dfxx implements Runnable {
    public final dfzz a;
    public final ShareTarget b;
    public final String c;
    public final dcnp d;
    public final byte[] e;
    public final byte[] f;
    public final int g;
    public final int h;

    public dfxx(dfzz dfzz0, ShareTarget shareTarget0, String s, dcnp dcnp0, byte[] arr_b, byte[] arr_b1, int v, int v1) {
        this.a = dfzz0;
        this.b = shareTarget0;
        this.c = s;
        this.d = dcnp0;
        this.e = arr_b;
        this.f = arr_b1;
        this.g = v;
        this.h = v1;
    }

    @Override
    public final void run() {
        dfzz dfzz0 = this.a;
        if(!dfzz0.o) {
            if(dfzz0.l.e() == 0) {
                dfzz0.o = true;
                dcvz.a.b().p("Successfully transited to non interruptive discovery", new Object[0]);
            }
            else {
                dcvz.a.b().p("Failed to transit to non interruptive discovery", new Object[0]);
            }
        }
        ShareTarget shareTarget0 = this.b;
        if(dfzz0.bx(shareTarget0) && hvqz.ak()) {
            dcvz.a.b().p("Share target was cancelled. Stop connecting.", new Object[0]);
            return;
        }
        dfzz0.l.u(this.c, new dfza(dfzz0, this.d, shareTarget0));
        dfzz0.ae(shareTarget0).x = System.currentTimeMillis();
        dfzz0.aU(new dfwe(dfzz0, (dfzz0.ae(shareTarget0).n ? dfzz0.l.H(this.e, this.c, this.f, this.g, this.h, true) : dfzz0.l.H(this.e, this.c, this.f, this.g, this.h, false)), this.d, shareTarget0, this.c));
    }
}

