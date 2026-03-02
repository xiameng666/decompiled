public final class ejzx implements gfsi {
    public final int a;

    public ejzx(int v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ejyo)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ejyo)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ejyo ejyo0 = (ejyo)hftp0.b_message;
        ejyo0.b |= 0x10000;
        ejyo0.o = this.a;
        return (ejyo)hftp0.N_build();
    }
}

