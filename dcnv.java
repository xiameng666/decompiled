public final class dcnv {
    private final ProtoLiteBuilder a;

    public dcnv(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final dcjz a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (dcjz)hftv0;
    }

    public final void b(boolean z) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dcjz dcjz0 = (dcjz)hftp0.b_message;
        dcjz0.b |= 2;
        dcjz0.d = z;
    }

    public final void c(String s) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dcjz dcjz0 = (dcjz)hftp0.b_message;
        dcjz0.b |= 1;
        dcjz0.c = s;
    }
}

