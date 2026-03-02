public final class dycp implements gfsi {
    public final int a;

    public dycp(int v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eudq)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eudq)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((eudq)hftp0.b_message).c = this.a - 1;
        ((eudq)hftp0.b_message).b |= 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((eudq)hftp0.b_message).d = null;
        ((eudq)hftp0.b_message).b &= -5;
        return (eudq)hftp0.N_build();
    }
}

