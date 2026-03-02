public final class hctc {
    private final ProtoLiteBuilder a;

    public hctc(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hctd a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hctd)hftv0;
    }

    public final void b(hdrl hdrl0) {
        ibuq.f(hdrl0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hctd hctd0 = (hctd)hftp0.b_message;
        hdrl0.getClass();
        hctd0.c = hdrl0;
        hctd0.b |= 1;
    }
}

