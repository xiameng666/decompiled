public final class dybc implements gfsi {
    public final String a;
    public final guvs b;

    public dybc(String s, guvs guvs0) {
        this.a = s;
        this.b = guvs0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        dydm dydm0;
        if(((dydv)object0) == null) {
            dydm0 = (dydm)((ProtoLiteMessage)dydv.a).v_newBuilder();
        }
        else {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dydv)object0))).jf(5, null);
            hftp0.X(((ProtoLiteMessage)(((dydv)object0))));
            dydm0 = (dydm)hftp0;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dydu.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((dydu)hftp1.b_message).d = 2;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)dydr.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        dydr dydr0 = (dydr)hftp2.b_message;
        this.a.getClass();
        dydr0.b |= 1;
        dydr0.c = this.a;
        dydq dydq0 = (dydq)dyav.a.kt(this.b);
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        dydr dydr1 = (dydr)hftp2.b_message;
        dydr1.d = dydq0.a();
        dydr1.b |= 2;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dydu dydu0 = (dydu)hftp1.b_message;
        dydr dydr2 = (dydr)hftp2.N_build();
        dydr2.getClass();
        dydu0.c = dydr2;
        dydu0.b = 3;
        dydm0.a(((dydu)hftp1.N_build()));
        return (dydv)((ProtoLiteBuilder)dydm0).N_build();
    }
}

