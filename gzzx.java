public final class gzzx {
    private final ProtoLiteBuilder a;

    public gzzx(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final haan a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (haan)hftv0;
    }

    public final void b(haam haam0) {
        ibuq.f(haam0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        haan haan0 = (haan)hftp0.b_message;
        haan0.b = haam0.a();
    }

    public final void c(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((haan)hftp0.b_message).c = v;
    }
}

