public final class dybl implements gfsi {
    public final gged_interceptors a;
    public final String b;

    public dybl(gged_interceptors gged0, String s) {
        this.a = gged0;
        this.b = s;
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
        gged_interceptors gged0 = this.a;
        for(int v = 0; v < ((ggna)gged0).c; ++v) {
            Long long0 = (Long)gged0.get(v);
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dydu.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((dydu)hftp1.b_message).d = 1;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)dydp.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            dydp dydp0 = (dydp)hftp2.b_message;
            this.b.getClass();
            dydp0.b |= 1;
            dydp0.c = this.b;
            long v1 = (long)long0;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            dydp dydp1 = (dydp)hftp2.b_message;
            dydp1.b |= 2;
            dydp1.d = v1;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            dydu dydu0 = (dydu)hftp1.b_message;
            dydp dydp2 = (dydp)hftp2.N_build();
            dydp2.getClass();
            dydu0.c = dydp2;
            dydu0.b = 2;
            dydm0.a(((dydu)hftp1.N_build()));
        }
        return (dydv)((ProtoLiteBuilder)dydm0).N_build();
    }
}

