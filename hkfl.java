public final class hkfl {
    private final ProtoLiteBuilder a;

    public hkfl(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hkfj a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hkfj)hftv0;
    }

    public final void b(hkfg hkfg0) {
        ibuq.f(hkfg0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkfj hkfj0 = (hkfj)hftp0.b_message;
        hkfj0.b = hkfg0.a();
    }

    public final void c(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkfj hkfj0 = (hkfj)hftp0.b_message;
        s.getClass();
        hkfj0.c = s;
    }
}

