import android.os.Debug;

public final class gbao extends gazd {
    public gbao(gaym gaym0) {
        ibuq.f(gaym0, "eventLogger");
        super(new ibuk(gbak.class), gaym0);
    }

    @Override  // gazd
    public final void b(gazo gazo0, gazc gazc0) {
        ibns ibns0 = gazc0.a(new gbam(((gbak)gazo0)));
        gbao.d(((ayuc)ibns0.a), ((ProtoLiteBuilder)ibns0.b));
    }

    @Override  // gazd
    public final void c(gazo gazo0, gazc gazc0) {
        gban gban0 = new gban(((gbak)gazo0));
        gazb gazb0 = (gazb)gazc0;
        ibns ibns0 = gazb0.a.a(gazb0.b, gazb0.c, gban0);
        gbao.d(((ayuc)ibns0.a), ((ProtoLiteBuilder)ibns0.b));
    }

    private static final void d(ayuc ayuc0, ProtoLiteBuilder hftp0) {
        gaxl.a();
        if(hzlc.c()) {
            gkwx gkwx0 = gkwx.b(((gkxt)hftp0.b_message).g);
            if(gkwx0 == null) {
                gkwx0 = gkwx.a;
            }
            gkxt gkxt0 = (gkxt)hftp0.b_message;
            long v = ayuc0.a();
            String s = ibzk.b(("\n        TimeToResponsiveMetricsReport\n        Event type: " + gkwx0.name() + "\n        TimingEventId: " + (gkxt0.c == 20 ? ((gkyr)gkxt0.d) : gkyr.a).c + "\n        @ " + v + "\n      "));
            gkxt gkxt1 = (gkxt)hftp0.b_message;
            if((gkwx.b(gkxt1.g) == null ? gkwx.a : gkwx.b(gkxt1.g)) == gkwx.n) {
                ibzk.d(("\n          |" + s + "\n          |TriggerNodeUiReference: " + gkxt1.h + "\n          |TriggerNodeVisualElementId: " + gkxt1.i + "\n        "));
            }
        }
        if(Debug.isDebuggerConnected()) {
            gaxl.a();
            return;
        }
        ayuc0.d();
    }
}

