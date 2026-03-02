import android.content.Intent;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

public final class dfwe implements Runnable {
    public final dfzz a;
    public final dfum b;
    public final dcnp c;
    public final ShareTarget d;
    public final String e;

    public dfwe(dfzz dfzz0, dfum dfum0, dcnp dcnp0, ShareTarget shareTarget0, String s) {
        this.a = dfzz0;
        this.b = dfum0;
        this.c = dcnp0;
        this.d = shareTarget0;
        this.e = s;
    }

    @Override
    public final void run() {
        boolean z;
        dfzz dfzz0 = this.a;
        ShareTarget shareTarget0 = this.d;
        dfum dfum0 = this.b;
        dcnp dcnp0 = this.c;
        int v = 10;
        if(dfum0 == null) {
            dcnp0.e(shareTarget0, new dcnn(1007).a());
            if(dfzz0.bx(shareTarget0)) {
                dfzz0.bR(shareTarget0, 4);
            }
            else {
                if(!dfzz0.bF()) {
                    v = 3;
                }
                dfzz0.bR(shareTarget0, v);
            }
            dcvz.a.b().h("Failed to connect to %s.", shareTarget0);
            return;
        }
        cunf cunf0 = dcvz.a;
        cunf0.b().i("Connected to %s in %s millis", shareTarget0, Long.valueOf(System.currentTimeMillis() - dfzz0.ae(shareTarget0).x));
        if(dfzz0.X(shareTarget0).e) {
            dfum0.a();
            cunf cunf1 = cunf0.b();
            String s = TransferMetadata.c(dfzz0.X(shareTarget0).a);
            cunf1.i("Closes connection due to %s is the %s final status!", shareTarget0.b, s);
            return;
        }
        String s1 = this.e;
        dfzz0.ba(shareTarget0, dfum0);
        dfum0.b(new dfwp(dfzz0, shareTarget0, dcnp0));
        dfvp dfvp0 = dfzz0.l;
        String s2 = dfvp0.h(s1);
        switch(dfzz0.af(shareTarget0).ordinal()) {
            case 0: {
                cunf0.b().h("Paired key handshake succeeded when sending to %s.", shareTarget0);
                dfzz0.aW(shareTarget0, null);
                z = true;
                break;
            }
            case 1: {
                cunf0.b().h("Paired key handshake failed when sending to %s. Disconnecting.", shareTarget0);
                dcnp0.e(shareTarget0, new dcnn(1007).a());
                dfum0.a();
                if(!dfzz0.bF()) {
                    v = 6;
                }
                dfzz0.bR(shareTarget0, v);
                z = false;
                break;
            }
            case 2: {
                cunf0.b().h("Unable to verify paired key encryption with %s, verify tokens on devices.", shareTarget0);
                if(dfvp0.F(s1)) {
                    cunf0.d().h("Connection to %s is verified, skipping token comparison.", s1);
                    dfzz0.aW(shareTarget0, null);
                    z = true;
                }
                else if(hvqs.bj()) {
                    dfzz0.bi(shareTarget0, s2);
                    dfzz0.aW(shareTarget0, s2);
                    z = true;
                }
                else {
                    dfzz0.bi(shareTarget0, s2);
                    dfzz0.aW(shareTarget0, s2);
                    z = false;
                }
                break;
            }
            default: {
                z = false;
            }
        }
        if(dfum0.d()) {
            return;
        }
        dfzz0.be(shareTarget0, true);
        dfzz0.bf(shareTarget0, false);
        dfzz0.bR(shareTarget0, 2);
        if(z) {
            long v1 = dfzz0.P(shareTarget0);
            int v2 = dfzz0.L(shareTarget0);
            int v3 = dfzz0.K();
            Intent intent0 = dfzz0.P;
            long v4 = dfzz0.w.c();
            long v5 = dfzz0.P(shareTarget0);
            int v6 = dfzz0.t.a();
            dfzz0.w.i(dcpt.n(v1, shareTarget0, v2, v3, dcpt.w(dfzz0.i, dfzz0.ah(), intent0, v4, v5, v6)));
            dfzz0.bO(shareTarget0);
            dfzz0.aC();
        }
        dfzz.bN(new dfwn(dfzz0, shareTarget0, dfum0, dcnp0));
    }
}

