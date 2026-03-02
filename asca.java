public final class asca {
    private final ProtoLiteBuilder a;

    public asca(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final asby a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (asby)hftv0;
    }

    public final void b(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asby asby0 = (asby)hftp0.b_message;
        s.getClass();
        asby0.b |= 1;
        asby0.e = s;
    }

    public final void c(ascx ascx0) {
        ibuq.f(ascx0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asby asby0 = (asby)hftp0.b_message;
        ascx0.getClass();
        asby0.d = ascx0;
        asby0.c = 106;
    }
}

