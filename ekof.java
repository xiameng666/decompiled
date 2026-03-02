public final class ekof implements gfsi {
    public final Boolean a;

    public ekof(Boolean boolean0) {
        this.a = boolean0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((elkc)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((elkc)object0))));
        int v = this.a.booleanValue() ? 2 : 3;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((elkc)hftp0.b_message).c = v - 1;
        ((elkc)hftp0.b_message).b |= 1;
        return (elkc)hftp0.N_build();
    }
}

