import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dfwn implements Runnable {
    public final dfzz a;
    public final ShareTarget b;
    public final dfum c;
    public final dcnp d;

    public dfwn(dfzz dfzz0, ShareTarget shareTarget0, dfum dfum0, dcnp dcnp0) {
        this.a = dfzz0;
        this.b = shareTarget0;
        this.c = dfum0;
        this.d = dcnp0;
    }

    @Override
    public final void run() {
        long v = hvqs.am();
        dfzh dfzh0 = this.a.ac(this.b, this.c, dcjx.c, v);
        dfxa dfxa0 = new dfxa(this.a, this.c, this.d, this.b, dfzh0);
        this.a.aU(dfxa0);
    }
}

