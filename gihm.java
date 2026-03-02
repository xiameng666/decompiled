public final class gihm {
    private final ProtoLiteBuilder a;

    public gihm(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gijz a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gijz)hftv0;
    }

    public final void b(gikb gikb0) {
        ibuq.f(gikb0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gijz gijz0 = (gijz)hftp0.b_message;
        gikb0.getClass();
        gijz0.c = gikb0;
        gijz0.b = 2;
    }
}

