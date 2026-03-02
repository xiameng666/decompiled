public final class ebxh implements ibts {
    public final String a;
    public final dymm b;
    public final dymg c;

    public ebxh(String s, dymm dymm0, dymg dymg0) {
        this.a = s;
        this.b = dymm0;
        this.c = dymg0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dymo)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dymo)object0))));
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)this.b).jf(5, null);
        hftp1.X(((ProtoLiteMessage)this.b));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dymm dymm0 = (dymm)hftp1.b_message;
        this.c.getClass();
        dymm0.d = this.c;
        dymm0.b |= 2;
        dymm dymm1 = (dymm)hftp1.N_build();
        ((dymj)hftp0).a(this.a, dymm1);
        return (dymo)((ProtoLiteBuilder)(((dymj)hftp0))).N_build();
    }
}

