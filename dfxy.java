import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dfxy implements Runnable {
    public final dfzz a;
    public final ShareTarget b;
    public final Runnable c;
    public final dfyq d;

    public dfxy(dfzz dfzz0, ShareTarget shareTarget0, Runnable runnable0, dfyq dfyq0) {
        this.a = dfzz0;
        this.b = shareTarget0;
        this.c = runnable0;
        this.d = dfyq0;
    }

    @Override
    public final void run() {
        ShareTarget shareTarget0 = this.b;
        if(!this.a.bE(shareTarget0)) {
            return;
        }
        dcvz.a.b().h("Giving up on looking for ShareTarget %s.", shareTarget0.b);
        this.c.run();
        dfzz dfzz0 = this.d.b;
        ShareTarget shareTarget1 = this.d.a;
        dcnp dcnp0 = dfzz0.Y(shareTarget1);
        if(dcnp0 == null) {
            dfzz0.bh(shareTarget1, new dcnn(1007).a());
            dfzz0.aH(shareTarget1);
            return;
        }
        dcnp0.e(shareTarget1, new dcnn(1007).a());
    }
}

