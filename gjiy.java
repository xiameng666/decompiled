public final class gjiy {
    public final ProtoLiteBuilder a;

    public gjiy(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gkbc a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gkbc)hftv0;
    }

    public final void b(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkbc gkbc0 = (gkbc)hftp0.b_message;
        s.getClass();
        gkbc0.b |= 4;
        gkbc0.e = s;
    }

    public final void c(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkbc gkbc0 = (gkbc)hftp0.b_message;
        s.getClass();
        gkbc0.b |= 2;
        gkbc0.d = s;
    }

    public final void d(gkbb gkbb0) {
        ibuq.f(gkbb0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gkbc)hftp0.b_message).c = gkbb0.d;
        ((gkbc)hftp0.b_message).b |= 1;
    }
}

