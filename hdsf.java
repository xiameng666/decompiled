public final class hdsf {
    private final ProtoLiteBuilder a;

    public hdsf(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdsi a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdsi)hftv0;
    }

    public final void b(hdsh hdsh0) {
        ibuq.f(hdsh0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdsi)hftp0.b_message).c = hdsh0.f;
        ((hdsi)hftp0.b_message).b |= 1;
    }

    public final void c(hdsn hdsn0) {
        ibuq.f(hdsn0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdsi hdsi0 = (hdsi)hftp0.b_message;
        hdsn0.getClass();
        hdsi0.d = hdsn0;
        hdsi0.b |= 2;
    }
}

