public final class bnza implements glzn {
    public final bnzd a;

    public bnza(bnzd bnzd0) {
        this.a = bnzd0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ByteString hfsf0 = ((bnql)object0).c.a;
        bnzd bnzd0 = this.a;
        fqxm fqxm0 = bnzd0.f.j == null ? fqxm.a : bnzd0.f.j;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)fqxm0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)fqxm0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fqxm fqxm1 = (fqxm)hftp0.b_message;
        hfsf0.getClass();
        fqxm1.b |= 1;
        fqxm1.c = hfsf0;
        fqxm fqxm2 = (fqxm)hftp0.N_build();
        return gdtf.j(bnzd0.a.j(fqxm2, gfsx.m((bnzd0.f.k == null ? hfwn.a : bnzd0.f.k))), new bnyy(bnzd0), bnzd0.c);
    }
}

