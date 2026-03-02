public final class aiqg implements gfsi {
    public final ajap a;

    public aiqg(ajap ajap0) {
        this.a = ajap0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ajar)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ajar)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ajar)hftp0.b_message).d = this.a.d;
        ((ajar)hftp0.b_message).b |= 1;
        return (ajar)hftp0.N_build();
    }
}

