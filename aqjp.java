public final class aqjp implements gfsi {
    public final String a;

    public aqjp(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((aqhm)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((aqhm)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqhm aqhm0 = (aqhm)hftp0.b_message;
        this.a.getClass();
        aqhm0.b |= 1;
        aqhm0.c = this.a;
        return (aqhm)hftp0.N_build();
    }
}

