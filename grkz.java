public final class grkz {
    private final ProtoLiteBuilder a;

    public grkz(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final grku a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (grku)hftv0;
    }

    public final void b(grkv grkv0) {
        ibuq.f(grkv0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grku grku0 = (grku)hftp0.b_message;
        grkv0.getClass();
        grku0.d = grkv0;
        grku0.b |= 2;
    }

    public final void c(gqub gqub0) {
        ibuq.f(gqub0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((grku)hftp0.b_message).c = gqub0.mk;
        ((grku)hftp0.b_message).b |= 1;
    }
}

