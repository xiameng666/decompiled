public final class ftmm {
    private final ProtoLiteBuilder a;

    public ftmm(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final ftlx a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (ftlx)hftv0;
    }

    public final void b(boolean z) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ftlx)hftp0.b_message).c = z;
    }

    public final void c(ftkn ftkn0) {
        ibuq.f(ftkn0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftlx ftlx0 = (ftlx)hftp0.b_message;
        ftlx0.b = ftkn0.a();
    }
}

