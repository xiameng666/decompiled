public final class hcxe {
    private final ProtoLiteBuilder a;

    public hcxe(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hcxf a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hcxf)hftv0;
    }

    public final void b(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcxf hcxf0 = (hcxf)hftp0.b_message;
        s.getClass();
        hcxf0.b |= 1;
        hcxf0.c = s;
    }
}

