public final class aqjz implements gfsi {
    public final String a;

    public aqjz(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((aqhz)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((aqhz)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqhz aqhz0 = (aqhz)hftp0.b_message;
        aqhz0.b |= 2;
        aqhz0.d = this.a;
        return (aqhz)hftp0.N_build();
    }
}

