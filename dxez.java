public final class dxez {
    private final ProtoLiteBuilder a;

    public dxez(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final dxet a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (dxet)hftv0;
    }

    public final void b(boolean z) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dxet)hftp0.b_message).c = z;
    }
}

