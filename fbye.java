public final class fbye {
    private final ProtoLiteBuilder a;

    public fbye(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final fbyf a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (fbyf)hftv0;
    }

    public final void b(fbyi fbyi0) {
        ibuq.f(fbyi0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fbyf fbyf0 = (fbyf)hftp0.b_message;
        fbyf0.b = fbyi0.a();
    }

    public final void c(ByteString hfsf0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((fbyf)hftp0.b_message).c = hfsf0;
    }
}

