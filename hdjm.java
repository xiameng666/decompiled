public final class hdjm {
    private final ProtoLiteBuilder a;

    public hdjm(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdjn a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdjn)hftv0;
    }

    public final void b(hdkg hdkg0) {
        ibuq.f(hdkg0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdjn)hftp0.b_message).c = hdkg0.e;
        ((hdjn)hftp0.b_message).b |= 1;
    }
}

