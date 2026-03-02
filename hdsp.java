public final class hdsp {
    private final ProtoLiteBuilder a;

    public hdsp(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdtf a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdtf)hftv0;
    }

    public final void b(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdtf hdtf0 = (hdtf)hftp0.b_message;
        hdtf0.b |= 1;
        hdtf0.e = v;
    }

    public final void c(hdsn hdsn0) {
        ibuq.f(hdsn0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdtf hdtf0 = (hdtf)hftp0.b_message;
        hdsn0.getClass();
        hdtf0.d = hdsn0;
        hdtf0.c = 2;
    }

    public final void d(hdsj hdsj0) {
        ibuq.f(hdsj0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdtf hdtf0 = (hdtf)hftp0.b_message;
        hdsj0.getClass();
        hdtf0.d = hdsj0;
        hdtf0.c = 17;
    }

    public final void e(hdtc hdtc0) {
        ibuq.f(hdtc0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdtf hdtf0 = (hdtf)hftp0.b_message;
        hdtc0.getClass();
        hdtf0.o = hdtc0;
        hdtf0.b |= 0x400;
    }

    public final void f(hdtc hdtc0) {
        ibuq.f(hdtc0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdtf hdtf0 = (hdtf)hftp0.b_message;
        hdtc0.getClass();
        hdtf0.k = hdtc0;
        hdtf0.b |= 0x40;
    }

    public final void g(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdtf hdtf0 = (hdtf)hftp0.b_message;
        hdtf0.b |= 0x800;
        hdtf0.p = v;
    }
}

