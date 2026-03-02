public final class buhp {
    private final ProtoLiteBuilder a;

    public buhp(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final buhn a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (buhn)hftv0;
    }

    public final void b(hiwq hiwq0) {
        ibuq.f(hiwq0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        buhn buhn0 = (buhn)hftp0.b_message;
        hiwq0.getClass();
        buhn0.c = hiwq0;
        buhn0.b |= 1;
    }

    public final void c(hiwv hiwv0) {
        ibuq.f(hiwv0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        buhn buhn0 = (buhn)hftp0.b_message;
        hiwv0.getClass();
        buhn0.d = hiwv0;
        buhn0.b |= 2;
    }
}

