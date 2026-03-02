public final class dybu implements gfsi {
    public final int a;

    public dybu(int v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dylw)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dylw)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dylw dylw0 = (dylw)hftp0.b_message;
        dylw0.d = dylp.a(this.a);
        return (dylw)hftp0.N_build();
    }
}

