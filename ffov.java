public final class ffov implements gfsi {
    public final long a;

    public ffov(long v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((igyu)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((igyu)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        igyu igyu0 = (igyu)hftp0.b_message;
        igyu0.b |= 8;
        igyu0.f = (int)this.a;
        return (igyu)hftp0.N_build();
    }
}

