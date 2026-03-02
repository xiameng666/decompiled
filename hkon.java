public final class hkon {
    private final ProtoLiteBuilder a;

    public hkon(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hkol a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hkol)hftv0;
    }

    public final void b(String s) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkol hkol0 = (hkol)hftp0.b_message;
        hkol0.b |= 1;
        hkol0.c = s;
    }

    public final void c(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkol hkol0 = (hkol)hftp0.b_message;
        s.getClass();
        hkol0.b |= 2;
        hkol0.d = s;
    }
}

