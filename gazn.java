public final class gazn extends gazd {
    public gazn(gaym gaym0) {
        ibuq.f(gaym0, "eventLogger");
        super(new ibuk(gazl.class), gaym0);
    }

    @Override  // gazd
    public final void b(gazo gazo0, gazc gazc0) {
        ibns ibns0 = gazc0.a(new gazm(((gazl)gazo0)));
        ayuc ayuc0 = (ayuc)ibns0.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)ibns0.b;
        gaxl.a();
        if(hzlc.c()) {
            gkwx gkwx0 = gkwx.b(((gkxt)hftp0.b_message).g);
            if(gkwx0 == null) {
                gkwx0 = gkwx.a;
            }
            ibzk.b(("\n        TimeToResponsiveMetricsReport\n        Event type: " + gkwx0.name() + "\n        @ " + ayuc0.a() + "\n      "));
        }
        ayuc0.d();
    }
}

