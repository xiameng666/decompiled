public final class hdpr {
    private final ProtoLiteBuilder a;

    public hdpr(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdqh a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdqh)hftv0;
    }

    public final void b(hdsn hdsn0) {
        ibuq.f(hdsn0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdqh hdqh0 = (hdqh)hftp0.b_message;
        hdsn0.getClass();
        hdqh0.d = hdsn0;
        hdqh0.b |= 2;
    }

    public final void c(hdsn hdsn0) {
        ibuq.f(hdsn0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdqh hdqh0 = (hdqh)hftp0.b_message;
        hdsn0.getClass();
        hdqh0.f = hdsn0;
        hdqh0.b |= 8;
    }

    public final void d(hdsn hdsn0) {
        ibuq.f(hdsn0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdqh hdqh0 = (hdqh)hftp0.b_message;
        hdsn0.getClass();
        hdqh0.e = hdsn0;
        hdqh0.b |= 4;
    }

    public final void e(hdsn hdsn0) {
        ibuq.f(hdsn0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdqh hdqh0 = (hdqh)hftp0.b_message;
        hdsn0.getClass();
        hdqh0.c = hdsn0;
        hdqh0.b |= 1;
    }
}

