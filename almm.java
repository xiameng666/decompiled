public final class almm implements gfsi {
    public final boolean a;

    public almm(boolean z) {
        this.a = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((altc)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((altc)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((altc)hftp0.b_message).b = this.a;
        return (altc)hftp0.N_build();
    }
}

