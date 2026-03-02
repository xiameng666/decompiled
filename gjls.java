public final class gjls {
    private final ProtoLiteBuilder a;

    public gjls(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gjlu a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gjlu)hftv0;
    }

    public final void b(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjlu gjlu0 = (gjlu)hftp0.b_message;
        gjlu0.b |= 2;
        gjlu0.d = v;
    }

    public final void c(gjlw gjlw0) {
        ibuq.f(gjlw0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjlu)hftp0.b_message).c = gjlw0.f;
        ((gjlu)hftp0.b_message).b |= 1;
    }
}

