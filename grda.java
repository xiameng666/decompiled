public final class grda {
    private final ProtoLiteBuilder a;

    public grda(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final grcy a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (grcy)hftv0;
    }

    public final void b(ByteString hfsf0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((grcy)hftp0.b_message).b = hfsf0;
    }

    public final void c() {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((grcy)hftp0.b_message).c = 26;
    }
}

