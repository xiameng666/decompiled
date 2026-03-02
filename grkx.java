public final class grkx {
    public final ProtoLiteBuilder a;

    public grkx(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final grkv a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (grkv)hftv0;
    }

    public final void b(grjl grjl0) {
        ibuq.f(grjl0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp0.b_message;
        grjl0.getClass();
        grkv0.h = grjl0;
        grkv0.b |= 8;
    }

    public final void c(grmw grmw0) {
        ibuq.f(grmw0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp0.b_message;
        grmw0.getClass();
        grkv0.y = grmw0;
        grkv0.d |= 0x20000;
    }
}

