public final class gjzn {
    public final ProtoLiteBuilder a;

    public gjzn(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gkbd a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gkbd)hftv0;
    }

    public final void b(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkbd gkbd0 = (gkbd)hftp0.b_message;
        gkbd0.b |= 1;
        gkbd0.c = v;
    }

    public final void c(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkbd gkbd0 = (gkbd)hftp0.b_message;
        gkbd0.b |= 8;
        gkbd0.f = v;
    }
}

