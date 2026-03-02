final class fdpc {
    private final fdzx a;

    public fdpc(fdzx fdzx0) {
        this.a = fdzx0;
    }

    public final ffau a(fdpd fdpd0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffav.a).v_newBuilder();
        feaa.k(this.a, hftp0, fdpc.c(fdpd0));
        return feaa.c(((ffav)hftp0.N_build()));
    }

    public final void b(ffau ffau0, fdpd fdpd0) {
        ffav ffav0 = feaa.e(ffau0);
        fdvw fdvw0 = feaa.b(ffau0);
        fdpd fdpd1 = fdpc.c(fdpd0);
        feaa.i(this.a, ffav0, fdvw0, fdpd1);
    }

    private static final fdpd c(fdpd fdpd0) {
        return fdpd0.d == null ? null : fdpd0;
    }
}

