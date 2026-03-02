import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dfxo implements Runnable {
    public final dfzz a;
    public final ShareTarget b;
    public final dcjy c;

    public dfxo(dfzz dfzz0, ShareTarget shareTarget0, dcjy dcjy0) {
        this.a = dfzz0;
        this.b = shareTarget0;
        this.c = dcjy0;
    }

    @Override
    public final void run() {
        dcjr dcjr0 = this.c.h == null ? dcjr.a : this.c.h;
        ShareTarget shareTarget0 = this.b;
        dfzz dfzz0 = this.a;
        if(dcjr0.d) {
            String s = dfzz0.ap(shareTarget0);
            if(s == null) {
                dcvz.a.e().h("Failed to initiate bandwidth upgrade in progresss update. No endpointId found for ShareTarget %s", shareTarget0);
            }
            else {
                dfzz0.l.P(s);
            }
        }
        dcnp dcnp0 = dfzz0.Y(shareTarget0);
        if(dcnp0 != null) {
            if(dfzz0.bz()) {
                dcnn dcnn0 = new dcnn(1005);
                dcnn0.g = shareTarget0.n;
                dcnn0.i = 1;
                dcnn0.e(dcjr0.c);
                dcnp0.e(shareTarget0, dcnn0.a());
            }
            else {
                dcnn dcnn1 = new dcnn(1005);
                dcnn1.g = shareTarget0.n;
                dcnn1.e(dcjr0.c);
                dcnp0.e(shareTarget0, dcnn1.a());
            }
        }
        dfzz0.bg(shareTarget0, dcjr0.c);
    }
}

