public final class hktj {
    private final ProtoLiteBuilder a;

    public hktj(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hktd a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hktd)hftv0;
    }

    public final void b(ByteString hfsf0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hktd)hftp0.b_message).b = hfsf0;
    }

    public final void c() {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hktd)hftp0.b_message).c = true;
    }
}

