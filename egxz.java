public final class egxz implements gfsi {
    public final int a;

    public egxz(int v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ehiw)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ehiw)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ehiw ehiw0 = (ehiw)hftp0.b_message;
        ehiw0.b |= 16;
        ehiw0.g = this.a;
        return (ehiw)hftp0.N_build();
    }
}

