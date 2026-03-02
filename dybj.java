public final class dybj implements gfsi {
    public final String a;

    public dybj(String s) {
        this.a = s;
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
        ((dydu)hftp1.b_message).d = 5;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)dyds.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        dyds dyds0 = (dyds)hftp2.b_message;
        this.a.getClass();
        dyds0.b |= 1;
        dyds0.c = this.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dydu dydu0 = (dydu)hftp1.b_message;
        dyds dyds1 = (dyds)hftp2.N_build();
        dyds1.getClass();
        dydu0.c = dyds1;
        dydu0.b = 6;
        dydm0.k(hftp1);
        return (dydv)((ProtoLiteBuilder)dydm0).N_build();
    }
}

