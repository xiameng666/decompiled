public final class dvgl {
    public final dmhi a;

    public dvgl(dmhi dmhi0) {
        this.a = dmhi0;
    }

    public final void a(String s, int v, String s1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvak.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gvaj.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((gvaj)hftv0).d = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gvaj)hftp1.b_message).e = v - 2;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gvai.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gvai gvai0 = (gvai)hftp2.b_message;
        s1.getClass();
        gvai0.b = s1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gvaj gvaj0 = (gvaj)hftp1.b_message;
        gvai gvai1 = (gvai)hftp2.N_build();
        gvai1.getClass();
        gvaj0.c = gvai1;
        gvaj0.b = 3;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvak gvak0 = (gvak)hftp0.b_message;
        gvaj gvaj1 = (gvaj)hftp1.N_build();
        gvaj1.getClass();
        hfuo hfuo0 = gvak0.b;
        if(!hfuo0.c()) {
            gvak0.b = ProtoLiteMessage.E(hfuo0);
        }
        gvak0.b.add(gvaj1);
        gvak gvak1 = (gvak)hftp0.N_build();
        dptv.b(this.a, dpuj.bm, ((MessageLite)gvak1), ((MessageLite)gval.a));
    }
}

