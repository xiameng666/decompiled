public final class hdpv {
    public final ProtoLiteBuilder a;

    public hdpv(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdqp a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdqp)hftv0;
    }

    public final void b(hdqj hdqj0) {
        ibuq.f(hdqj0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdqp)hftp0.b_message).g = hdqj0.g;
        ((hdqp)hftp0.b_message).b |= 16;
    }

    public final void c() {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdqp.b(((hdqp)hftp0.b_message));
    }
}

