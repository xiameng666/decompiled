import android.content.Intent;

public final class dfvr implements Runnable {
    public final dfzz a;

    public dfvr(dfzz dfzz0) {
        this.a = dfzz0;
    }

    @Override
    public final void run() {
        dfzz dfzz0 = this.a;
        dfzz0.bl();
        dfzz0.l.D();
        dfzz0.E = dfzz0.au(new dfxt(dfzz0), hvqs.a.aT().l());
        if(dfzz0.F != null) {
            dfzz0.F.cancel(true);
            dfzz0.F = null;
        }
        dfzz0.n = null;
        dfzz0.o = false;
        if(dfzz0.bB()) {
            long v = dfzz0.A;
            Intent intent0 = dfzz0.P;
            long v1 = dfzz0.w.c();
            long v2 = dfzz0.A;
            int v3 = dfzz0.t.a();
            dfzz0.w.i(dcpt.k(v, dcpt.w(dfzz0.i, dfzz0.ah(), intent0, v1, v2, v3)));
        }
        dfzz0.T.clear();
        dfzz0.aI();
        for(Object object0: dfzz0.e.values()) {
            ((dfzj)object0).a();
        }
        dcvz.a.b().p("Stopped discovery", new Object[0]);
    }
}

