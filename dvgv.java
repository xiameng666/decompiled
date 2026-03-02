public final class dvgv {
    public static final bboh a;
    public final dvfu b;
    public final dmkl c;
    public final dmhi d;
    public final ggfp e;
    public final edmu f;

    static {
        dvgv.a = bboh.b("Pay", bbcu.cZ);
    }

    public dvgv(dvfu dvfu0, dmkl dmkl0, dmhi dmhi0, ggfp ggfp0, edmu edmu0) {
        this.b = dvfu0;
        this.c = dmkl0;
        this.d = dmhi0;
        this.e = ggfp0;
        this.f = edmu0;
    }

    public final void a(gged_interceptors gged0, dpue dpue0) {
        dpuj dpuj0 = dpuj.bg;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvel.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvel gvel0 = (gvel)hftp0.b_message;
        hfuo hfuo0 = gvel0.b;
        if(!hfuo0.c()) {
            gvel0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(gged0, gvel0.b);
        ProtoLiteMessage hftv0 = hftp0.N_build();
        dptv.l(this.d, dpuj0, ((MessageLite)hftv0), ((MessageLite)gvem.a), dpue0);
    }
}

