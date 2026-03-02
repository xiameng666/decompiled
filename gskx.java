public final class gskx {
    private final ProtoLiteBuilder a;

    public gskx(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gskv a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gskv)hftv0;
    }

    public final void b(hfwn hfwn0) {
        ibuq.f(hfwn0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gskv gskv0 = (gskv)hftp0.b_message;
        hfwn0.getClass();
        gskv0.c = hfwn0;
        gskv0.b |= 1;
    }
}

