public final class hdic {
    public final ProtoLiteBuilder a;

    public hdic(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdif a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdif)hftv0;
    }

    public final void b(hdih hdih0) {
        ibuq.f(hdih0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdif)hftp0.b_message).c = (int)hdih0.B;
        ((hdif)hftp0.b_message).b = 5;
    }
}

