import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dfyx implements Runnable {
    public final dfyy a;
    public final ShareTarget b;
    public final String c;
    public final Runnable d;
    public final dfyq e;

    public dfyx(dfyy dfyy0, ShareTarget shareTarget0, String s, Runnable runnable0, dfyq dfyq0) {
        this.a = dfyy0;
        this.b = shareTarget0;
        this.c = s;
        this.d = runnable0;
        this.e = dfyq0;
    }

    @Override
    public final void run() {
        dfzz dfzz0 = this.a.c;
        ShareTarget shareTarget0 = this.b;
        if(dfzz0.bE(shareTarget0)) {
            String s = this.c;
            byte[] arr_b = (byte[])dfzz0.l.i().get(s);
            if(arr_b != null) {
                dgag dgag0 = dgag.c(arr_b);
                if(dgag0 != null) {
                    ShareTarget shareTarget1 = dfzz.bJ(dfzz0, s, dgag0);
                    if(shareTarget1 != null && shareTarget1.a == shareTarget0.a) {
                        dcvz.a.b().i("Newly discovered EndpointID %s matches ShareTarget %s.", s, shareTarget0.b);
                        this.d.run();
                        this.e.a(s);
                    }
                }
            }
        }
    }
}

