public final class eijp implements gfsi {
    public final boolean a;

    public eijp(boolean z) {
        this.a = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gwod)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gwod)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwod)hftp0.b_message).c = (this.a ? 2 : 3) - 1;
        ((gwod)hftp0.b_message).b |= 1;
        return (gwod)hftp0.N_build();
    }
}

