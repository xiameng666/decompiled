import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dfxp implements Runnable {
    public final dfzz a;
    public final byte[] b;
    public final dfum c;
    public final String d;

    public dfxp(dfzz dfzz0, byte[] arr_b, dfum dfum0, String s) {
        this.a = dfzz0;
        this.b = arr_b;
        this.c = dfum0;
        this.d = s;
    }

    @Override
    public final void run() {
        dfzz dfzz0 = this.a;
        dfzz0.aD();
        dfzz0.C = dcpn.a();
        byte[] arr_b = this.b;
        dfum dfum0 = this.c;
        dcnp dcnp0 = dfzz0.q;
        int v = 10;
        if(dcnp0 == null) {
            dcvz.a.b().h("Ignoring incoming connection from endpoint %s because we\'re no longer advertising. Disconnecting.", dizs.b(arr_b));
            dfum0.a();
            dcls dcls0 = new dcls();
            dcls0.b = "unknown";
            ShareTarget shareTarget0 = dcls0.a();
            if(!dfzz0.bF()) {
                v = 9;
            }
            dfzz0.bQ(shareTarget0, v);
            return;
        }
        dgag dgag0 = dgag.c(arr_b);
        if(dgag0 == null) {
            dcvz.a.b().h("Failed to parse incoming connection from endpoint %s. Disconnecting.", dizs.b(arr_b));
            dfum0.a();
            dcls dcls1 = new dcls();
            dcls1.b = "unknown";
            ShareTarget shareTarget1 = dcls1.a();
            if(!dfzz0.bF()) {
                v = 11;
            }
            dfzz0.bQ(shareTarget1, v);
            return;
        }
        String s = this.d;
        ShareTarget shareTarget2 = dfzz0.V(s, dgag0, true);
        if(shareTarget2 == null) {
            dcvz.a.b().h("Failed to convert advertisement %s to share target from incoming connection. Disconnecting.", dizs.b(arr_b));
            dfum0.a();
            dcls dcls2 = new dcls();
            dcls2.b = "unknown";
            ShareTarget shareTarget3 = dcls2.a();
            if(!dfzz0.bF()) {
                v = 11;
            }
            dfzz0.bQ(shareTarget3, v);
            return;
        }
        cunf cunf0 = dcvz.a;
        cunf0.b().h("Received incoming connection from %s", shareTarget2);
        dfzz0.ba(shareTarget2, dfum0);
        dcnp dcnp1 = dfzz0.Z(shareTarget2, dcnp0);
        dfzz0.bc(shareTarget2, s);
        dfum0.b(new dfye(dfzz0, shareTarget2));
        dfvp dfvp0 = dfzz0.l;
        String s1 = dfvp0.h(s);
        switch(dfzz0.af(shareTarget2).ordinal()) {
            case 0: {
                cunf0.b().h("Paired key handshake succeeded when receiving connection from %s.", shareTarget2);
                dfzz0.bQ(shareTarget2, 2);
                dfzz0.aP(shareTarget2, null);
                shareTarget2.o = dfzz0.Q;
                if(dfvp0.F(s)) {
                    cunf0.d().h("Connection to %s is verified, accepts payloads.", s);
                    dfzz0.N(shareTarget2);
                }
                else if(shareTarget2.n) {
                    cunf0.b().h("%s is a self share device, accepts payloads.", s);
                    dfzz0.N(shareTarget2);
                }
                break;
            }
            case 1: {
                cunf0.b().h("Paired key handshake failed when receiving connection from %s. Disconnecting.", shareTarget2);
                dfum0.a();
                if(!dfzz0.bF()) {
                    v = 6;
                }
                dfzz0.bQ(shareTarget2, v);
                return;
            }
            case 2: {
                cunf0.b().h("Unable to verify paired key encryption when receiving connection from %s. Verify tokens on devices.", shareTarget2);
                dfzz0.bQ(shareTarget2, 2);
                if(dfvp0.F(s)) {
                    cunf0.d().h("Connection to %s is verified, skip token comparison.", s);
                    dfzz0.aP(shareTarget2, null);
                }
                else {
                    dfzz0.bi(shareTarget2, s1);
                    dfzz0.aP(shareTarget2, s1);
                }
            }
        }
        dfum0.b(new dfyf(dfzz0, shareTarget2, dcnp1));
    }
}

