public final class arsh implements gfsi {
    public final long a;

    public arsh(long v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((arsf)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((arsf)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arsf arsf0 = (arsf)hftp0.b_message;
        arsf0.b |= 1;
        arsf0.c = this.a;
        return (arsf)hftp0.N_build();
    }
}

