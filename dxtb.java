public final class dxtb implements evqf {
    public final dxte a;
    public final dpue b;
    public final ProtoLiteBuilder c;

    public dxtb(dxte dxte0, ProtoLiteBuilder hftp0, dpue dpue0) {
        this.a = dxte0;
        this.c = hftp0;
        this.b = dpue0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        ByteString hfsf0 = ByteString.copyFrom(((byte[])object0));
        ProtoLiteBuilder hftp0 = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gtuv)hftp0.b_message).e = hfsf0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtuv gtuv0 = (gtuv)hftp0.b_message;
        hfuf hfuf0 = gtuv0.f;
        if(!hfuf0.c()) {
            gtuv0.f = ProtoLiteMessage.C(hfuf0);
        }
        gtuv0.f.i(1);
        ProtoLiteMessage hftv0 = hftp0.N_build();
        dptv.l(this.a.a, dpuj.bD, ((MessageLite)hftv0), ((MessageLite)gtuw.a), this.b);
    }
}

