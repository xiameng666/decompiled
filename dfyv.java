import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dfyv implements Runnable {
    public final dfyw a;
    public final ShareTarget b;

    public dfyv(dfyw dfyw0, ShareTarget shareTarget0) {
        this.a = dfyw0;
        this.b = shareTarget0;
    }

    @Override
    public final void run() {
        dfzz dfzz0 = this.a.a;
        ShareTarget shareTarget0 = this.b;
        String s = dfzz0.ap(shareTarget0);
        if(s != null) {
            dfzz0.aL(s);
            dcvz.a.b().h("Reported expired target %s", shareTarget0.b);
            return;
        }
        dcvz.a.b().h("Ignoring expired endpoint %s because we don\'t have an associated OutgoingShareTargetInfo", shareTarget0.b);
    }
}

