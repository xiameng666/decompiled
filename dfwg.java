import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dfwg implements Runnable {
    public final dfzz a;
    public final ShareTarget b;

    public dfwg(dfzz dfzz0, ShareTarget shareTarget0) {
        this.a = dfzz0;
        this.b = shareTarget0;
    }

    @Override
    public final void run() {
        dfzz dfzz0 = this.a;
        dfzu dfzu0 = (dfzu)dfzz0.W.remove(Long.valueOf(this.b.a));
        if(dfzu0 == null) {
            return;
        }
        dfzu0.a.b();
        dfzz0.R.removePropertyChangeListener("onEndpointDiscovered", dfzu0.b);
        cutr.f(dfzz0.i, dfzu0.c);
    }
}

