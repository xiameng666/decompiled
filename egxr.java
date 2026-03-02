public final class egxr implements gfsi {
    public final boolean a;

    public egxr(boolean z) {
        this.a = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ehiw)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ehiw)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ehiw ehiw0 = (ehiw)hftp0.b_message;
        ehiw0.b |= 1;
        ehiw0.c = this.a;
        return (ehiw)hftp0.N_build();
    }
}

