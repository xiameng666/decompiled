public final class bova implements gfsi {
    public final hfwn a;

    public bova(hfwn hfwn0) {
        this.a = hfwn0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzv)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fqzv)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fqzv fqzv0 = (fqzv)hftp0.b_message;
        this.a.getClass();
        fqzv0.f = this.a;
        fqzv0.c |= 2;
        return (fqzv)hftp0.N_build();
    }
}

