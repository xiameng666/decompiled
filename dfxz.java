import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dfxz implements Runnable {
    public final dfzz a;
    public final ShareTarget b;
    public final cumn c;
    public final gmcu d;

    public dfxz(dfzz dfzz0, ShareTarget shareTarget0, cumn cumn0, gmcu gmcu0) {
        this.a = dfzz0;
        this.b = shareTarget0;
        this.c = cumn0;
        this.d = gmcu0;
    }

    @Override
    public final void run() {
        dcvz.a.b().h("Cancelled connection with ShareTarget %s is now closed.", this.b.b);
        this.c.b();
        this.a.bm(this.b);
        if(hvqz.ak()) {
            this.d.q(null);
        }
    }
}

