public final class bnkm implements glzn {
    public final bnla a;

    public bnkm(bnla bnla0) {
        this.a = bnla0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        int v = ((gted)object0).c + 1;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtdp.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gted.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gted)hftp1.b_message).c = v;
        gted gted0 = (gted)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtdp gtdp0 = (gtdp)hftp0.b_message;
        gted0.getClass();
        gtdp0.c = gted0;
        gtdp0.b |= 1;
        hftf hftf0 = (hftf)((ProtoLiteMessage)hftg.a).v_newBuilder();
        hftf0.k("last_owner_key_version");
        hftg hftg0 = (hftg)((ProtoLiteBuilder)hftf0).N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtdp gtdp1 = (gtdp)hftp0.b_message;
        hftg0.getClass();
        gtdp1.d = hftg0;
        gtdp1.b |= 2;
        gtdp gtdp2 = (gtdp)hftp0.N_build();
        return gdtf.j(bnka.a(((gtdj)this.a.a.q(cmlp.a, ckfr.b)).c(gtdp2), "reserveOwnerKeyVersion:updateUser"), new bnko(this.a, v), gmap.a);
    }
}

