public final class eijn implements gfsi {
    public final long a;

    public eijn(long v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gwmf)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gwmf)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwmf gwmf0 = (gwmf)hftp0.b_message;
        gwmf0.b |= 1;
        gwmf0.c = this.a;
        return (gwmf)hftp0.N_build();
    }
}

