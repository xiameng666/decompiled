public final class hcmd {
    private final ProtoLiteBuilder a;

    public hcmd(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hcmg a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hcmg)hftv0;
    }

    public final void b(hcmf hcmf0) {
        ibuq.f(hcmf0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hcmg)hftp0.b_message).c = hcmf0.h;
        ((hcmg)hftp0.b_message).b |= 1;
    }
}

