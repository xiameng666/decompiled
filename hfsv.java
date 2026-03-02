public final class hfsv {
    private final ProtoLiteBuilder a;

    public hfsv(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hfst a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hfst)hftv0;
    }

    public final void b(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfst)hftp0.b_message).c = v;
    }

    public final void c(long v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfst)hftp0.b_message).b = v;
    }
}

