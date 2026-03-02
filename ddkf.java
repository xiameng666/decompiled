public final class ddkf implements evpo {
    public final fpfv a;

    public ddkf(fpfv fpfv0) {
        this.a = fpfv0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        hfgu hfgu0;
        hfga hfga0 = (hfga)evql0.j();
        if(hfga0 == null) {
            hfgs hfgs0 = (hfgs)((ProtoLiteMessage)hfgu.a).v_newBuilder();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfgt.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((hfgt)hftv0).b |= 1;
            ((hfgt)hftv0).c = 10;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfgt hfgt0 = (hfgt)hftp0.b_message;
            hfgt0.b |= 2;
            hfgt0.d = true;
            hfgs0.a(((hfgt)hftp0.N_build()));
            hfgu0 = (hfgu)((ProtoLiteBuilder)hfgs0).N_build();
            return cuuc.d(this.a.c(hfgu0), hvqs.r());
        }
        hfgs hfgs1 = (hfgs)((ProtoLiteMessage)hfgu.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfgt.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((hfgt)hftv1).b |= 1;
        ((hfgt)hftv1).c = 10;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        hfgt hfgt1 = (hfgt)hftp1.b_message;
        hfgt1.b |= 2;
        hfgt1.d = true;
        hfgs1.a(((hfgt)hftp1.N_build()));
        ByteString hfsf0 = hfga0.d;
        if(!hfgs1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hfgs1).ensureMutable();
        }
        hfgu hfgu1 = (hfgu)hfgs1.b_message;
        hfsf0.getClass();
        hfgu1.b |= 2;
        hfgu1.d = hfsf0;
        hfgu0 = (hfgu)((ProtoLiteBuilder)hfgs1).N_build();
        return cuuc.d(this.a.c(hfgu0), hvqs.r());
    }
}

