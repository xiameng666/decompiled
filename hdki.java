public final class hdki {
    private final ProtoLiteBuilder a;

    public hdki(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdjg a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdjg)hftv0;
    }

    public final void b(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdjg hdjg0 = (hdjg)hftp0.b_message;
        s.getClass();
        hdjg0.c = 1;
        hdjg0.d = s;
    }

    public final void c(hdjf hdjf0) {
        ibuq.f(hdjf0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdjg)hftp0.b_message).e = hdjf0.d;
        ((hdjg)hftp0.b_message).b |= 1;
    }
}

