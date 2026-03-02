public final class egza implements gfsi {
    public final long a;

    public egza(long v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((egqx)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((egqx)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        egqx egqx0 = (egqx)hftp0.b_message;
        egqx0.b |= 1;
        egqx0.c = this.a;
        return (egqx)hftp0.N_build();
    }
}

