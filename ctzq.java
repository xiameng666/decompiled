public final class ctzq {
    private final ProtoLiteBuilder a;

    public ctzq(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final ctza a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (ctza)hftv0;
    }

    public final void b(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ctza ctza0 = (ctza)hftp0.b_message;
        s.getClass();
        ctza0.b |= 1;
        ctza0.c = s;
    }

    public final void c(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ctza ctza0 = (ctza)hftp0.b_message;
        s.getClass();
        ctza0.b |= 2;
        ctza0.d = s;
    }
}

