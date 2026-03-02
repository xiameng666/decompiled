public final class fkqh implements gfsi {
    public final fkqi a;

    public fkqh(fkqi fkqi0) {
        this.a = fkqi0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fkqi fkqi0 = this.a;
        fkpq fkpq0 = fkqi0.b;
        glnv glnv0 = ((fiyn)object0).a(fkqi.c(fkqi0.a, fkpq0));
        if(glnv0 != null) {
            fkpz fkpz0 = (fkpz)fkqi0.c.mr();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fkpo.a).v_newBuilder();
            int v = (int)glnv0.e;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fkpo fkpo0 = (fkpo)hftp0.b_message;
            fkpo0.b |= 1;
            fkpo0.e = v;
            fkpn fkpn0 = fkqi0.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fkpo fkpo1 = (fkpo)hftp0.b_message;
            fkpn0.getClass();
            fkpo1.f = fkpn0;
            fkpo1.b |= 2;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fkpp.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((fkpp)hftp1.b_message).c = glnv0;
            ((fkpp)hftp1.b_message).b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fkpo fkpo2 = (fkpo)hftp0.b_message;
            fkpp fkpp0 = (fkpp)hftp1.N_build();
            fkpp0.getClass();
            fkpo2.d = fkpp0;
            fkpo2.c = 4;
            fkpz0.a(fkpq0, ((fkpo)hftp0.N_build()));
        }
        return null;
    }
}

