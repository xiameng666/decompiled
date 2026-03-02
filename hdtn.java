public final class hdtn {
    private final ProtoLiteBuilder a;

    public hdtn(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdsn a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdsn)hftv0;
    }

    public final void b(hdsm hdsm0) {
        ibuq.f(hdsm0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdsn)hftp0.b_message).c = hdsm0.g;
        ((hdsn)hftp0.b_message).b |= 1;
    }

    public final void c(float f) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdsn hdsn0 = (hdsn)hftp0.b_message;
        hdsn0.b |= 2;
        hdsn0.d = f;
    }
}

