public final class ghyp {
    private final ProtoLiteBuilder a;

    public ghyp(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final ghys a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (ghys)hftv0;
    }

    public final void b(giao giao0) {
        ibuq.f(giao0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        giao0.getClass();
        ghys0.ay = giao0;
        ghys0.d |= 0x10000000;
    }

    public final void c(gidi gidi0) {
        ibuq.f(gidi0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gidi0.getClass();
        ghys0.az = gidi0;
        ghys0.d |= 0x20000000;
    }
}

