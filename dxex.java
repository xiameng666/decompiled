public final class dxex {
    public final ProtoLiteBuilder a;

    public dxex(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final dxev a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (dxev)hftv0;
    }

    public final void b(dxet dxet0) {
        ibuq.f(dxet0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dxev dxev0 = (dxev)hftp0.b_message;
        dxet0.getClass();
        dxev0.d = dxet0;
        dxev0.b |= 2;
    }
}

