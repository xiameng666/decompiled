public final class hkkm {
    private final ProtoLiteBuilder a;

    public hkkm(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hkkk a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hkkk)hftv0;
    }

    public final void b(long v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hkkk)hftp0.b_message).b = v;
    }
}

