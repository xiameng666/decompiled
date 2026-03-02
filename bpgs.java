public final class bpgs implements glzn {
    public final bpik a;
    public final boolean b;
    public final bpii c;
    public final gszo d;
    public final ByteString e;

    public bpgs(bpik bpik0, boolean z, bpii bpii0, gszo gszo0, ByteString hfsf0) {
        this.a = bpik0;
        this.b = z;
        this.c = bpii0;
        this.d = gszo0;
        this.e = hfsf0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Void void0 = (Void)object0;
        bpik bpik0 = this.a;
        bpik0.o.a();
        if(!this.b) {
            return gmbx.a;
        }
        bnla bnla0 = this.c.c.a();
        gsyz gsyz0 = this.d.c == null ? gsyz.a : this.d.c;
        int v = gtac.b(this.d.l) == 0 ? 1 : gtac.b(this.d.l);
        long v1 = this.d.j;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtdw.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtdw gtdw0 = (gtdw)hftp0.b_message;
        gsyz0.getClass();
        gtdw0.c = gsyz0;
        gtdw0.b |= 1;
        gtbr gtbr0 = bpik0.G(this.e, v, v1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        gtbr0.getClass();
        ((gtdw)hftv0).d = gtbr0;
        ((gtdw)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gtdw)hftp0.b_message).e = v1;
        return bnla0.o(gged_interceptors.l(((gtdw)hftp0.N_build())));
    }
}

