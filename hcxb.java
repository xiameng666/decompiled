public final class hcxb {
    private final ProtoLiteBuilder a;

    public hcxb(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hcxk a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hcxk)hftv0;
    }

    public final void b(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcxk hcxk0 = (hcxk)hftp0.b_message;
        s.getClass();
        hcxk0.b |= 1;
        hcxk0.c = s;
    }
}

