public final class ctdv {
    public final ProtoLiteBuilder a;

    public ctdv(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final ctdt a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (ctdt)hftv0;
    }

    public final void b(hfwn hfwn0) {
        ibuq.f(hfwn0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ctdt ctdt0 = (ctdt)hftp0.b_message;
        hfwn0.getClass();
        ctdt0.d = hfwn0;
        ctdt0.b |= 1;
    }

    public final void c(gyve gyve0) {
        ibuq.f(gyve0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ctdt ctdt0 = (ctdt)hftp0.b_message;
        gyve0.getClass();
        ctdt0.e = gyve0;
        ctdt0.b |= 2;
    }
}

