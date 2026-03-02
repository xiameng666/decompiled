public final class ebsg implements ibts {
    public final ebsr a;

    public ebsg(ebsr ebsr0) {
        this.a = ebsr0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((dygd)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dygd)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dygd)object0))));
        dygf dygf0 = dyge.a(hftp0);
        if(this.a.d == null) {
            ibuq.j("clock");
        }
        dygf0.e(System.currentTimeMillis());
        return dygf0.a();
    }
}

