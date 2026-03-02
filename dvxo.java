import j..util.Objects;

final class dvxo implements ibth {
    final gtzc a;
    final dvxp b;

    public dvxo(dvxp dvxp0, gtzc gtzc0) {
        this.a = gtzc0;
        Objects.requireNonNull(dvxp0);
        this.b = dvxp0;
        super();
    }

    @Override  // ibth
    public final Object a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtzc.a).v_newBuilder();
        String s = this.a.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtzc gtzc0 = (gtzc)hftp0.b_message;
        s.getClass();
        gtzc0.e = s;
        gtzc gtzc1 = (gtzc)hftp0.N_build();
        this.b.a.c(null, gtzc1, this.b.b, this.b.c, true);
        return ibom.a;
    }
}

