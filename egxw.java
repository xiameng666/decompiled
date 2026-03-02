public final class egxw implements gfsi {
    public final int a;

    public egxw(int v) {
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
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ehiw)hftv0).b |= 1;
        ((ehiw)hftv0).c = true;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ehiw ehiw1 = (ehiw)hftp0.b_message;
        ehiw1.b |= 2;
        ehiw1.d = false;
        return (ehiw)hftp0.N_build();
    }
}

