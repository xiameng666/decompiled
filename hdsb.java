public final class hdsb {
    private final ProtoLiteBuilder a;

    public hdsb(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdri a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdri)hftv0;
    }

    public final void b(hdrh hdrh0) {
        ibuq.f(hdrh0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdri)hftp0.b_message).c = hdrh0.e;
        ((hdri)hftp0.b_message).b |= 1;
    }

    public final void c(hdrh hdrh0) {
        ibuq.f(hdrh0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdri)hftp0.b_message).e = hdrh0.e;
        ((hdri)hftp0.b_message).b |= 4;
    }
}

