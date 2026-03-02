public final class gioi {
    private final ProtoLiteBuilder a;

    public gioi(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gkao a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gkao)hftv0;
    }

    public final void b(boolean z) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkao gkao0 = (gkao)hftp0.b_message;
        gkao0.b |= 1;
        gkao0.c = z;
    }

    public final void c(boolean z) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkao gkao0 = (gkao)hftp0.b_message;
        gkao0.b |= 2;
        gkao0.d = z;
    }
}

