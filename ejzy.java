public final class ejzy implements gfsi {
    public final Long a;

    public ejzy(Long long0) {
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
        ejyo0.b |= 8;
        ejyo0.c = v;
        return (ejyo)hftp0.N_build();
    }
}

