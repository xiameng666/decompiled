public final class ftre {
    private final ProtoLiteBuilder a;

    public ftre(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final ftrc a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (ftrc)hftv0;
    }

    public final void b(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftrc ftrc0 = (ftrc)hftp0.b_message;
        s.getClass();
        ftrc0.g = s;
    }

    public final void c(ftrb ftrb0) {
        ibuq.f(ftrb0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftrc ftrc0 = (ftrc)hftp0.b_message;
        ftrc0.f = ftrb0.a();
        ftrc0.b |= 1;
    }
}

