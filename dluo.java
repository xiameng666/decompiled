public final class dluo {
    private final ProtoLiteBuilder a;

    public dluo(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final dlul a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (dlul)hftv0;
    }

    public final void b(hjrn hjrn0) {
        ibuq.f(hjrn0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dlul dlul0 = (dlul)hftp0.b_message;
        hjrn0.getClass();
        dlul0.d = hjrn0;
        dlul0.b |= 1;
    }
}

