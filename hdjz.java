public final class hdjz {
    private final ProtoLiteBuilder a;

    public hdjz(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdkc a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdkc)hftv0;
    }

    public final void b(hdkg hdkg0) {
        ibuq.f(hdkg0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdkc)hftp0.b_message).d = (int)hdkg0.e;
        ((hdkc)hftp0.b_message).c = 2;
    }

    public final void c(hdkb hdkb0) {
        ibuq.f(hdkb0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdkc)hftp0.b_message).e = hdkb0.d;
        ((hdkc)hftp0.b_message).b |= 1;
    }
}

