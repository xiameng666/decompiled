public final class hdpm {
    private final ProtoLiteBuilder a;

    public hdpm(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdpp a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdpp)hftv0;
    }

    public final void b(hdpo hdpo0) {
        ibuq.f(hdpo0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdpp)hftp0.b_message).c = hdpo0.f;
        ((hdpp)hftp0.b_message).b |= 1;
    }
}

