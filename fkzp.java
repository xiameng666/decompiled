public final class fkzp implements gfsi {
    public final Enum a;
    public final long b;

    public fkzp(Enum enum0, long v) {
        this.a = enum0;
        this.b = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        flak flak0;
        int v = ((hfub)this.a).a();
        int v1 = flal.a(((flak)object0).c, v);
        if(v1 == -1) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((flak)object0))).jf(5, null);
            hftp0.X(((ProtoLiteMessage)(((flak)object0))));
            ((flah)hftp0).l(flal.h(v));
            flak0 = (flak)((ProtoLiteBuilder)(((flah)hftp0))).N_build();
        }
        else {
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((flak)object0))).jf(5, null);
            hftp1.X(((ProtoLiteMessage)(((flak)object0))));
            ((flah)hftp1).n(v1, flal.c(((flai)((flak)object0).c.get(v1))));
            flak0 = (flak)((ProtoLiteBuilder)(((flah)hftp1))).N_build();
        }
        long v2 = this.b;
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)flak0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)flak0));
        int v3 = flal.b(flak0.f, v);
        if(v3 == -1) {
            ((flah)hftp2).m(flal.d(v, v2, v2));
            return (flak)((ProtoLiteBuilder)(((flah)hftp2))).N_build();
        }
        ((flah)hftp2).o(v3, flal.e(((flah)hftp2).k(v3), v2));
        return (flak)((ProtoLiteBuilder)(((flah)hftp2))).N_build();
    }
}

