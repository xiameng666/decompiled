public final class bpdw implements glzn {
    public final bpik a;

    public bpdw(bpik bpik0) {
        this.a = bpik0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Void void0 = (Void)object0;
        gfqx gfqx0 = gfqx.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fqza.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((fqza)hftv0).b |= 1;
        ((fqza)hftv0).e = false;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((fqza)hftp0.b_message).d = (int)5;
        ((fqza)hftp0.b_message).c = 4;
        gfsx gfsx0 = gfsx.m(((fqza)hftp0.N_build()));
        return this.a.e.q(gfqx0, gfsx0, gfqx0);
    }
}

