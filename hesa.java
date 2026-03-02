public final class hesa {
    public final ProtoLiteBuilder a;

    public hesa(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hery a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hery)hftv0;
    }

    public final void b(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hery hery0 = (hery)hftp0.b_message;
        s.getClass();
        hery0.b |= 0x40;
        hery0.l = s;
    }

    public final void c(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hery hery0 = (hery)hftp0.b_message;
        s.getClass();
        hery0.b |= 0x20;
        hery0.k = s;
    }
}

