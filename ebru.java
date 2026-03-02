public final class ebru implements ibts {
    public final ibvd a;

    public ebru(ibvd ibvd0) {
        this.a = ibvd0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        dygd dygd0 = (dygd)object0;
        ibuq.c(dygd0);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dygd0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)dygd0));
        dygf dygf0 = dyge.a(hftp0);
        dyfp dyfp0 = dyfo.a(((dyfi)((ProtoLiteMessage)dyfl.a).v_newBuilder()));
        dyfp0.b();
        dyfp0.c(((Iterable)this.a.a));
        dygf0.c(dyfp0.a());
        return dygf0.a();
    }
}

