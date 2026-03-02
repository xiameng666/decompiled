public final class hdke {
    public final ProtoLiteBuilder a;

    public hdke(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdja a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdja)hftv0;
    }

    public final void b(hdjg hdjg0) {
        ibuq.f(hdjg0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdja hdja0 = (hdja)hftp0.b_message;
        hdjg0.getClass();
        hdja0.d = hdjg0;
        hdja0.c = 4;
    }

    public final void c(hdiy hdiy0) {
        ibuq.f(hdiy0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdja)hftp0.b_message).e = hdiy0.f;
        ((hdja)hftp0.b_message).b |= 1;
    }
}

