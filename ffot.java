public final class ffot implements gfsi {
    public final int a;

    public ffot(int v) {
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
        igyu0.b |= 4;
        igyu0.e = this.a;
        return (igyu)hftp0.N_build();
    }
}

