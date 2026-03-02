public final class ftos {
    private final ProtoLiteBuilder a;

    public ftos(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final ftoq a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (ftoq)hftv0;
    }

    public final void b(boolean z) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ftoq)hftp0.b_message).r = z;
    }
}

