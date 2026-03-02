public final class gyvg {
    public final ProtoLiteBuilder a;

    public gyvg(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gyve a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gyve)hftv0;
    }

    public final void b(gyvd gyvd0) {
        ibuq.f(gyvd0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyve gyve0 = (gyve)hftp0.b_message;
        gyvd0.getClass();
        gyve0.g = gyvd0;
        gyve0.b |= 1;
    }

    public final void c(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyve gyve0 = (gyve)hftp0.b_message;
        s.getClass();
        gyve0.d = s;
    }

    public final void d(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyve gyve0 = (gyve)hftp0.b_message;
        s.getClass();
        gyve0.c = s;
    }
}

