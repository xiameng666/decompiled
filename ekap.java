public final class ekap implements gfsi {
    public final String a;

    public ekap(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ejyo)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ejyo)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ejyo ejyo0 = (ejyo)hftp0.b_message;
        this.a.getClass();
        ejyo0.b |= 0x4000;
        ejyo0.l = this.a;
        return (ejyo)hftp0.N_build();
    }
}

