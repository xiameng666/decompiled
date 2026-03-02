public final class grjn {
    public final ProtoLiteBuilder a;

    public grjn(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final grjl a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (grjl)hftv0;
    }

    public final void b(grnp grnp0) {
        ibuq.f(grnp0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grjl grjl0 = (grjl)hftp0.b_message;
        grnp0.getClass();
        grjl0.c = grnp0;
        grjl0.b |= 1;
    }
}

