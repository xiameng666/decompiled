public final class gsll {
    private final ProtoLiteBuilder a;

    public gsll(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gslj a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gslj)hftv0;
    }

    public final void b(gslb gslb0) {
        ibuq.f(gslb0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gslj gslj0 = (gslj)hftp0.b_message;
        gslb0.getClass();
        gslj0.c = gslb0;
        gslj0.b |= 1;
    }
}

