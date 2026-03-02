import android.content.Intent;

public final class dfvt implements Runnable {
    public final dfzz a;
    public final dfsq b;

    public dfvt(dfzz dfzz0, dfsq dfsq0) {
        this.a = dfzz0;
        this.b = dfsq0;
    }

    @Override
    public final void run() {
        int v5;
        int v4;
        dfzz dfzz0 = this.a;
        boolean z = false;
        if(dfzz0.n != null) {
            dfsq dfsq0 = this.b;
            dcoz dcoz0 = dfsq0.b;
            dfzz0.ac = dcoz0;
            dfzz0.Q = dfsq0.i;
            if((dcoz0.a == 1 || dcoz0.a == 3 || (dcoz0.a == 5 || dcoz0.a == 6)) && dfzz0.F == null) {
                dfzz0.bj();
            }
            dftl dftl0 = dfsq0.f;
            if(dftl0 != dfzz0.p) {
                if(dfzz0.bB()) {
                    long v = dfzz0.A;
                    Intent intent0 = dfzz0.P;
                    long v1 = dfzz0.w.c();
                    long v2 = dfzz0.A;
                    int v3 = dfzz0.t.a();
                    dfzz0.w.i(dcpt.k(v, dcpt.w(dfzz0.i, dfzz0.ah(), intent0, v1, v2, v3)));
                }
                dfsp dfsp0 = dfsq0.a();
                dcpn dcpn0 = dfzz0.w;
                dfsp0.e = dcpn0.c();
                dfsq dfsq1 = dfsp0.a();
                if(dftl0 == dftl.a) {
                    v4 = dfzz0.l.b(dfsq1);
                    z = true;
                }
                else if(dfzz0.bu()) {
                    v4 = dfzz0.l.f(dfsq1);
                    z = true;
                }
                else {
                    v4 = dfzz0.l.d(dfsq1);
                }
                dfzz0.p = dftl0;
                dfzz0.A = dcpn.a();
                if(v4 == 0) {
                    dfzz0.o = z;
                    dcvz.a.b().h("Successfully transitioned to %s discovery over Nearby Connections", dftl0);
                    v5 = 2;
                }
                else {
                    dcvz.a.e().i("Failed to transition to %s discovery over Nearby Connections: %s", dftl0, cuvu.a(v4));
                    v5 = 3;
                }
                if(dfzz0.bB()) {
                    long v6 = dfzz0.A;
                    long v7 = dcpn0.c();
                    Intent intent1 = dfzz0.P;
                    long v8 = dcpn0.c();
                    long v9 = dfzz0.A;
                    int v10 = dfzz0.t.a();
                    boolean z1 = dfzz0.bw();
                    dcpn0.i(dcpt.G(v6, v5, dcoz0, v7, dfzz0.aq(), dcpt.w(dfzz0.i, dfzz0.ah(), intent1, v8, v9, v10), z1, false));
                    dfzz0.aF();
                }
                return;
            }
            dcvz.a.b().h("Ignores discovery, since we are already scanning in mode %s.", dftl0);
            return;
        }
        dcvz.a.e().p("Can\'t update discovery options if not in discovery.", new Object[0]);
    }
}

