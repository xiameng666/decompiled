public final class hdzb {
    private final ProtoLiteBuilder a;

    public hdzb(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdzg a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdzg)hftv0;
    }

    public final void b(hdzf hdzf0) {
        ibuq.f(hdzf0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdzg)hftp0.b_message).h = hdzf0.d;
        ((hdzg)hftp0.b_message).b |= 0x20;
    }
}

