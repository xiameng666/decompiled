public final class ekaf implements gfsi {
    public final Long a;

    public ekaf(Long long0) {
        this.a = long0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ejyo)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ejyo)object0))));
        long v = (long)this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ejyo ejyo0 = (ejyo)hftp0.b_message;
        ejyo0.b |= 0x20;
        ejyo0.e = v;
        return (ejyo)hftp0.N_build();
    }
}

