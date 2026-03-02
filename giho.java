public final class giho {
    private final ProtoLiteBuilder a;

    public giho(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gikb a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gikb)hftv0;
    }

    public final void b(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gikb gikb0 = (gikb)hftp0.b_message;
        gikb0.b |= 1;
        gikb0.c = v;
    }
}

