public final class ebzh implements ibts {
    public final ebzr a;

    public ebzh(ebzr ebzr0) {
        this.a = ebzr0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((dygd)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dygd)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dygd)object0))));
        dygf dygf0 = dyge.a(hftp0);
        this.a.i();
        ProtoLiteBuilder hftp1 = dygf0.a;
        long v = System.currentTimeMillis();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((dygd)hftp1.b_message).e = v;
        return dygf0.a();
    }
}

