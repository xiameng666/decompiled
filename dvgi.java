public final class dvgi {
    public final dmkl a;
    public final dmhi b;
    public final ggfp c;

    public dvgi(dmkl dmkl0, dmhi dmhi0, ggfp ggfp0) {
        this.a = dmkl0;
        this.b = dmhi0;
        this.c = ggfp0;
    }

    public final void a(String s, dpue dpue0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvab.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvab gvab0 = (gvab)hftp0.b_message;
        s.getClass();
        gvab0.b = 2;
        gvab0.c = s;
        gvab gvab1 = (gvab)hftp0.N_build();
        dptv.l(this.b, dpuj.cC, ((MessageLite)gvab1), ((MessageLite)gvac.a), dpue0);
    }
}

