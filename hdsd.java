public final class hdsd {
    private final ProtoLiteBuilder a;

    public hdsd(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdsj a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdsj)hftv0;
    }

    public final void b(hdsn hdsn0) {
        ibuq.f(hdsn0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdsj hdsj0 = (hdsj)hftp0.b_message;
        hdsn0.getClass();
        hdsj0.f = hdsn0;
        hdsj0.b |= 8;
    }

    public final void c(hdsn hdsn0) {
        ibuq.f(hdsn0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdsj hdsj0 = (hdsj)hftp0.b_message;
        hdsn0.getClass();
        hdsj0.e = hdsn0;
        hdsj0.b |= 4;
    }

    public final void d(hdsn hdsn0) {
        ibuq.f(hdsn0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdsj hdsj0 = (hdsj)hftp0.b_message;
        hdsn0.getClass();
        hdsj0.d = hdsn0;
        hdsj0.b |= 2;
    }

    public final void e(hdsn hdsn0) {
        ibuq.f(hdsn0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdsj hdsj0 = (hdsj)hftp0.b_message;
        hdsn0.getClass();
        hdsj0.c = hdsn0;
        hdsj0.b |= 1;
    }
}

