import com.google.android.gms.nearby.sharing.QrCodeMetadata;

public final class dfwx implements Runnable {
    public final dfzz a;
    public final dfso b;
    public final QrCodeMetadata c;
    public final String d;
    public final dcnp e;

    public dfwx(dfzz dfzz0, dfso dfso0, QrCodeMetadata qrCodeMetadata0, String s, dcnp dcnp0) {
        this.a = dfzz0;
        this.b = dfso0;
        this.c = qrCodeMetadata0;
        this.d = s;
        this.e = dcnp0;
    }

    @Override
    public final void run() {
        gyzc gyzc0;
        int v3;
        dfzz dfzz0 = this.a;
        dfzz0.B = dcpn.a();
        int v = 0;
        if(hvqz.a.b().bf() && dfzz0.l.E()) {
            dcvz.a.e().p("Do not advertise in the provider due to active payloads", new Object[0]);
            return;
        }
        if(!hvqz.v()) {
            dfzz0.l.j();
        }
        dfso dfso0 = this.b;
        dcpn dcpn0 = dfzz0.w;
        dfsn dfsn0 = dfso0.a();
        dfsn0.h = dcpn0.d();
        dfso dfso1 = dfsn0.a();
        dfzz0.S = this.c;
        if(dfzz0.S != null) {
            dcvz.a.b().p("Starting advertising over Nearby Connections with QR code advertising token", new Object[0]);
        }
        if(dfzz0.J == 3) {
            v = dfso0.j;
        }
        byte[] arr_b = dfzz0.S == null ? null : djbk.a(dfzz0.S.a);
        int v1 = dfso0.b;
        dftl dftl0 = dfso0.a;
        dcpu dcpu0 = new dcpu();
        dcpu0.b = 3;
        dcpu0.a = 11;
        String s = this.d;
        int v2 = dfzz0.l.I(dfzz0.bH(dfso0.e, s, arr_b, v, new dcpv(dcpu0)), dfzz0, dfso1);
        if(v2 == 0) {
            dfzz0.q = this.e;
            dfzz0.r = dftl0;
            dcvz.a.b().j("Successfully started advertising over Nearby Connections: %s, %s, %s", dftl0, djbr.t(dfzz0.J), dfzz.al(v1));
            v3 = 2;
        }
        else {
            dcvz.a.e().h("Failed to advertise over Nearby Connections: %s", cuvu.a(v2));
            v3 = 3;
        }
        if(dfzz0.J == 3) {
            dcpu dcpu1 = new dcpu();
            dcpu1.b = 3;
            dcpu1.a = 11;
            dfzz0.E(new dcpv(dcpu1));
        }
        gzax gzax0 = s == null ? djan.a(dfzz0.J) : gzax.c;
        int v4 = dftl0.ordinal();
        if(v4 == 0) {
            gyzc0 = gyzc.c;
        }
        else {
            switch(v4) {
                case 1: {
                    gyzc0 = gyzc.d;
                    break;
                }
                case 2: {
                    gyzc0 = gyzc.e;
                    break;
                }
                case 3: {
                    gyzc0 = gyzc.b;
                    break;
                }
                default: {
                    if(v4 != 4) {
                        throw new RuntimeException(null, null);
                    }
                    gyzc0 = gyzc.f;
                    break;
                }
            }
        }
        if(dfzz0.bv()) {
            dcpn0.i(dcpt.A(gzax0, v3, v1, dfzz0.aq(), gyzc0, dfzz0.bC(), dfzz0.C, dcpn0.b(), dfzz0.t.a()));
        }
    }
}

