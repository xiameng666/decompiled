public final class aqjs implements gfsi {
    public final long a;
    public final String b;

    public aqjs(long v, String s) {
        this.a = v;
        this.b = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aqhn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqhn aqhn0 = (aqhn)hftp0.b_message;
        aqhn0.b |= 1;
        aqhn0.c = this.a;
        aqhn aqhn1 = (aqhn)hftp0.N_build();
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((aqhp)object0))).jf(5, null);
        hftp1.X(((ProtoLiteMessage)(((aqhp)object0))));
        hftp1.cP(this.b, aqhn1);
        return (aqhp)hftp1.N_build();
    }
}

