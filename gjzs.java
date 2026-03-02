public final class gjzs {
    public final ProtoLiteBuilder a;

    public gjzs(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gkbe a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gkbe)hftv0;
    }

    public final void b(gkaj gkaj0) {
        ibuq.f(gkaj0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkbe gkbe0 = (gkbe)hftp0.b_message;
        gkaj0.getClass();
        gkbe0.f = gkaj0;
        gkbe0.b |= 8;
    }

    public final void c(gkaz gkaz0) {
        ibuq.f(gkaz0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkbe gkbe0 = (gkbe)hftp0.b_message;
        gkaz0.getClass();
        gkbe0.e = gkaz0;
        gkbe0.b |= 4;
    }

    public final void d(gkbc gkbc0) {
        ibuq.f(gkbc0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkbe gkbe0 = (gkbe)hftp0.b_message;
        gkbc0.getClass();
        gkbe0.n = gkbc0;
        gkbe0.b |= 0x800;
    }

    public final void e(gkbd gkbd0) {
        ibuq.f(gkbd0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkbe gkbe0 = (gkbe)hftp0.b_message;
        gkbd0.getClass();
        gkbe0.l = gkbd0;
        gkbe0.b |= 0x200;
    }
}

