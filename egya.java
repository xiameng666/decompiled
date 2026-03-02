public final class egya implements gfsi {
    public final int a;
    public final long b;

    public egya(int v, long v1) {
        this.a = v;
        this.b = v1;
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
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((ehiw)hftv1).b |= 2;
        ((ehiw)hftv1).d = false;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ehiw ehiw1 = (ehiw)hftp0.b_message;
        ehiw1.b |= 0x40;
        ehiw1.h = this.b;
        return (ehiw)hftp0.N_build();
    }
}

