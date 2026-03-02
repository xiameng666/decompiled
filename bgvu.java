public final class bgvu implements gfsi {
    public final boolean a;

    public bgvu(boolean z) {
        this.a = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gxoa)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gxoa)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gxoa)hftp0.b_message).b = (this.a ? 3 : 4) - 2;
        return (gxoa)hftp0.N_build();
    }
}

