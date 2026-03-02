public final class hodc {
    private final ProtoLiteBuilder a;

    public hodc(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hoep a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hoep)hftv0;
    }

    public final void b(String s) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hoep)hftp0.b_message).b = s;
    }

    public final void c(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hoep hoep0 = (hoep)hftp0.b_message;
        s.getClass();
        hoep0.c = s;
    }
}

