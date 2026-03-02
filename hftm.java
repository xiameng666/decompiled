public final class hftm {
    private final ProtoLiteBuilder a;

    public hftm(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hftk a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hftk)hftv0;
    }

    public final void b() {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hftk)hftp0.b_message).b = 1.0f;
    }
}

