import j..util.DesugarCollections;

public final class dybg implements gfsi {
    public final String a;
    public final String b;

    public dybg(String s, String s1) {
        this.a = s;
        this.b = s1;
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
        String s = this.a;
        if(!dybn.a(DesugarCollections.unmodifiableList(((dydv)dydm0.b_message).b), s).i()) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dydu.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((dydu)hftp1.b_message).d = 4;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)dydn.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            s.getClass();
            ((dydn)hftv0).b |= 1;
            ((dydn)hftv0).c = s;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            dydn dydn0 = (dydn)hftp2.b_message;
            this.b.getClass();
            dydn0.b |= 2;
            dydn0.d = this.b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            dydu dydu0 = (dydu)hftp1.b_message;
            dydn dydn1 = (dydn)hftp2.N_build();
            dydn1.getClass();
            dydu0.c = dydn1;
            dydu0.b = 5;
            dydm0.k(hftp1);
        }
        return (dydv)((ProtoLiteBuilder)dydm0).N_build();
    }
}

