public final class hkqu {
    public final ProtoLiteBuilder a;

    public hkqu(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hkqs a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hkqs)hftv0;
    }

    public final void b(hkqm hkqm0) {
        ibuq.f(hkqm0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkqs hkqs0 = (hkqs)hftp0.b_message;
        hkqs0.e = hkqm0.a();
        hkqs0.b |= 1;
    }
}

