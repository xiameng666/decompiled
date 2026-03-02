public final class gsma {
    public final ProtoLiteBuilder a;

    public gsma(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gsly a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gsly)hftv0;
    }

    public final void b(gskv gskv0) {
        ibuq.f(gskv0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsly gsly0 = (gsly)hftp0.b_message;
        gskv0.getClass();
        gsly0.d = gskv0;
        gsly0.c = 3;
    }

    public final void c(boolean z) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gsly)hftp0.b_message).c = 2;
        ((gsly)hftp0.b_message).d = Boolean.valueOf(z);
    }
}

