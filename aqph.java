public final class aqph implements gfsi {
    public final String a;

    public aqph(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((arwa)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((arwa)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arwa arwa0 = (arwa)hftp0.b_message;
        this.a.getClass();
        arwa0.b |= 1;
        arwa0.c = this.a;
        return (arwa)hftp0.N_build();
    }
}

