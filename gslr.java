public final class gslr {
    public final ProtoLiteBuilder a;

    public gslr(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gslp a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gslp)hftv0;
    }

    public final void b(gsly gsly0) {
        ibuq.f(gsly0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gslp gslp0 = (gslp)hftp0.b_message;
        gsly0.getClass();
        gslp0.d = gsly0;
        gslp0.c = 4;
    }
}

