public final class bovr implements gfsi {
    public final bovs a;
    public final boolean b;
    public final int c;

    public bovr(bovs bovs0, int v, boolean z) {
        this.a = bovs0;
        this.c = v;
        this.b = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzv)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fqzv)object0))));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fqxr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((fqxr)hftp1.b_message).e = this.c - 2;
        ((fqxr)hftp1.b_message).b |= 4;
        hfwn hfwn0 = hfyg.b(this.a.b.d());
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        hfwn0.getClass();
        ((fqxr)hftv0).c = hfwn0;
        ((fqxr)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        fqxr fqxr0 = (fqxr)hftp1.b_message;
        fqxr0.b |= 2;
        fqxr0.d = this.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fqzv fqzv0 = (fqzv)hftp0.b_message;
        fqxr fqxr1 = (fqxr)hftp1.N_build();
        fqxr1.getClass();
        fqzv0.g = fqxr1;
        fqzv0.c |= 4;
        return (fqzv)hftp0.N_build();
    }
}

