public final class aqjx implements gfsi {
    public final int a;

    public aqjx(int v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((aqhz)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((aqhz)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqhz aqhz0 = (aqhz)hftp0.b_message;
        aqhz0.b |= 1;
        aqhz0.c = this.a;
        return (aqhz)hftp0.N_build();
    }
}

