public final class gijw {
    public final ProtoLiteBuilder a;

    public gijw(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gikf a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gikf)hftv0;
    }

    public final void b(gike gike0) {
        ibuq.f(gike0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gikf)hftp0.b_message).c = gike0.e;
        ((gikf)hftp0.b_message).b |= 1;
    }
}

