public final class dyaz implements gfsi {
    public final String a;
    public final gged_interceptors b;

    public dyaz(String s, gged_interceptors gged0) {
        this.a = s;
        this.b = gged0;
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
        gged_interceptors gged0 = this.b;
        String s = this.a;
        ggeo ggeo0 = ggeo.l(s, gged0);
        for(Object object1: ((dydv)object0).b) {
            if(dybn.f(ggeo0, ((dydu)object1))) {
                return (dydv)((ProtoLiteBuilder)dydm0).N_build();
            }
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dydu.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((dydu)hftp1.b_message).d = 3;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)dydo.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        s.getClass();
        ((dydo)hftv0).b |= 1;
        ((dydo)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        dydo dydo0 = (dydo)hftp2.b_message;
        hfuo hfuo0 = dydo0.d;
        if(!hfuo0.c()) {
            dydo0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(gged0, dydo0.d);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dydu dydu0 = (dydu)hftp1.b_message;
        dydo dydo1 = (dydo)hftp2.N_build();
        dydo1.getClass();
        dydu0.c = dydo1;
        dydu0.b = 4;
        dydm0.a(((dydu)hftp1.N_build()));
        return (dydv)((ProtoLiteBuilder)dydm0).N_build();
    }
}

