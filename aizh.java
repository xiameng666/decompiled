public final class aizh implements gfsi {
    public final ajbj a;

    public aizh(ajbj ajbj0) {
        this.a = ajbj0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ajbz)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ajbz)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ajbz)hftp0.b_message).i = this.a.c;
        ((ajbz)hftp0.b_message).b |= 16;
        return (ajbz)hftp0.N_build();
    }
}

