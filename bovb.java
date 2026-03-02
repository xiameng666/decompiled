public final class bovb implements gfsi {
    public final fqzu a;

    public bovb(fqzu fqzu0) {
        this.a = fqzu0;
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
        fqzv0.e = this.a;
        fqzv0.c |= 1;
        return (fqzv)hftp0.N_build();
    }
}

