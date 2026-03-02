public final class ehcy implements gfsi {
    public final long a;

    public ehcy(long v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eggi)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eggi)object0))));
        hfwn hfwn0 = hfyn.h(this.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eggi eggi0 = (eggi)hftp0.b_message;
        hfwn0.getClass();
        eggi0.c = hfwn0;
        eggi0.b |= 1;
        return (eggi)hftp0.N_build();
    }
}

