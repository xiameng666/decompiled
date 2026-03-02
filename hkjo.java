public final class hkjo {
    public final ProtoLiteBuilder a;

    public hkjo(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hkjm a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hkjm)hftv0;
    }

    public final void b(hjwx hjwx0) {
        ibuq.f(hjwx0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkjm hkjm0 = (hkjm)hftp0.b_message;
        hjwx0.getClass();
        hkjm0.c = hjwx0;
        hkjm0.b |= 1;
    }
}

